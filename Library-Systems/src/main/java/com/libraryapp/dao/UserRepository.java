package com.libraryapp.dao;

import java.util.List;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.stereotype.Controller;

import com.libraryapp.model.*;

public interface UserRepository {

	public List<User> getAllUsers();

	public User getUser(Integer userId);

	public void saveUser(User user);

	public void saveBooks(User user);

	public String deleteUser(Integer userId);

	public List<Library> getAllBooks();

	public Library getBook(Integer bookId);

	public void saveDetails(Integer userId, Integer bookId);

	public void saveBook(Book book);

}
