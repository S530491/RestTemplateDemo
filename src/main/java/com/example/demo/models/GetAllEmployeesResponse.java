package com.example.demo.models;

import java.util.List;

public class GetAllEmployeesResponse {

	private String status;
	private List<DataResponse> data;
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public List<DataResponse> getData() {
		return data;
	}
	public void setData(List<DataResponse> data) {
		this.data = data;
	}
	@Override
	public String toString() {
		return "GetAllEmployeesResponse [status=" + status + ", data=" + data + "]";
	}
	
	
}
