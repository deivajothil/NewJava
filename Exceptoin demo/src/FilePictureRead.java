import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FilePictureRead {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		InputStream input = new FileInputStream("/home/jothi/Pictures/github.png");
		OutputStream output =new FileOutputStream("/home/jothi/Pictures/github11.png");

		int result = input.read(); 
		while(result!=-1)
		{
			output.write(result);
			result = input.read();
		}
	}

}
