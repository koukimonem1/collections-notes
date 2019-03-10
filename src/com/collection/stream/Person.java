package com.collection.stream;

public class Person implements Comparable<Person> {
	private String nom;
	private String prenom;
	private int age;
	private Sex sex;

	public Person(int age, String nom, Sex sex) {
		super();
		this.age = age;
		this.nom = nom;
		this.sex = sex;
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

	public Sex getSex() {
		return sex;
	}

	public void setSex(Sex sex) {
		this.sex = sex;
	}

	@Override
	public int compareTo(Person person) {
		return this.age - person.age;
	}

	enum Sex {
		MALE, FEMALE
	}
}
