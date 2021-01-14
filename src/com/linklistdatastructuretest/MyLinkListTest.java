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
		MyLinkList<Integer> firstNode = new MyLinkList<Integer>(56);

		// create second node 30
		MyLinkList<Integer> secondNode = new MyLinkList<Integer>(30);

		// create third node 56
		MyLinkList<Integer> thirdNode = new MyLinkList<Integer>(70);

		// create a object of MyLinkList1 class
		MyLinkList1 mylinklist = new MyLinkList1();

		mylinklist.append(firstNode);
		mylinklist.append(secondNode);
		mylinklist.append(thirdNode);
		// Search the given Node
		MyLinkList<Integer> fourthNode = new MyLinkList<Integer>(40);
		boolean result = mylinklist.insertNode(fourthNode, secondNode);

		// print the LinkList sequence like 56->30->70
		mylinklist.printMyNodes();

		Assert.assertEquals(true, result);

	}
}
