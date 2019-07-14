package com.test.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.test.dao.HelloDao;
import com.test.service.HelloService;

@Service
public class HelloServiceImpl implements HelloService {
	
	
	private HelloDao helloDao;

	@Autowired
	@Qualifier("helloDao")
	public void setHelloDao(HelloDao helloDao) {
		this.helloDao = helloDao;
	}

	public void hello() {
		System.out.println("hello");
		helloDao.save();

	}

}
