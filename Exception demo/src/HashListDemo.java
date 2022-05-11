import java.util.ArrayList;
import java.util.HashSet;

public class HashListDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet al = new HashSet(); 
		al.add(10);
		al.add(20);
		al.add(30); 
		al.add(40);
		al.add(4); 
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
