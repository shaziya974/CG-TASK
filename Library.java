package com.c2tc.library;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class Library 
{
	private Integer id;
	private Double isbn;
	private String title;
	private String author;
	private String genre;
	private Integer publication_year;
	
	public Library(Integer id, Double isbn, String title, String author, String genre, Integer publication_year) 
	{
		
		this.id = id;
		this.isbn = isbn;
		this.title = title;
		this.author = author;
		this.genre = genre;
		this.publication_year = publication_year;
	}

	public Library() 
	{
		super();
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Double getIsbn() {
		return isbn;
	}

	public void setIsbn(Double isbn) {
		this.isbn = isbn;
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

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public Integer getPublication_year() {
		return publication_year;
	}

	public void setPublication_year(Integer publication_year) {
		this.publication_year = publication_year;
	}

	@Override
	public String toString() {
		return "Library [id=" + id + ", isbn=" + isbn + ", title=" + title + ", author=" + author + ", genre=" + genre
				+ ", publication_year=" + publication_year + "]";
	}
	
	
	
	
	
	

}
