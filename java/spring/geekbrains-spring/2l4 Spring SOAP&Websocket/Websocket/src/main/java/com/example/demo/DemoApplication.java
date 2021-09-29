package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.AbstractWebSocketMessageBrokerConfigurer;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Configuration
	@EnableWebSocketMessageBroker
	public class WebSocketConfig extends
			AbstractWebSocketMessageBrokerConfigurer {
		// имя сокета (аналог TCP-сокета)
		@Override
		public void registerStompEndpoints(StompEndpointRegistry registry) {
			registry.addEndpoint("/socket").withSockJS();
		}

		@Override
		public void configureMessageBroker(MessageBrokerRegistry config) {
			// префикс отправителя
			config.enableSimpleBroker("/topic");
			// префикс получателя
			config.setApplicationDestinationPrefixes("/app");
		}
	}

}
