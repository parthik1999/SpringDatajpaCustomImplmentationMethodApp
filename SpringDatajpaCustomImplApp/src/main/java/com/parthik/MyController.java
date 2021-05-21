package com.parthik;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	
	@Autowired 
	EmployeeDao dao;
	
	@GetMapping("/hello")
	public String sayHello()
	{
			
//		List<Employee> list= dao.findByAddress("Talod");
//		return "Result"+list;
		
//		===============================
//		For limiting the result
		
//		List<Employee> list = dao.findTop5ByAddress("Talod");
		
//		========================
		
		return "";
	}
}