package com.libraryapp.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.libraryapp.model.Book;
import com.libraryapp.model.Library;
import com.libraryapp.model.User;

@Repository
public class UserRepositoryImplement implements UserRepository {

	private EntityManager entityManager;
	
	@Autowired
	Book book;

	@Autowired
	public UserRepositoryImplement(EntityManager entityManager) {
		super();
		this.entityManager = entityManager;
	}

	@Override
	@Transactional
	public List<User> getAllUsers() {
		Session session = entityManager.unwrap(Session.class);
		return session.createQuery("from User", User.class).list();
	}

	@Override
	@Transactional
	public User getUser(Integer userId) {
		Session session = entityManager.unwrap(Session.class);
		return session.get(User.class, userId);
	}

	@Override
	@Transactional
	public void saveUser(User user) {
		Session session = entityManager.unwrap(Session.class);
		session.saveOrUpdate(user);

	}

	@Override
	@Transactional
	public String deleteUser(Integer userId) {
		Session session = entityManager.unwrap(Session.class);
		User user = session.get(User.class, userId);
		String name = user.getName();
		session.delete(user);
		return name;
	}

	@Override
	@Transactional
	public void saveBooks(User user) {
		Session session = entityManager.unwrap(Session.class);
		session.saveOrUpdate(user);
	}

	@Override
	@Transactional
	public List<Library> getAllBooks() {
		Session session = entityManager.unwrap(Session.class);
		return session.createQuery("from Library", Library.class).list();

	}

	@Override
	@Transactional
	public Library getBook(Integer bookId) {
		Session session = entityManager.unwrap(Session.class);
		return session.get(Library.class, bookId);
	}

	@Override
	@Transactional
	public void saveDetails(Integer userId, Integer bookId) {

		Session session = entityManager.unwrap(Session.class);
		User user = session.get(User.class, userId);
		Library books = session.get(Library.class, bookId);
		book.setTitle(books.getTitle());
		book.setAuthor(books.getAuthor());
		book.setBookId(books.getLibraryId());
		book.setUser(user);
		book.setReturnDate("20/20/2020");
		List<Book> listb = new ArrayList<>();
		listb.add(book);
		user.setBook(listb);
		System.out.println(user);
		for (Book book : user.getBook()) {
			System.out.println(book);
		}
		session.save(user);
	}

	@Override
	@Transactional
	public void saveBook(Book book) {

		Session session = entityManager.unwrap(Session.class);
		session.save(book);

	}

}
