package com.contact.entity;

public class Contact {
	private Long cid;
	private String emailId;
	private String contactName;
	private Long uId;

	public Contact(Long cid, String emailId, String contactName, Long uId) {
		super();
		this.cid = cid;
		this.emailId = emailId;
		this.contactName = contactName;
		this.uId = uId;
	}

	public Contact() {
		super();
	}

	public Long getCid() {
		return cid;
	}

	public void setCid(Long cid) {
		this.cid = cid;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getContactName() {
		return contactName;
	}

	public void setContactName(String contactName) {
		this.contactName = contactName;
	}

	public Long getuId() {
		return uId;
	}

	public void setuId(Long uId) {
		this.uId = uId;
	}

	@Override
	public String toString() {
		return "Contact [cid=" + cid + ", emailId=" + emailId + ", contactName=" + contactName + ", uId=" + uId + "]";
	}

}
