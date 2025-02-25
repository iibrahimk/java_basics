package oopBasic;

import java.util.PriorityQueue;

public class QueueExample {

	public static void main(String[] args) {
		
		PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
		
		System.out.println(queue.size());
		
		queue.add(1);
		queue.add(2);
		queue.add(3);
		queue.add(4);
		queue.add(5);
		System.out.println(queue);
		System.out.println(queue.size());
		System.out.println(queue.peek());
		
		queue.poll();
		System.out.println(queue);
		System.out.println(queue.size());
		System.out.println(queue.peek());
				
		
	}
}
