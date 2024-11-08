package com.rameshsoft.programs;

import java.util.Collection;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueProg {
	public static void main(String[] args) {
		
		//Collection collection = new PriorityQueue();
		//Queue queue = new PriorityQueue();
		
		PriorityQueue queue = new PriorityQueue();
		queue.add("java");
		queue.add("job");
		queue.add("java");
		queue.add("Selenium");
		queue.add("job");
		queue.add("java");
		//queue.add(null);
		//queue.add(456)
		
		System.out.println(queue);		
		
		
		
	}
}
