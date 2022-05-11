import java.io.File;

public class Filedemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("/home/jothi/Desktop"); 
		File[] ff = file.listFiles();
		for(File f:ff)
		{
			//if(f.isDirectory())
		if(f.isFile())
		{
		String name  = f.getName(); 
		int last = name.length()-1;//6 
		int first = last-2; //4
		String extension = name.substring(first, last+1);
		if (name.endsWith("txt"))
			System.out.println(f);
		
		//if(extension.equalsIgnoreCase("txt"))
			//	System.out.println(f);
			}
		}
	}

}
