package org.owpk;

import org.owpk.event.publisher.Publisher;
import org.owpk.profile.mock.ConfigA;
import org.owpk.resource.Mock;
import org.owpk.resource.ResourceLoaderDemo;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Import;
import org.owpk.profile.mock.ConfigB;

import org.owpk.configuration.MainConfiguration;
import org.owpk.configuration.AnotherConfig;

import java.io.IOException;
import java.nio.file.Files;

@Import({MainConfiguration.class, AnotherConfig.class})
public class App implements BeanPostProcessor {

    public static void main(String[] args) throws IOException {
        var ctx = new AnnotationConfigApplicationContext();
        ctx.getEnvironment().setActiveProfiles("dev");
        ctx.register(App.class);
        ctx.refresh();

        // profile
        System.out.println(" [ PROFILE ]");
        var cfg1= ctx.getBean(ConfigB.class);
        System.out.println(cfg1.configure());
        var props = ctx.getBean(ConfigA.class);
        System.out.println(props.configure());

        //event
        System.out.println("[ EVENT ]");
        var publisher = ctx.getBean(Publisher.class);
        publisher.sendMsg("Msg sent: some msg");

        // resource
        System.out.println("[ RESOURCE ]");
        var res = ctx.getBean(ResourceLoaderDemo.class).loadResource("classpath:/file.txt");
        System.out.println(res);
        System.out.println("exists: " + res.exists());
        if (res.exists())
            Files.readAllLines(res.getFile().toPath()).forEach(System.out::println);
        var resMockBean = ctx.getBean(Mock.class);
        resMockBean.getContent();

        // validating

    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("initializing bean: " + beanName);
        return bean;
    }
}
