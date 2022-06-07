package com.libraryapp.model;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;
@Entity
@Table(name="library_booklist")
public class Library {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "libraryid")
	private  Integer libraryId;
 
	private String title;

	private String author;
 
	@Column
	private String releaseYear;

	public Integer getLibraryId() {
		return libraryId;
	}

	public void setLibraryId(Integer libraryId) {
		this.libraryId = libraryId;
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

	public String getReleaseYear() {
		return releaseYear;
	}

	public void setReleaseYear(String releaseYear) {
		this.releaseYear = releaseYear;
	}

	public Library() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Library(Integer libraryId, String title, String author, String releaseYear) {
		super();
		this.libraryId = libraryId;
		this.title = title;
		this.author = author;
		this.releaseYear = releaseYear;
	}

	@Override
	public String toString() {
		return "Library [libraryId=" + libraryId + ", title=" + title + ", author=" + author + ", releaseYear="
				+ releaseYear + "]";
	}
	
	
	
	
}
