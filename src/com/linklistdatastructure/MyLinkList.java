package com.linklistdatastructure;

/**
 * 
 * @author SandeepSinghGaur
 *
 * @Functionality  Generic Class for Creating Link List Node
 */

// Created a Generic Class and this Class implement INode interface 

public class MyLinkList<K> implements INode<K> {
	private INode next;
	private K key;

	public MyLinkList(K key) {
		this.key = key;
		this.next = null;
	}

	public INode getNext() {
		return next;
	}

	@Override
	public K getKey() {
		return key;
	}

	@Override
	public void setKey(K key) {
		this.key = key;

	}

	@Override
	public void setNext(INode next) {
		this.next = (MyLinkList<K>) next;

	}

}
