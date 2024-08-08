package com.example.Springcloudeurekaclientdemo;

import java.util.ArrayList;

public class Response {
	Integer code;
	String message;
	ArrayList<Product> products;
	
	public Response()
	{
		
	}

	public Integer getCode() {
		return code;
	}

	@Override
	public String toString() {
		return "Response [code=" + code + ", message=" + message + ", products=" + products + "]";
	}

	public Response(Integer code, String message, ArrayList<Product> products) {
		super();
		this.code = code;
		this.message = message;
		this.products = products;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public ArrayList<Product> getProducts() {
		return products;
	}

	public void setProducts(ArrayList<Product> products) {
		this.products = products;
	}
}
