package com.hash.table;

/** Interface **/
public interface Inode<K> {

	K getKey();                 // declaring methods for linkedList.

	void setKey(K key);

	void setNext(Inode<K> next);

	Inode<K> getNext();

}