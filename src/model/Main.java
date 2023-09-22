package model;

public class Main {
	public static void main(String[] args) {
		
		CollectionCustom<Integer> Intcollection = new CollectionCustom<>(5);
		
		Intcollection.add(1);
		Intcollection.add(2);
		Intcollection.add(3);
		Intcollection.add(4);
		
		
		System.out.println(Intcollection.size());
		
		Intcollection.addFirts(0);
		
		System.out.println(Intcollection.size());
		
		Intcollection.addLast(4);
		Intcollection.add(5);
		
		System.out.println(Intcollection.size());
		
		System.out.println("removemos un elemento: " + Intcollection.remove(2));
		System.out.println(Intcollection.size());
		
		Intcollection.removeAll(3);
		System.out.println(Intcollection.size());
		
		System.out.println(Intcollection.empty());
		
		Intcollection.removeAll(0);
		Intcollection.removeAll(4);
		
		System.out.println(Intcollection.size());
		
		Intcollection.removeAll(1);
		System.out.println("Esta vacio: " + Intcollection.empty());
		System.out.println("---------------------------------------------");
		
		CollectionCustom<String> StringCollection = new CollectionCustom<>(3);
		
		StringCollection.add("pomelo");
		StringCollection.add("Naranju");
		
		System.out.println("Tamaño: " + StringCollection.size());
		
		StringCollection.addLast("Rondon");
		StringCollection.addFirts("Lisa");
		
		System.out.println("Tamaño: " + StringCollection.size());
		
		StringCollection.removeAll("pomelo");
		
		System.out.println(StringCollection.size());
		
		System.out.println(StringCollection.empty());
		
		
	}
}
