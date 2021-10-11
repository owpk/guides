package org.owpk;

import org.owpk.weaving.MyLoadTimeWeaverImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.*;
import org.springframework.core.env.Environment;
import org.springframework.instrument.classloading.LoadTimeWeaver;

import java.util.Arrays;

@Configuration
@ComponentScan("org.owpk")
@PropertySource("custom.properties")
@EnableLoadTimeWeaving
public class MainConfiguration implements LoadTimeWeavingConfigurer {

    @Autowired
    private Environment env;

    @Bean(name = "dowork")
    public String doWork() {
        return "Appconfig";
    }

    @Bean(initMethod = "postConstruct")
    @Scope("prototype")
    public SomeService someService(MyService myService) {
        return new SomeService(Arrays.toString(env.getActiveProfiles()), myService);
    }

    @Bean(name = "myService")
    public MyService myServiceBean() {
        return new MyService();
    }

    @Override
    public LoadTimeWeaver getLoadTimeWeaver() {
        return new MyLoadTimeWeaverImpl();
    }

    public static class MyService {
        public void hello() {
            System.out.println("hello");
        }
    }

    public static class SomeService {
        private String name;
        private MyService myService;

        public SomeService(String name, MyService myService) {
            this.myService = myService;
            this.name = name;
        }

        public void postConstruct() {
            System.out.println("bean constructed: " + this.getClass());
        }

        public void doSomething() {
            System.out.println("----------");
            myService.hello();
            System.out.println(name);
        }
    }
}