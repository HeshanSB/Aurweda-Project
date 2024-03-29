package com.ayurweda.ayurweda.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ayurweda.ayurweda.DAO.User;
import com.ayurweda.ayurweda.Service.UserService;

@RestController
@RequestMapping("/api")
public class UserController {
	
	@Autowired UserService userService;
	
	@PostMapping("/saveUser")
	private ResponseEntity<User> regsiterUser(@RequestBody User user) {
		System.out.println("user: "+user.getEmail());
		User saveUser = userService.createUser(user);
		return ResponseEntity.ok().body(saveUser);
	}
}
