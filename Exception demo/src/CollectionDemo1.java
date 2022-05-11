import java.util.ArrayList;
import java.util.LinkedHashSet;

public class CollectionDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al = new ArrayList(); 
		al.add(10); 
		al.add(20); 
		al.add(10); 
		al.add(20); 
		al.add(30); 
		System.out.println(al);
		LinkedHashSet lhs = new LinkedHashSet(al); 
		System.out.println(lhs);
	}

}
