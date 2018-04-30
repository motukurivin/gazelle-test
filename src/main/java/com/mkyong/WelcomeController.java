package com.mkyong;

import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeController {

	// inject via application.properties
	@Value("${welcome.message:test}")
	private String welcomeMessage = "Hello World";
	private String page1Message = "Hello Page1";

	@RequestMapping("/")
	public String welcome(Map<String, Object> model) {
		model.put("message", this.welcomeMessage);
		return "welcome";
	}
	
	@RequestMapping("/page1")
	public String page1(Map<String, Object> model) {
		model.put("message", this.page1Message);
		return "page1";
	}

}