package test.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

//	@Bean
//	public DemoBean demoBean() {
//		return new DemoBean();
//	}

	@Autowired
	private AnnotationConfigApplicationContext ctx;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		ctx.register(DemoBean.class);
		var bean = ctx.getBean(DemoBean.class);
		System.out.println(bean);
	}
}
