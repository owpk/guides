var stomp = null;

// подключаемся к серверу по окончании загрузки страницы
window.onload = function() {
    connect();
}

function connect() {
    var socket = new SockJS('/socket');
    stomp = Stomp.over(socket);
    stomp.connect({}, function (frame) {
        console.log('Connected: ' + frame);
        stomp.subscribe('/topic/items', function (item) {
        renderItem(JSON.parse(item.body).content);
        });
    });
}

// хук на интерфейс
$(function () {
    $("form").on('submit', function (e) {
        e.preventDefault();
    });
    $( "#send" ).click(function() { sendContent(); });
});

// отправка сообщения на сервер
function sendContent() {
    stomp.send("/app/item", {}, JSON.stringify({'content':
    $("#content").val()}));
}

// рендер сообщения, полученного от сервера
function renderItem(text) {
    $("#list").append("<li style='color: red'>" + text + "</li>");
}