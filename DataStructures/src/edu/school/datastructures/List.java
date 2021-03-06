package edu.school.datastructures;

public interface List<T> 
{
	void add(T element);
	void insertAt(int index, T element);
	void removeAt(int index);
	void remove(T element);
	void clear();

	T get(int index);

	boolean isEmpty();

	int size(); 
}
