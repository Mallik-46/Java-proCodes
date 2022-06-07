package com.libraryapp.service;

import java.util.List;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

import com.libraryapp.dao.UserRepository;
import com.libraryapp.dao.UserRepositoryImplement;
import com.libraryapp.model.Book;
import com.libraryapp.model.Library;
import com.libraryapp.model.User;

@Service
public class UserServices {

	@Autowired
	UserRepositoryImplement userRepoImp;

	public List<User> getAllUsers() {
		return userRepoImp.getAllUsers();
	}

	public User getUser(Integer userId) {
		return userRepoImp.getUser(userId);

	}

	public void saveUser(User user) {

		userRepoImp.saveUser(user);
	}

	public String deleteUser(Integer userId) {

		String name = userRepoImp.deleteUser(userId);

		return name;

	}

	public void saveBooks(User user) {

		userRepoImp.saveBooks(user);
	}

	public List<Library> getAllBooks() {

		return userRepoImp.getAllBooks();

	}

	public Library getBook(Integer bookId) {

		return userRepoImp.getBook(bookId);

	}

	public void saveDetails(Integer userId, Integer bookId) {

		userRepoImp.saveDetails(userId, bookId);

	}

	public void saveBook(Book book) {
		
		userRepoImp.saveBook(book);
	}
	
}
