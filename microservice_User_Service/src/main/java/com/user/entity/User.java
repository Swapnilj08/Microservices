package com.user.entity;
import java.util.ArrayList;
import java.util.List;

public class User {
private Long uid;
private String uname;
private String phone;

List<Contacts> contacts=new ArrayList<Contacts>();

public User(Long uid, String uname, String phone, List<Contacts> contacts) {
	super();
	this.uid = uid;
	this.uname = uname;
	this.phone = phone;
	this.contacts = contacts;
}

public User(Long uid, String uname, String phone) {
	super();
	this.uid = uid;
	this.uname = uname;
	this.phone = phone;
}

public Long getUid() {
	return uid;
}

public void setUid(Long uid) {
	this.uid = uid;
}

public String getUname() {
	return uname;
}

public void setUname(String uname) {
	this.uname = uname;
}

public String getPhone() {
	return phone;
}

public void setPhone(String phone) {
	this.phone = phone;
}

public List<Contacts> getContacts() {
	return contacts;
}

public void setContacts(List<Contacts> contacts) {
	this.contacts = contacts;
}

@Override
public String toString() {
	return "User [uid=" + uid + ", uname=" + uname + ", phone=" + phone + ", contacts=" + contacts + "]";
}




}
