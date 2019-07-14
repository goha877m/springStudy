package com.test.dao.impl;

import org.springframework.stereotype.Repository;

import com.test.dao.HelloDao;

@Repository("helloDao")
public class HelloDaoImpl implements HelloDao {

	public void save() {
		System.out.println("hello saved");

	}

}
