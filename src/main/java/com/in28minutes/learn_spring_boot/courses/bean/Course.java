package com.in28minutes.learn_spring_boot.courses.bean;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Course {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long Id;
	@Column(name="Name")
	private String name;
	@Column(name="Author")
	private String author;
	
	public Course() {}

	public Course(long id, String name, String author) {
		Id = id;
		this.name = name;
		this.author = author;
	}

	@Override
	public String toString() {
		return "Course [Id=" + Id + ", name=" + name + ", author=" + author + "]";
	}

	public long getId() {
		return Id;
	}

	public String getName() {
		return name;
	}

	public void setId(long id) {
		Id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getAuthor() {
		return author;
	}

}
