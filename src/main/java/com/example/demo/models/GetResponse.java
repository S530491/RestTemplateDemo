package com.example.demo.models;

public class GetResponse {

	private String status;
	private DataResponse data;
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public DataResponse getData() {
		return data;
	}
	public void setData(DataResponse data) {
		this.data = data;
	}
	@Override
	public String toString() {
		return "GetResponse [status=" + status + ", data=" + data + "]";
	}
	
}
