package com.linklistdatastructuretest;

import com.linklistdatastructure.INode;

/**
 * @author SandeepSinghGaur
 * @Functionality Create a class and inside class we define two method append()
 *                print()
 */

public class MyLinkList1 {
	public INode head;
	public INode tail;

	// Constructor of the class
	public MyLinkList1() {
		this.head = null;
		this.tail = null;
	}
	// Delete The First Node
	public void deleteLast()
	{
	        INode tempNode =head;
	        while((tempNode.getNext()!=tail)) {
	            tempNode = tempNode.getNext();
	        }
	        this.tail= tempNode;
	    }
	      
	    
	
	
	 public void append(INode myNode) {
	        if(this.head==null) {
	            this.head=myNode;
	        }
	        if(this.tail==null) {
	            this.tail=myNode;
	        } else {
	            this.tail.setNext(myNode);
	            this.tail=myNode;
	        }
	    }

	// Insert Node in Middle
	public void insert(INode myNode,INode newNode)
	{
		INode tempNode=myNode.getNext();
		myNode.setNext(newNode);
		newNode.setNext(tempNode);
	}
	// This Method is For Simply traverse the Link List and Print the key value.

	public void printMyNodes() {
		StringBuffer nodes = new StringBuffer("My Nodes:");
		INode tempNode = head;
		while (tempNode.getNext() != null) {
			nodes.append(tempNode.getKey());
			if (!tempNode.equals(tail) ) 
				nodes.append("->");
			tempNode = tempNode.getNext();
		}
		System.out.println(nodes);
	}

}
