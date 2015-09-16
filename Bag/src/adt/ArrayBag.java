package adt;


public class ArrayBag<T> implements BagInterface<T> {

	private T[] bag;
	private int numEntries = 0;
	private static final int DEFAULT_CAPACITY = 10;
	
	public ArrayBag() {
		bag = (T[]) new Object[DEFAULT_CAPACITY];
		//this(DEFAULT_CAPACITY);
	}
	
	public ArrayBag(int capacity) {
		bag = (T[]) new Object[capacity];
	}
	
	@Override
	public int getCurrentSize() {
		return numEntries;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean add(T newEntry) {
		boolean isAdded = false;
		
		if (!isArrayFull()) {
			bag[numEntries] = newEntry;
		}
		
		return isAdded;
	}

	private boolean isArrayFull() {
		return numEntries <= bag.length;
	}

	@Override
	public T remove() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean remove(T anEntry) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getFrequencyOf(T anEntry) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean contains(T anEntry) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public T[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
