package com.contact.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.contact.entity.Contact;

public interface ContactService {
public List<Contact> getContact(Long id);
}
