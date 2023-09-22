package model;

public class CollectionCustom<T>{
	private T[] collection;
	private int size;
	
	
	public CollectionCustom(int capacity) {
		collection = (T[]) new Object[capacity];
		size=0;
	}
	
	public int size() {
		return size;
	}
	
	public void addFirts(T element) {
		if (size == collection.length) {
			System.out.println("La coleccion esta llena");
			return;
		}
		System.arraycopy(collection, 0, collection, 1, size);
		collection[0] = element;
		size++;
	}
	
	 public void addLast(T element) {
	        if (size == collection.length) {
	            System.out.println("La colección está llena, no se puede añadir más elementos.");
	            return;
	        }

	        collection[size] = element;
	        size++;
	    }
	
	public void add(T element) {
		addLast(element);
	}
	
	public T remove(T element) {
        for (int i = 0; i < size; i++) {
            if (collection[i].equals(element)) {
                T removedElement = collection[i];
                System.arraycopy(collection, i + 1, collection, i, size - i - 1);
                collection[size - 1] = null;
                size--;
                return removedElement;
            }
        }
		return null;
	}
	
	public void removeAll(T element) {
		for(int i = 0; i < size; i++) {
			if(collection[i].equals(element)) {
				System.arraycopy(collection, i+1, collection, i, size -i - 1 );
				collection[size - 1] = null;
				size--;
				i--;
			}
		}
	}
	
	public boolean empty() {
		return size == 0;
	}
}
