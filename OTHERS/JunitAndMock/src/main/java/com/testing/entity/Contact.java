package com.testing.entity;

public class Contact {

	private Integer contatctid;
	private String contactname;
	private long contactNumber;
	public Contact() {
		super();
	}
	public Contact(Integer contatctid, String contactname, long contactNumber) {
		super();
		this.contatctid = contatctid;
		this.contactname = contactname;
		this.contactNumber = contactNumber;
	}
	public Integer getContatctid() {
		return contatctid;
	}
	public void setContatctid(Integer contatctid) {
		this.contatctid = contatctid;
	}
	public String getContactname() {
		return contactname;
	}
	public void setContactname(String contactname) {
		this.contactname = contactname;
	}
	public long getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(long contactNumber) {
		this.contactNumber = contactNumber;
	}
	@Override
	public String toString() {
		return "Contact [contatctid=" + contatctid + ", contactname=" + contactname + ", contactNumber=" + contactNumber
				+ "]";
	}
 
	 
	
}