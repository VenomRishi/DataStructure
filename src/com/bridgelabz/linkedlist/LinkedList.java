package com.bridgelabz.linkedlist;

public class LinkedList {
	Node head;

	public void insert(int data) {
		Node new_node = new Node();
		new_node.data = data;
		if (head == null) {
			head = new_node;
		} else {
			Node n = head;
			while (n.next != null) {
				n = n.next;
			}
			n.next = new_node;
		}
	}

	public void insertAtStart(int data) {
		Node new_node = new Node();
		new_node.data = data;
		new_node.next = null;
		new_node.next = head;
		head = new_node;
	}

	public void insertAt(int index, int data) {
		Node new_node = new Node();
		new_node.data = data;
		new_node.next = null;
		
		if(index==0) {
			insertAtStart(data);
		}else {
			Node n=head;
			for (int i = 0; i < index-1; i++) {
				n=n.next;
			}
			new_node.next=n.next;
			n.next=new_node;
		}
	}
	public void deleteAtStart() {
		Node n=head;
		head=head.next;
		System.out.println("Node deleted is: "+n.data);
		n=null;
	}
	public void deleteAt(int index) {
		if(index==0) {
			head=head.next;
		}else {
			Node n=head;
			Node n1=null;
			for (int i = 0; i < index-1; i++) {
				n=n.next;
			}
			n1=n.next;
			n.next=n1.next;
			System.out.println("Node deleted is: "+n1.data);
			n1=null;
		}
	}

	public void show() {
		Node n = head;
		while (n.next != null) {
			System.out.println(n.data);
			n = n.next;
		}
		System.out.println(n.data);
	}
}
