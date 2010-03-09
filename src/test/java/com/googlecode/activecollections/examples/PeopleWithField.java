package com.googlecode.activecollections.examples;

import javax.persistence.EntityManagerFactory;

import com.googlecode.activecollections.JpaActiveSet;

public class PeopleWithField extends JpaActiveSet<Person>{

	private String name;
	
	protected PeopleWithField() {}
	
	public PeopleWithField(String name, EntityManagerFactory entityManagerFactory) {
		super(Person.class, entityManagerFactory);
	}
	
	public PeopleWithField withNameLike(String name) {
		return where("name like ?", name);
	}
	
	public String getName() {
		return name;
	}
	
}
