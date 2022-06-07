package com.libraryapp.model;

import java.time.LocalDate;
import java.time.Month;
import java.time.Year;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.libraryapp.model.*; 
@Entity
@Table(name = "books")
public class Book {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "bookid")
	private  Integer bookId;

    @Column(name = "userid")
	private Integer UserId;
	
	private String title;

	private String author;
    @Temporal(TemporalType.DATE)
	private Date date =new  Date(System.currentTimeMillis());
	 
	@Column(name = "returndate")
	private String returnDate;
	     
	
	@ManyToOne(cascade = CascadeType.MERGE)
	@JsonIgnore
	 private User user;



	public Integer getUserId() {
		 
		return this.UserId;
	}

	
	
  void setUserId(Integer userId) {
		UserId = userId;
	}


	public Integer getBookId() {
		return bookId;
	}


	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getAuthor() {
		return author;
	}


	public void setAuthor(String author) {
		this.author = author;
	}


	 

 


	public User getUser() {
		return user;
	}


	public void setUser(User user) {
		this.user = user;
	}
 

	public String getReturnDate() {
		return returnDate;
	}



	public void setReturnDate(String returnDate) {
		this.returnDate = returnDate;
	}



	public Date getDate() {
		return date;
	}



	public void setDate(Date date) {
		this.date = date;
	}



	public Book() {
		super();
 
	}



	public Book(Integer bookId, Integer userId, String title, String author, Date date, String returnDate, User user) {
		super();
		this.bookId = bookId;
		UserId = userId;
		this.title = title;
		this.author = author;
		this.date = date;
		this.returnDate = returnDate;
		this.user = user;
	}



	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", UserId=" + UserId + ", title=" + title + ", author=" + author + ", date="
				+ date + ", returnDate=" + returnDate + "]";
	}


 
	
	
	

}