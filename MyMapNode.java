package com.hash.table;

/** implements Inode class **/
public class MyMapNode<K, V> implements Inode<K> {
	
	/** Instance variables **/
	private K key;
	private V value;
	private Inode<K> next;

	/** Constructor **/
	public MyMapNode(K key, V value) {
		super();
		this.key = key;
		this.value = value;
		this.next = null;
	}

	/** Getters and setters **/
	public V getValue() {
		return value;
	}

	public void setValue(V value) {
		this.value = value;
	}

	@Override
	public K getKey() {
		return this.key;
	}

	@Override
	public void setKey(K key) {
		this.key = key;
	}

	@Override
	public void setNext(Inode<K> next) {
		this.next = next;
	}

	@Override
	public Inode<K> getNext() {
		return next;
	}

	@Override
	public String toString() {
		return "MyMapNode [key=" + key + ", value=" + value + "]";
	}
}