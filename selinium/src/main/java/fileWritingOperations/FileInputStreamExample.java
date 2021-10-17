package fileWritingOperations;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputStreamExample {

	public static void main(String[] args) throws IOException {

		String location = "C:\\Users\\Admin\\Documents\\Work\\fileoutputstream.txt";
		String content = "File Output Stream using Byte Successfully Saved";

		FileOutputStream fileOutputStream = new FileOutputStream(location);
		
		byte[] b = content.getBytes();
		
		fileOutputStream.write(b);
		
		fileOutputStream.close();

	}

}
