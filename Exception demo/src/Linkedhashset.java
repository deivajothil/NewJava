import java.util.HashSet;
import java.util.LinkedHashSet;

public class Linkedhashset {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet al = new LinkedHashSet(); 
		al.add(30);
		al.add(20);
		al.add(true); 
		al.add("abcd");
		al.add('a'); 
		al.add(10);
		System.out.println(al);
		//al.add(2, 1234);
		System.out.println(al);
		//System.out.println(al.get(3)); 
		al.remove(4); 

		System.out.println(al);
		System.out.println(al.contains(30)); 
		HashSet al2 = new HashSet();
		al2.add(al);
		System.out.println(al2);
		System.out.println(al);
		System.out.println(al.isEmpty()); 
		//System.out.println(al.indexOf(10)); 
		//System.out.println(al.lastIndexOf(10));
		//System.out.println("set method " + al.set(3, 345)); //set method 30
		System.out.println(al);
		//System.out.println(al.subList(0, 4));
	
	}
}
