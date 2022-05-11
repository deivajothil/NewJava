import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file = new File("/home/jothi/Desktop/two.txt");
		// TODO Auto-generated method stub
		FileReader reader = new FileReader(file); 
		int result = reader.read();
		while(result!=-1)
		{
			System.out.print((char)result);
			result = reader.read();
		}
		
	}

}
