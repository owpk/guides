package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MvcController {
    private final List<Item> items = new ArrayList<>();

    @ModelAttribute("items") // 1 Добавляем модель в представление — это потребуется
    // при рендере после перезагрузки страницы.
    public List<Item> getItems() {
        return items;
    }

    @RequestMapping({"/", "/index.html"}) // 2 Определяем представление — классический MVC.
    public String get() {
        return "index";
    }

    // 3 Определяем конечную точку контроллера обмена STOMP-сообщениями (не путать с MVC).
    @MessageMapping("/item") // вход — канал, куда JS-клиент отправляет сообщения
    @SendTo("/topic/items") // выход — канал, на который подписывается JS-клиент
    public Item addItem(Item item) throws Exception {
        items.add(item);
        return item;
    }

    @RequestMapping(value = "/", method = RequestMethod.PUT)
    public ResponseEntity<?> put(@RequestBody String body) throws Exception {
        if (body != null && !body.trim().isEmpty()) {
            Item item = new Item(body);
            items.add(item);
            // оповещаем WebSocket-клиентов
            sendItem(item);
            return new ResponseEntity<>(HttpStatus.CREATED);
        }
        else {
            return new ResponseEntity<>(HttpStatus.NOT_ACCEPTABLE);
        }
    }

    @Autowired
    private SimpMessagingTemplate template;
    private void sendItem(Item item) {
        this.template.convertAndSend("/topic/items", item);
    }
}
