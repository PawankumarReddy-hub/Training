package com.org.md2.SpringbootApiMongoDbApplication2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.org.md2.SpringbootApiMongoDbApplication2.model.User;
import com.org.md2.SpringbootApiMongoDbApplication2.repository.UserRepo;

@RestController
public class UserController {
	
	@Autowired
	private UserRepo userrepo;
	
//	@PostMapping("/addUser")
//	public void addUser(@RequestBody User user) {
//		userrepo.save(user);
//	}
	
	@GetMapping("/showUsers")
	public List<User> showUsers()
	{
		return userrepo.findAll();
	}
	@PostMapping("/add")
	public void addUser1(@RequestBody User user) {
		userrepo.save(user);
	}
	@PutMapping("/update/{id}")
	public String updateUser(@PathVariable int id,@RequestBody User user)
	{
		userrepo.save(user);
		return "Updated Successfully";
	}
}
