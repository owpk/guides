package test.entities;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.io.StringWriter;
import java.util.List;

public class App {
    public static void main(String[] args) throws IOException {
        var en1 = new Entity1();
        en1.setName("en1");

        var utilEntity = new UtilEntity("Util1");

        var en2 = new Entity2();
        en2.setName("en2");
        en2.setUtil(utilEntity);
        en2.setEntity3s(List.of(new Entity3("en3")));
        en1.setUtil(utilEntity);
        en1.setEntity2s(List.of(en2));

        var valueObj = new ValueObject(List.of(en1));
        var objMapper = new ObjectMapper();
        var writer = new StringWriter();
        objMapper.writerWithDefaultPrettyPrinter().writeValue(writer, valueObj);
        System.out.println(writer);
    }
}
