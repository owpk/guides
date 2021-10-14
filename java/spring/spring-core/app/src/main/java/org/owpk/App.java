package org.owpk;

import org.owpk.event.publisher.Publisher;
import org.owpk.profile.mock.ConfigA;
import org.owpk.resource.Mock;
import org.owpk.resource.ResourceLoaderDemo;
import org.owpk.validating.MockPerson;
import org.owpk.validating.PersonValidator;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Import;
import org.owpk.profile.mock.ConfigB;

import org.owpk.configuration.MainConfiguration;
import org.springframework.validation.BindException;
import org.springframework.validation.MapBindingResult;

import java.io.IOException;
import java.nio.file.Files;
import java.util.Collections;

@Import({MainConfiguration.class})
public class App implements BeanPostProcessor {

    public static void main(String[] args) throws IOException {
        var ctx = new AnnotationConfigApplicationContext();
        ctx.getEnvironment().setActiveProfiles("dev");
        ctx.register(App.class);
        ctx.refresh();

        // profile
        System.out.println("\n[ PROFILE ]");
        var cfg1= ctx.getBean(ConfigB.class);
        System.out.println(cfg1.configure());
        var props = ctx.getBean(ConfigA.class);
        System.out.println(props.configure());
        System.out.println(props.getName());

        //event
        System.out.println("\n[ EVENT ]");
        var publisher = ctx.getBean(Publisher.class);
        publisher.sendMsg("Msg sent: some msg");

        // resource
        System.out.println("\n[ RESOURCE ]");
        var res = ctx.getBean(ResourceLoaderDemo.class).loadResource("classpath:/file.txt");
        System.out.println(res);
        System.out.println("exists: " + res.exists());
        if (res.exists())
            Files.readAllLines(res.getFile().toPath()).forEach(System.out::println);
        var resMockBean = ctx.getBean(Mock.class);
        resMockBean.getContent();

        // validating
        System.out.println("\n[ VALIDATING ]");
        var personValidator = ctx.getBean(PersonValidator.class);
        personValidator.supports(MockPerson.class);
        var mapBindingsResult = new MapBindingResult(Collections.emptyMap(), "org.owpk.validating.MockPerson");
        personValidator.validate(new MockPerson("", "some wrong Property"), mapBindingsResult);
        mapBindingsResult.getAllErrors().forEach(System.out::println);

        // spel
        System.out.println("\n[ SPEL (SPRING EXPRESSION LANGUAGE) ]");
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("initializing bean: " + beanName);
        return bean;
    }
}
