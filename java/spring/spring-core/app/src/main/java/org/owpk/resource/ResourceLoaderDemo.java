package org.owpk.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Component;

@Component
public class ResourceLoaderDemo {

    @Autowired
    private ApplicationContext ctx;

    public Resource loadResource(String path) {
        return ctx.getResource(path);
    }
}
