package com.nozama.service.user.controller;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nozama.service.user.model.User;

@RestController
@RequestMapping("/user/")
public class UserController {
	
	@PostMapping("create")
	String createUser(@Valid @RequestBody User user) {
		return "1";
	}

}
