package com.user.serviceimpl;

import java.util.List;


import org.springframework.stereotype.Service;

import com.user.entity.User;
import com.user.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	List<User> users = List.of(
			new User(11L, "swapnil", "896"),
			new User(12L, "akash", "896"),
			new User(13L, "monik", "896")
			
			
			);

	@Override
	public User getUserlist(Long id) {
		// TODO Auto-generated method stub
		return users.stream().filter(usre->usre.getUid().equals(id)).findAny().orElse(null);
	}






}
