package JavaConcept;

import java.util.Iterator;

public class ArrayList {

	public static void main(String[] args) {
		java.util.ArrayList<String> al = new java.util.ArrayList<String>();
		al.add("abc");
		al.add("xyz");
		al.add("123");
		al.add("555");
		al.add("007");
		al.add("rst");

		// simple for loop
		System.out.println("Using simple for loop");
		for (int i = 0; i < al.size(); i++) {
			System.out.println(al.get(i));
		}

		// for each loop
		System.out.println("Using for each loop");
		for (String s : al) {
			System.out.println(s);
		}

		// Iterator
		System.out.println("Using iterator");
		Iterator<String> it=al.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
		// While loop
		System.out.println("Using while loop");
		int i=0;
				while(i<al.size()) {
					System.out.println(al.get(i));
					i++;
				}
	}

}
