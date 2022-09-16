package org.owpk;

import ansi.ANSIJava;
import ansi.Color;
import org.owpk.aop.SomeClass;
import org.owpk.aop.User;
import org.owpk.configuration.MainConfiguration;
import org.owpk.event.publisher.Publisher;
import org.owpk.profile.mock.ConfigA;
import org.owpk.profile.mock.ConfigB;
import org.owpk.resource.Mock;
import org.owpk.resource.ResourceLoaderDemo;
import org.owpk.spel.SpelExample;
import org.owpk.validating.MockPerson;
import org.owpk.validating.PersonValidator;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Import;
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
        createHeader("profile");
        var cfg1= ctx.getBean(ConfigB.class);
        System.out.println(cfg1.configure());
        var props = ctx.getBean(ConfigA.class);
        System.out.println(props.configure());
        System.out.println(props.getName());

        //event
        createHeader("event");
        var publisher = ctx.getBean(Publisher.class);
        publisher.sendMsg("Msg sent: some msg");

        // resource
        createHeader("resource");
        var res = ctx.getBean(ResourceLoaderDemo.class).loadResource("classpath:/file.txt");
        System.out.println(res);
        System.out.println("exists: " + res.exists());
        if (res.exists())
            Files.readAllLines(res.getFile().toPath()).forEach(System.out::println);
        var resMockBean = ctx.getBean(Mock.class);
        resMockBean.getContent();

        // validating
        createHeader("validating");
        var personValidator = ctx.getBean(PersonValidator.class);
        personValidator.supports(MockPerson.class);
        var mapBindingsResult = new MapBindingResult(Collections.emptyMap(), "org.owpk.validating.MockPerson");
        personValidator.validate(new MockPerson("", "some wrong Property"), mapBindingsResult);
        mapBindingsResult.getAllErrors().forEach(System.out::println);

        // spel
        createHeader("spel (spring expression language)");
        var spelExampleBean = ctx.getBean(SpelExample.class);
        spelExampleBean.parseExpression();
        spelExampleBean.printDefaultSystemArch();

        // aop
        createHeader("aop");
        var someClass = ctx.getBean(SomeClass.class);
        someClass.transfer("Hello");
        someClass.hello("Aboba", new User("Username"));
        var user = new User("");
        someClass.hello("NullUser", user);
        System.out.println(user);

        // buffers
        createHeader("buffers");
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("initializing bean: " + beanName);
        return bean;
    }

    private static void createHeader(String name) {
        System.out.println(ANSIJava.colorize(name, Color.BLUE, "%n[ %S ]"));
    }
}
