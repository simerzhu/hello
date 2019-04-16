package com.simer.controller;

import java.util.Date;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.simer.pojo.User;

@RestController
public class UserController {

	@RequestMapping("/getUser")
	public User getUser() {
		User u = new User();
		u.setName("simer");
		u.setPassword("123");
		u.setBirthday(new Date());
		u.setDesc(null);
		return u;
	}
}
