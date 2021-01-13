package com.linklistdatastructuretest;

/**
 * @author SandeepSinghGaur
 * @Functionality Test class declaration of Link List 
 */

import org.junit.Test;

import com.linklistdatastructure.MyLinkList;

import junit.framework.Assert;

public class MyLinkListTest {

	@Test
	public void createLinkList() {
		// create first node 70
		MyLinkList<Integer> firstNode = new MyLinkList<Integer>(70);
		// create second node 30
		MyLinkList<Integer> secondNode = new MyLinkList<Integer>(30);
		// create third node 56
		MyLinkList<Integer> thirdNode = new MyLinkList<Integer>(56);
		// create a object of MyLinkList1 class
		MyLinkList1 mylinklist = new MyLinkList1();
		// add first node manually
		mylinklist.add(firstNode);
		// add second node
		mylinklist.add(secondNode);
		// add third node
		mylinklist.add(thirdNode);
		// print the LinkList sequence like 56->30->70
		mylinklist.printMyNodes();
		// check condition our link list is reverse or not
		boolean result = mylinklist.head.equals(thirdNode) && mylinklist.head.getNext().equals(secondNode)
				&& mylinklist.tail.equals(firstNode);

		Assert.assertTrue(result);

	}
}
