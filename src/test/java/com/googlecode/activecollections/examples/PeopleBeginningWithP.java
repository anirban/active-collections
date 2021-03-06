package com.googlecode.activecollections.examples;

import javax.persistence.EntityManagerFactory;

import com.googlecode.activecollections.JpaActiveSet;

public class PeopleBeginningWithP extends JpaActiveSet<Person>{

	PeopleBeginningWithP() {}
	
	public PeopleBeginningWithP(EntityManagerFactory entityManagerFactory) {
		super(Person.class, entityManagerFactory);
	}
	
	@Override
	protected PeopleBeginningWithP always() {
		return withNameLike("P%");
	}
	
	private PeopleBeginningWithP withNameLike(String name) {
		return where("person.name like ?", name);
	}
	
}
