package com.collection.interfaces;

import java.util.LinkedList;
import java.util.Queue;

// Elle permet de prioriser les tâches de traitement des données qu'elle contient
// Ces objets utilisent généralement (mais pas obligatoirement) un mode de gestion de type FIFO
// Besides basic Collection operations, queues provide additional insertion, removal, and inspection operations. The Queue interface follows.
//Each Queue method exists in two forms: 

// (1) ====> one throws an exception if the operation fails : 
//  *** add(e) : returns IllegalStateException if the element cannot be added at this, true otherwise
//  *** remove() : returns null if the queue is empty
//  *** element() : returns null if the queue is empty

// (2) ====> the other returns a special value if the operation fails (either null or false, depending on the operation).
//  *** offer(e) : returns false if the element cannot be added at this, true otherwise
//  *** poll() : throws NoSuchElementException if the queue is empty
//  *** peek() : throws NoSuchElementException if the queue is empty

// It is possible for a Queue implementation to restrict the number of elements that it holds

public class QueueDoc {
	public static void main(String[] args) {
		
		Queue<Integer> queue = new LinkedList<>();
		
		// System.out.println(queue.element());  ==>throws NoSuchElementException because the queue is empty
		System.out.println(queue.peek()); // returns null because the queue is empty
		
		for (int i = 0; i < 100; i++) {
			queue.add(i);
		}
		System.out.println(queue.element());
		System.out.println(queue.peek());
	}
}
