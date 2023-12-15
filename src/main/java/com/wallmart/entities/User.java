package com.wallmart.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "users")
public class User {

    @Id
    private String id;

    private int userId;
    private String zipcode;
    private String userName;
    private String emailId;
    private String mobile;
    private String address;
    
    public User(int userId, String zipcode, String userName, String emailId, String mobile, String address) {
        this.userId = userId;
        this.zipcode = zipcode;
        this.userName = userName;
        this.emailId = emailId;
        this.mobile = mobile;
        this.address = address;
    }

    
    public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

}
