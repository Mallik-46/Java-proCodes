package com.libraryapp.controller;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.libraryapp.model.*;
import com.libraryapp.service.UserServices;

@RestController
public class LibraryController {

	@Autowired
	UserServices userServices;

	@GetMapping("/")
	public String home() {
		return "hello,welcome to library system dheva ";
	}

	@GetMapping("/library")
	public List<Library> allBooks() {

		return userServices.getAllBooks();
	}

	@PutMapping("/library/addingbooks/{userId}/{bookId}")
	public Object addingBook(@PathVariable Integer userId, @PathVariable Integer bookId) {
		userServices.saveDetails(userId, bookId);

		return "updates successfully";
	}

	@GetMapping("/library/users")
	public List<User> getUsers() {
		return userServices.getAllUsers();
	}

	@GetMapping("/library/user/{userId}")
	public Object getUser(@PathVariable Integer userId) {
		User user = userServices.getUser(userId);
		if (user == null) {
			return "Employee not found for the Id: " + userId;
		}
		return user;

	}

	@PostMapping("/library/user")
	public User saveUser(@RequestBody User user) {
		userServices.saveUser(user);
		return user;
	}

	@PostMapping("/library/book")
	public String saveBook(@RequestBody Book book) {

		Integer userId = book.getUserId();

		User user = userServices.getUser(userId);
		ArrayList<Book> list = new ArrayList();
		list.add(book);
		user.setBook(list);
		book.setUser(user);
		userServices.saveBooks(user);
		userServices.saveBook(book);
		return "updates successfully";
	}

	@PutMapping("/library/user")
	public User updateUser(@RequestBody User user) {
		userServices.saveUser(user);
		return user;
	}

	@DeleteMapping("/library/user/{userId}")
	public String deleteUser(@PathVariable Integer userId) {

		String name = userServices.deleteUser(userId);

		return name + " your record deleted";

	}

}
