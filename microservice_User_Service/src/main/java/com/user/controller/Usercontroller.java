package com.user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.user.entity.Contacts;
import com.user.entity.User;
import com.user.service.UserService;

@RestController
@RequestMapping("/user")
public class Usercontroller {
	
	@Autowired
	private RestTemplate restTemplate;
	@Autowired
	private UserService userService;
	
	@GetMapping("/{userid}")
	public User getuser(@PathVariable("userid") Long id) {
		
		User user = this.userService.getUserlist(id);
		List contacts = this.restTemplate.getForObject("http://Contact-Service/contact/"+user.getUid(), List.class);
		
		
		user.setContacts(contacts);
		
		return user;
	}
	
}
