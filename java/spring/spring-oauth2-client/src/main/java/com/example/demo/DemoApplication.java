package com.example.demo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.Map;


@SpringBootApplication
@RestController
@Slf4j
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@GetMapping("/user")
	public Map<String, Object> user(@AuthenticationPrincipal OAuth2User principal) {
		principal.getAuthorities().forEach(x -> log.info("\n--auth: {}", x));
		principal.getAttributes().forEach((k,v) -> log.info("\n--attr: key-- {} : val-- {}", k,v));
		log.info("__PRICIPAL {}", principal);
		return Collections.singletonMap("name", principal.getAttribute("login"));
	}

//	@Bean
//	public OAuth2UserService<OAuth2UserRequest, OAuth2User> oauth2UserService(WebClient rest) {
//		DefaultOAuth2UserService delegate = new DefaultOAuth2UserService();
//		return request -> {
//			OAuth2User user = delegate.loadUser(request);
//			if (!"github".equals(request.getClientRegistration().getRegistrationId())) {
//				return user;
//			}
//
//			OAuth2AuthorizedClient client = new OAuth2AuthorizedClient
//					(request.getClientRegistration(), user.getName(), request.getAccessToken());
//			String url = user.getAttribute("organizations_url");
//			List<Map<String, Object>> orgs = rest
//					.get().uri(url)
//					.attributes(oauth2AuthorizedClient(client))
//					.retrieve()
//					.bodyToMono(List.class)
//					.block();
//
//			if (orgs.stream().anyMatch(org -> "spring-projects".equals(org.get("login")))) {
//				return user;
//			}
//
//			throw new OAuth2AuthenticationException(new OAuth2Error("invalid_token", "Not in Spring Team", ""));
//		};
//	}
//
//	@Bean
//	public WebClient rest(ClientRegistrationRepository clients, OAuth2AuthorizedClientRepository authz) {
//		ServletOAuth2AuthorizedClientExchangeFilterFunction oauth2 =
//				new ServletOAuth2AuthorizedClientExchangeFilterFunction(clients, authz);
//		return WebClient.builder()
//				.filter(oauth2).build();
//	}

}
