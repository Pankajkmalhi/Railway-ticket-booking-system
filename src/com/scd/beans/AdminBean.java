package com.scd.beans;
import java.io.*;
@SuppressWarnings("serial")
public class AdminBean implements Serializable{
	private String userName,password,firstName,lastName,address,emailId;
	private long num;
	public AdminBean() {}
	public void setUName(String Name)
	{
		userName=Name;
	}
	public String getUName()
	{
		return userName;
	}
	public void setPWord(String pwd)
	{
		password = pwd;
	}
	public String getPWord()
	{
		return password;
	}
	public void setFName(String fName)
	{
		firstName = fName;
	}
	public String getFName() {
		return firstName;
	}
	public void setLName(String lame)
	{
		lastName = lame;
	}
	public String getLName()
	{
		return lastName;
	}
	public void setAddr(String addres)
	{
		this.address = addres;
	}
	public String getAddr()
	{
		return address;
	}
	public void setMailId(String email)
	{
		emailId = email;
	}
	public String getMailId()
	{
		return emailId;
	}
	public void setPhNo(long phone)
	{
		num = phone;
	}
	public long getPhNo()
	{
		return num;
	}
}
