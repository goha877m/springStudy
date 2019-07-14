package com.test.spring;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.test.controller.HelloController;
import com.test.service.HelloService;

public class SpringTest {
	@Test
	public void springTest() {
		String xmlPath = "applicationContext.xml";
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
		HelloController helloController = (HelloController)applicationContext.getBean("helloControllerId");
		helloController.hello();
		applicationContext.close();
	}
	
	@Test
	public void springAnnotationTest() {
		String xmlPath = "applicationContextAnnotation.xml";
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
		HelloController helloController = (HelloController)applicationContext.getBean("helloControllerId");
		helloController.hello();
		applicationContext.close();
	}

}
