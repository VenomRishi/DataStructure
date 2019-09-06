package com.bridgelabz.queue.fixedSizeArray;

public class Queue {
	int[] queue = new int[5];
	int front;
	int rear;
	int size;

	public void enQueue(int data) {
		queue[rear] = data;
		rear = (rear + 1) % 5;
		size = size + 1;
	}

	public int deQueue() {
		int data = queue[front];
		front = (front + 1) % 5;
		size = size - 1;

		return data;
	}

	public void show() {
		System.out.print("Element : ");
		int length = queue.length;
		int count = rear;
		while (length > 0) {
			System.out.print(queue[count] + " ");
			count++;
			if (count == 5) {
				count = 0;
			}
			length--;
		}
		System.out.println();
		System.out.println();
		for (int num : queue) {
			System.out.print(num + " ");
		}
	}

	public int getSize() {
		return size;
	}

	public boolean isFull() {
		return getSize() == 5;
	}

	public boolean isEmpty() {
		return getSize() == 0;
	}
}
