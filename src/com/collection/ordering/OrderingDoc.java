package com.collection.ordering;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OrderingDoc {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("zzz");
		list.add("tttt");
		list.add("yyyy");
		list.add("aaaaa");
		list.add("bbbb");
		// trier la liste alphabitiquement dans l'ordre scendant
		// String implements Comparable interface (it's the same for Date, Integer, Float, Char etc...)
		Collections.sort(list);
		list.forEach(System.out::println);
		System.out.println("#############################################################################");
		// List<T>, the type T should implements the Comparable interface
		List<Person> persons = new ArrayList<>();
		Person p1 = new Person(78, "aa");
		Person p2 = new Person(17, "bb");
		Person p3 = new Person(10, "cc");
		Person p4 = new Person(80, "dd");
		persons.add(p1);
		persons.add(p2);
		persons.add(p3);
		persons.add(p4);
		Collections.sort(persons);
		for (Person p : persons) {
			System.out.println(p.getAge() + " " + p.getNom());
		}

		// We use Comparator to :
		// 1) sort some objects in an order other than their natural ordering
		// 2) sort some objects that don't implement Comparable
		System.out.println("#############################################################################");
		Comparator<Person> comparator = new Comparator<Person>() {

			@Override
			public int compare(Person p1, Person p2) {
				// compareTo() method comes from Comparator interface because it implements it
				return p1.getNom().compareTo(p2.getNom());
			}
		};
		Collections.sort(persons, comparator);
		for (Person p : persons) {
			System.out.println(p.getAge() + " " + p.getNom());
		}
	}
}
