package com.datarynx.feign.hystrix.api.service;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.datarynx.feign.hystrix.api.dto.User;

@FeignClient(name = "${service.name}", url = "${service.base.url}")
public interface UserService {

	@GetMapping("/user/{id}")
	User getUser(@PathVariable("id") String id);

	@GetMapping(value = "/userList")
	List<User> getUserList();

	@PostMapping("/user")
	String addUser(User user);

	@DeleteMapping("/user/{id}")
	String deleteUser(@PathVariable("id") String id);

	@PutMapping("/updateAddress/{id}")
	String updateAddress(@PathVariable("id") String id, User user);

}
