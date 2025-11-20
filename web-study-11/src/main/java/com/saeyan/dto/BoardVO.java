package com.saeyan.dto;

import java.sql.Timestamp;

/*
	 num	int
pass	varchar(30)
name	varchar(30)
email	varchar(30)
title	varchar(50)
content	varchar(1000)
readcount	int
writedate	datetime
	 */
public class BoardVO {
	
	private int num;
	private String pass;
	private String name;
	private String email;
	private String title;
	private String content;
	private String readcount;
	private Timestamp writedate;
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getReadcount() {
		return readcount;
	}
	public void setReadcount(String readcount) {
		this.readcount = readcount;
	}
	public Timestamp getWritedate() {
		return writedate;
	}
	public void setWritedate(Timestamp writeDate) {
		this.writedate = writeDate;
	}
	@Override
	public String toString() {
		return "BoardVO [num=" + num + ", pass=" + pass + ", name=" + name + ", email=" + email + ", title=" + title
				+ ", content=" + content + ", readcount=" + readcount + ", writedate=" + writedate + "]";
	}
	
}	
