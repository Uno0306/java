package step02_collection;

import java.util.HashSet;
import java.util.Iterator;

public class Ex02HashSet {

	public static void main(String[] args) {
		HashSet<String> set1 = new HashSet<String>();
		
		set1.add("Java");
		set1.add("Busan");
		set1.add("Study");
		set1.add("Happy");
		set1.add("Lazy");
		set1.add("Lazy");
		
		// for문 출력
		for (String str : set1) {
//			System.out.println(str);
		}
		
		System.out.println();
		
		// iterator
		Iterator<String> iterator = set1.iterator();
//		while(iterator.hasNext()) {
//			System.out.println(iterator.next());
//		}
		
		System.out.println();

//		System.out.println(set1.isEmpty());
//		set1.remove("Lazy");
		for (String v : set1) {
//			System.out.println(v);
		}
	
		System.out.println(set1.contains("Busa"));
		
	
	
	}
}
