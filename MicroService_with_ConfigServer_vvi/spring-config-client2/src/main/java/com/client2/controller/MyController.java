package com.client2.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.client2.model.EmployeeVO;

@RefreshScope
@RestController
public class MyController {

	@Value("${msg:Hello world - Config Server is not working..pelase check}")
	private String msg;

	@RequestMapping("/msg")
	String getMsg() {
		return this.msg;
	}
	
	@GetMapping(value="/getEmployees",produces="application/json")
	public ResponseEntity<Object> getEmployees(HttpServletRequest req)
	{

		
		List<EmployeeVO> empList=new ArrayList<EmployeeVO>();
		
		EmployeeVO e1=new EmployeeVO(101,"A","Sodepur");
		EmployeeVO e2=new EmployeeVO(102,"B","Kolkata");
		
		empList.add(e1);
		empList.add(e2);
		return new ResponseEntity<Object>(empList,HttpStatus.OK);
		
	}
}
