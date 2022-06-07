package com.libraryapp.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.libraryapp.model.Book;

@Configuration
public class ConfigClass {
	@Bean    
	public Book getBook() {
		return new Book();
	}

}
