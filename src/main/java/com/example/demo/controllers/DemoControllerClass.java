package com.example.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.demo.models.CreateRequest;
import com.example.demo.models.CreateRequestResponse;
import com.example.demo.models.DataRequest;
import com.example.demo.models.GetAllEmployeesResponse;
import com.example.demo.models.GetResponse;
import com.example.demo.models.demoResponse;

@RestController
public class DemoControllerClass {
	RestTemplate re=new RestTemplate();
	
	@PostMapping("/CreateRequest")
	public CreateRequestResponse createRequest(@RequestBody CreateRequest request){
		
		CreateRequestResponse d=re.postForObject("http://dummy.restapiexample.com/api/v1/create", request, CreateRequestResponse.class);
	System.out.println("d value is :"+d);
	
	return d;
	}
	
	@GetMapping("/GetEmployee")
	public GetResponse getres(@RequestParam String id) {
		return re.getForObject("http://dummy.restapiexample.com/api/v1/employee/{id}", GetResponse.class,1);
	}
	@GetMapping("/GetAllEmployee")
	public GetAllEmployeesResponse getresp() {
		return re.getForObject("http://dummy.restapiexample.com/api/v1/employees", GetAllEmployeesResponse.class);
	}
	
	@PostMapping("/UpdateEmployee")
	public String getresp(@RequestParam String id) {
		CreateRequestResponse r=new CreateRequestResponse();
		DataRequest d=new DataRequest();
		d.setId(1);
		d.setName("sample");
		r.setData(d);
		re.put("http://dummy.restapiexample.com/api/v1/update/{id}", r,1);
		return "success";
	}
		
	

}
