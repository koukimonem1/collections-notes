package com.collection.implementations;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

// The Set implementations are grouped into :
// *** general-purpose implementation
// *** special-purpose implementation

public class SetImplementations {

	public static void main(String[] args) {
		
		// ******************************************************************************//
		// **************** General-Purpose Set Implementations *************************//
		// ******************************************************************************//
		
		// - HashSet
		// - TreeSet
		// - LinkedHashSet
		
		//****** HashSet****//
		// - backed by a hash table (actually a HashMap instance)
		// - it does not guarantee that the order will remain constant over time
		// - permits the null element
		// - constant time performance for the basic operations (add, remove, contains and size) because hash function disperses the elements properly among the buckets
		// - Iterating over this set requires time proportional to = size of the hash set + size of the backing HashMap (number of buckets == capacity)
		// - this implementation is not synchronized (because it's a general purpose implementation)
		// - Look at the HashSet implementation from the java source to understand how it works
		
		Set<String> hashSet = new HashSet<>();
		
		//****** TreeSet****//
		// - Implements NavigableSet
		// - NavigableSet implements SortedSet
		// - NavigableSet ==> provides methods lower, floor, ceiling, and higher return elements respectively less than, less than or equal, greater than or equal, and greater than a given element
		// - NavigableSet may be accessed and traversed in either ascending or descending order
		Set<String> treeSet = new TreeSet<>();

	}

}
