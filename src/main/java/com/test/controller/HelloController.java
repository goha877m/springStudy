
package com.test.controller;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.test.service.HelloService;

@Controller("helloControllerId")
public class HelloController {

	@Autowired
	private HelloService helloService;

	
	public String hello() {
		System.out.println("controller hello");
		getHelloService().hello();
		return "hello";
	}


	public HelloService getHelloService() {
		return helloService;
	}


	public void setHelloService(HelloService helloService) {
		this.helloService = helloService;
	}
}