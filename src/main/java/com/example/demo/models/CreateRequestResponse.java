package com.example.demo.models;

public class CreateRequestResponse {

	private String status;
	private DataRequest data;
	
	public CreateRequestResponse() {
		
	}
	public CreateRequestResponse(String status, DataRequest data) {
		super();
		this.status = status;
		this.data = data;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public DataRequest getData() {
		return data;
	}
	public void setData(DataRequest data) {
		this.data = data;
	}
	@Override
	public String toString() {
		return "CreateRequestResponse [status=" + status + ", data=" + data + "]";
	}
	
}
