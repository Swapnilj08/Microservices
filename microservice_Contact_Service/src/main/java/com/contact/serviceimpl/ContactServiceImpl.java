package com.contact.serviceimpl;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.contact.entity.Contact;
import com.contact.service.ContactService;
@Service
public class ContactServiceImpl implements ContactService{

	private List<Contact> contact=  List.of(
			
			new Contact(1L, "swapnil@gmail.com", "swapnil", 11L),
			new Contact(2L, "joshi@gmail.com", "swapnil", 12L),
			new Contact(3L, "akash@gmail.com", "swapnil", 13L),
			new Contact(4L, "manik@gmail.com", "swapnil", 11L),
			new Contact(5L, "siddhesh@gmail.com", "swapnil", 12L)
			
			);
	
	
	
	@Override
	public List<Contact> getContact(Long id) {
		// TODO Auto-generated method stub
		return contact.stream().filter(contact->contact.getuId().equals(id)).collect(Collectors.toList()) ;
		 
	}

}
