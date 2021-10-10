package org.owpk.resource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.nio.file.Files;

@Component
public class Mock {

    @Value("${template.file.path}")
    private Resource template;

    public void getContent() throws IOException {
        if (template.exists()) {
            Files.readAllLines(template.getFile().toPath()).forEach(System.out::println);
        }
    }
}
