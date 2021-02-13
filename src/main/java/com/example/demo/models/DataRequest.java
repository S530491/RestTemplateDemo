package com.example.demo.models;

public class DataRequest extends CreateRequest {
	
	private int id;
	
	public DataRequest() {
		super();
	}
	public DataRequest(String name,String salary, String age) {
		super(name,salary,age);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "DataRequest [id=" + id + "]";
	}
	
	

}
