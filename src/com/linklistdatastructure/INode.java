package com.linklistdatastructure;

/**
 * @author SandeepSinghGaur
 * @Functionality Created a Interface INode
 */

public interface INode<K> {
	K getKey();

	void setNext(INode next);

	void setKey(K key);

	INode getNext();
}
