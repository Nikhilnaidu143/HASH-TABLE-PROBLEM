package com.hash.table;

public class LinkedList<K> {

	private Inode<K> head;
	private Inode<K> tail;

	/** Searching node from linked list **/
	public Inode<K> search(K key) {
		Inode<K> currentNode = head;
		while (currentNode != null) {
			if (currentNode.getKey().equals(key)) {
				return currentNode;
			}
			currentNode = currentNode.getNext();
		}
		return null;
	}

	/** Appending nodes from last **/
	public void append(Inode<K> node) {

		if (this.head == null) {
			this.head = node;
		}
		if (this.tail == null) {
			this.tail = node;
		} else {
			this.tail.setNext(node);
			this.tail = node;
		}
	}

	@Override
	public String toString() {
		return "MyLinkedList [head=" + head + "]";
	}
}