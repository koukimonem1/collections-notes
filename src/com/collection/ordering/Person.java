package com.collection.ordering;

public class Person implements Comparable<Person> {
	private String nom;
	private String prenom;
	private int age;

	public Person(int age, String nom) {
		super();
		this.age = age;
		this.nom = nom;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public int compareTo(Person person) {
		return this.age - person.age;
	}

}
