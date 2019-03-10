package com.collection.interfaces;

import java.util.Deque;
import java.util.LinkedList;

// deque is a double-ended-queue ==> supports the insertion and removal of elements at both end points
// The Deque interface, defines methods to access the elements at both ends of the Deque instance : 
// 1) Insert elements :
// *** addFirst(e)
// *** offerFirst(e)
// *** addLast(e)
// *** offerLast(e)
// 2) Remove element :
// *** removeFirst()
// *** pollFirst()
// *** removeLast()
// *** pollLast()
// 3) Examine elements : 
// *** getFirst()
// *** peekFirst()	
// *** getLast()
// *** peekLast()
public class DequeDoc {
	public static void main(String[] args) {
		Deque<Integer> deque = new LinkedList<>();
        // deque.removeLast(); ==> it will throws NoSuchElementException because the deque is empty
		// deque.getLast(); ==> it will throws NoSuchElementException because the deque is empty
		System.out.println(deque.pollFirst()); // it will print null
		System.out.println(deque.peekLast()); // it will print null
		for (int i = 0; i < 100; i++) {
			if (i % 2 == 0)
				deque.addFirst(i);
			else
				deque.offerFirst(i);

		}
	}
}
