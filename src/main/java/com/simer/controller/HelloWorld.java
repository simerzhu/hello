package com.simer.controller;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.simer.pojo.Resource;

@RestController
public class HelloWorld {

	@Autowired
	private Resource resource;
	
	@RequestMapping("/hello")
	public String hello() {
		return "hello world";
	}
	
	@RequestMapping("/getResource")
	public Resource getResource() {
		Resource r = new Resource();
		BeanUtils.copyProperties(resource, r);
		System.out.println(resource);
		return r;
	}
}
