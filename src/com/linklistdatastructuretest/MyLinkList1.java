package com.linklistdatastructuretest;

import com.linklistdatastructure.INode;

/**
 * @author SandeepSinghGaur
 * @Functionality Create a class and inside class we define two method add()  print()
 */

public class MyLinkList1 {
	public INode head;
	public INode tail;
// Constructor of the class 
	public MyLinkList1() {
		this.head = null;
		this.tail = null;
	}
	// 

	public void add(INode newNode) {
		if (this.tail == null) {
			this.tail = newNode;
		}
		if (this.head == null) {
			this.head = newNode;
		} else {
			INode tempNode = this.head;
			this.head = newNode;
			this.head.setNext(tempNode);
		}

	}
	// This Method is For Simply traverse the Link List and Print the key value. 

	public void printMyNodes() {
		StringBuffer nodes = new StringBuffer("My Nodes:");
		INode tempNode = head;
		while (tempNode.getNext() != null) {
			nodes.append(tempNode.getKey());
			if (!tempNode.equals(tail))
				nodes.append("->");
			tempNode = tempNode.getNext();
		}
		nodes.append(tempNode.getKey());
		System.out.println(nodes);
	}

}