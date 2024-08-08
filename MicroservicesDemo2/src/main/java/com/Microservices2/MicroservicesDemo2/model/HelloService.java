package com.Microservices2.MicroservicesDemo2.model;

public class HelloService {
	private int count_min;
	private int count_max;

	public HelloService() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getCount_min() {
		return count_min;
	}

	public void setCount_min(int count_min) {
		this.count_min = count_min;
	}

	public int getCount_max() {
		return count_max;
	}

	public void setCount_max(int count_max) {
		this.count_max = count_max;
	}

	public HelloService(int count_min, int count_max) {
		super();
		this.count_min = count_min;
		this.count_max = count_max;
	}


}
