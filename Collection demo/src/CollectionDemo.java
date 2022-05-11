import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class CollectionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*HashMap hm = new HashMap(); 
		hm.put("Tamil I" , 90); 
		hm.put("Tamil II" , 80); 
		hm.put("English I" , 90); 
		hm.put("English II" , 95); 
		hm.put("Mathematics" , 100);  
		System.out.println(hm);
		System.out.println(hm.get("Tamil I")); 
		System.out.println(hm.containsKey("Science")); 
		System.out.println(hm.containsValue(11));
		//Collection Views of Map
		System.out.println(hm.keySet());
		System.out.println(hm.values());
		System.out.println(hm.entrySet());
		System.out.println(hm.remove("English I")); 
		System.out.println(hm.isEmpty()); */
		
		//Set entries = hm.entrySet(); 
		
		/*System.out.println(entries);
		Iterator i = entries.iterator(); 
		while(i.hasNext())
		{
			System.out.println(i.next());
		}*/
		
	
		/*Set entries = hm.entrySet(); 
		Iterator i = entries.iterator(); 
		while(i.hasNext())
		{
	Entry entry = (Entry) i.next(); 
	
	Integer mark = (Integer)entry.getValue(); 
	if(mark==100)
		System.out.println(entry.getKey());
		}
	}*/
		
		
		
		HashMap hm = new HashMap(); 
		hm.put("Tamil I" , 90); 
		hm.put("Tamil II" , 80); 
		hm.put("English I" , 100); 
		hm.put("English II" , 95); 
		hm.put("Mathematics" , 100); 
		
		
		
		Set entries = hm.entrySet(); 
		Iterator i = entries.iterator(); 
		
		System.out.println(hm.keySet());
		System.out.println(hm.values());
		System.out.println(hm.entrySet());
		
		while(i.hasNext())
		{
	Entry entry = (Entry) i.next(); 
	
	Integer mark = (Integer)entry.getValue(); 
	if(mark==100)
		System.out.println(entry.getKey());
		}
	}
		
	}

