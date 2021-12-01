package com.hash.table;

import java.util.ArrayList;

public class LinkedHashMap<K, V> {

	private final int numberOfBucket;
	ArrayList<LinkedList<K>> arrayList;

	/** Constructor **/
	public LinkedHashMap() {
		numberOfBucket = 10;
		arrayList = new ArrayList<>();
		for (int i = 0; i < numberOfBucket; i++) {
			arrayList.add(null);
		}
	}

	/** get value **/
	public V get(K key) {
		int indexNumber = this.getBucketNumber(key);
		LinkedList<K> linkedList = arrayList.get(indexNumber);

		if (linkedList == null) {
			return null;
		}
		MyMapNode<K, V> mapNode = (MyMapNode<K, V>) linkedList.search(key);
		return mapNode == null ? null : mapNode.getValue();       //Ternary Operator
	}

	/** Getting bucket Number using Hash Function. **/
	private int getBucketNumber(K key) {
		int hashCode = Math.abs(key.hashCode());
		return hashCode % this.numberOfBucket;
	}

	/** Putting keys in specific index into hash table **/
	public void put(K key, V value) {
		int index = this.getBucketNumber(key);
		LinkedList<K> linkedList = this.arrayList.get(index);
		if (linkedList == null) {
			linkedList = new LinkedList<>();
			this.arrayList.set(index, linkedList);
		}

		MyMapNode<K, V> myMapNode = (MyMapNode<K, V>) linkedList.search(key);
		if (myMapNode == null) {
			myMapNode = new MyMapNode<>(key, value);
			linkedList.append(myMapNode);
		} else {
			myMapNode.setValue(value);
		}
	}

	@Override
	public String toString() {
		return "LinkedHashMap [arrayList=" + arrayList + "]";
	}
}