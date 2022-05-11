import java.util.HashMap;
import java.util.Set;

public class CollectionSet {
public static void main(String args[])
{
	String name = "arulrajan"; 
	HashMap hm = new HashMap(); 
	char[] ch = name.toCharArray(); 
	for(char letter: ch)//arulr
	{
		if(hm.containsKey(letter))
		{
			int value = (int)hm.get(letter); 
			hm.put(letter, value+1);
		}
		else
		{
			hm.put(letter, 1);	//a=1 r=1 u=1 l=1
		}
	}

	Set s = 	hm.entrySet(); 
	
	System.out.println(s);
	for(Object ob: s)
	{
		System.out.println(ob);
	}

}
}
