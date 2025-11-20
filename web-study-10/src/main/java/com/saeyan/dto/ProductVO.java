package com.saeyan.dto;
/*
 create table product(
	code int auto_increment key,
    name varchar(100),
    price int,
    pictureurl varchar(50),
    description varchar (1000)
 */

public class ProductVO {
	private Integer code;
	private String name;
	private Integer price;
	private String pictureUrl;
	private String description;
	public Integer getCode() {
		return code;
	}
	public void setCode(Integer code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	public String getPictureUrl() {
		return pictureUrl;
	}
	public void setPictureUrl(String pictureUrl) {
		this.pictureUrl = pictureUrl;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public String toString() {
		return "ProductVO [code=" + code + ", name=" + name + ", price=" + price + ", pictureUrl=" + pictureUrl
				+ ", description=" + description + "]";
	}

}
