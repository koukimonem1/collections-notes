package com.collection.stream;

import java.util.ArrayList;
import java.util.List;

public class StreamDoc {
	public static void main(String[] args) {
		List<Person> persons = new ArrayList<>();
		Person p1 = new Person(78, "aa", Person.Sex.FEMALE);
		Person p2 = new Person(17, "bb", Person.Sex.MALE);
		Person p3 = new Person(10, "cc", Person.Sex.FEMALE);
		Person p4 = new Person(80, "dd", Person.Sex.MALE);
		persons.add(p1);
		persons.add(p2);
		persons.add(p3);
		persons.add(p4);

		persons.stream().forEach(p -> System.out.println(p.getNom()));
		// A pipeline is a sequence of aggregate operations.
		// A pipeline contains :
		// 1) A source ===> Collection, Array, generator function, I/O
		// 2) Intermediate operations ===> filter, map ===> generate a new stream
		// 3) A terminal operation (eg: foreEach) ===> produces a non-stream result
		persons
		.stream()
		.filter(p -> p.getSex()==Person.Sex.MALE)
		.forEach(p -> System.out.println(p.getNom()));
		
		double averageAge =persons
		.stream()
		 //The mapToInt operation returns a new stream of type IntStream (which is a stream that contains only integer values)
		.mapToInt(Person::getAge)
		//  average, sum, min, max, count... are called terminal operations 
		.average()
		.getAsDouble();
		System.out.println(averageAge);
	}
}
