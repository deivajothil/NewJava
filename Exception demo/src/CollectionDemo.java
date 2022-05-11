import java.util.ArrayList;

public class CollectionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			ArrayList al = new ArrayList(); 
	
		int no = 6; 
		al.add(5); 
		al.add(3);
		al.add("Hi");
		al.add(true); 
		al.add(no);
		System.out.println(al);
		System.out.println(al.size());
		
		ArrayList al2 = new ArrayList(); 
		
		al2.addAll(al); 
		System.out.println(al2);
		al2.clear();
		System.out.println(al2);
		
		System.out.println(al2.contains("Gorky")); 
		al2.addAll(al); 
		System.out.println(al2);
		System.out.println(al2.containsAll(al)); 
		///al2.remove(4.3f);
		System.out.println(al2);
		al2.add("jothi");
		al2.removeAll(al);
		System.out.println(al2);
		System.out.println(al2.get(1));
		}
		catch(Exception en)
		{
			System.out.println(en.getMessage());
		}
		finally
		{
			System.out.println("completed...");
		}
	}

}
