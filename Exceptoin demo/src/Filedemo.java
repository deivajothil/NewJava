import java.io.File;
import java.io.IOException;

public class Filedemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//File file = new File("/home/jothi/Desktop/abcd.txt"); 
		File file = new File("/home/jothi/Desktop"); 
		String[] list_of_files = file.list(); 
		for(String st:list_of_files)
		{
			System.out.println(st);
		}
			
		File file1 = new File("/home/jothi/Desktop"); 
		File[] ff = file1.listFiles();
		for(File f:ff)
		{
			//if(f.isDirectory())
			//if(f.isFile())
			//System.out.println(f);
			if(f.isFile())
			{
				String name  = f.getName(); 
				if(name.charAt(0) == 'p')
						System.out.println(f);
			}
		}
		
		//file = new File("/home/jothi/Desktop/jothi/Java/Exception");
		//file.mkdirs();//linux command

		
		
		
		
	}

}
