package com.linklistdatastructuretest;

import org.junit.Test;

import com.linklistdatastructure.MyLinkList;

import junit.framework.Assert;

public class MyLinkListTest {

	@Test
	public void createLinkList(){
		MyLinkList<Integer> firstNode=new MyLinkList<Integer>(56);
		MyLinkList<Integer> secondNode=new MyLinkList<Integer>(30);
		MyLinkList<Integer> thirdNode=new MyLinkList<Integer>(70);
		firstNode.setNext(secondNode);
		secondNode.setNext(thirdNode);
		boolean result=firstNode.getNext().equals(secondNode) && secondNode.getNext().equals(thirdNode);
		Assert.assertTrue(result);
		
	}
}
