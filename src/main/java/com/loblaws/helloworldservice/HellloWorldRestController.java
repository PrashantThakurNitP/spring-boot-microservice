package com.loblaws.helloworldservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HellloWorldRestController {
	
	@GetMapping(value = "/hello")
	public String sayHello() {
		return "Hello Actuator";
	}

}
