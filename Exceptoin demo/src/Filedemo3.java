import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Filedemo3 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file = new File("/home/jothi/Desktop/two.txt");
		file.createNewFile();
		FileWriter fw = new FileWriter(file); 
		fw.write("Shriram\n"); 
		fw.write("Arulraj");
		fw.write("Gorky");
		fw.write("Abisha");
		fw.flush();
		fw.close();
	}

}
