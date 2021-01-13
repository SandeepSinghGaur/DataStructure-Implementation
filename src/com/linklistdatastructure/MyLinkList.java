package com.linklistdatastructure;

public class MyLinkList<K> {
	private MyLinkList<?> next;

	public MyLinkList(K key) {
		this.next = null;
	}

	public MyLinkList<?> getNext() {
		return next;
	}

	public void setNext(MyLinkList<?> next) {
		this.next = next;
	}

}
