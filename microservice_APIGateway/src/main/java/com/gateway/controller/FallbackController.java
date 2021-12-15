package com.gateway.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallbackController {
	
	@GetMapping("/userfallback")
	public String userfallback() {
		return"user service temperary unavailable";
	}
	
	
	@GetMapping("/contactServicefallback")
	public String contactfallback() {
		return"contact service temperary unavailable";
	}
}
