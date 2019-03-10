package com.collection.stream;

import java.util.ArrayList;
import java.util.List;

public class ReductionDoc {
	public static void main(String[] args) {
         // The Stream.reduce method is a general-purpose reduction operation. 
		List<Person> persons = new ArrayList<>();
		Person p1 = new Person(78, "aa", Person.Sex.FEMALE);
		Person p2 = new Person(17, "bb", Person.Sex.MALE);
		Person p3 = new Person(10, "cc", Person.Sex.FEMALE);
		Person p4 = new Person(80, "dd", Person.Sex.MALE);
		persons.add(p1);
		persons.add(p2);
		persons.add(p3);
		persons.add(p4);
		int someAge = persons.stream()
		.mapToInt(Person::getAge)
		.reduce(0, (a,b)->a+b);
		System.out.println(someAge);
	}
}
