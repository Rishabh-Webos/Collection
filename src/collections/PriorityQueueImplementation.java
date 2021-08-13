package collections;

import java.util.PriorityQueue;

public class PriorityQueueImplementation {
	public static void main(String[] args) {
		PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
		operationOnPriorityQueue operation = new operationOnPriorityQueue();
		operation.insertElementInQueue(priorityQueue, Integer.valueOf(1));
		operation.removeElement(priorityQueue);
		operation.getTheFirstElement(priorityQueue);
	}
}
class operationOnPriorityQueue{
	public void insertElementInQueue(PriorityQueue<Integer> pri,Integer k) {
		pri.add(k);
	}
	public void removeElement(PriorityQueue<Integer> pri) {
		System.out.println(pri.remove());
	}
	//it return the head
	public void getTheFirstElement(PriorityQueue<Integer> pri) {
		System.out.println(pri.element());
	}
}