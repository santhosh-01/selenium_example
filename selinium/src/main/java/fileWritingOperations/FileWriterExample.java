package fileWritingOperations;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {

	public static void main(String[] args) throws IOException {
		
		String location = "C:\\Users\\Admin\\Documents\\Work\\file.txt";
		String content = "Successfully Saved";
		
		FileWriter fileWriter = new FileWriter(location);
		
		fileWriter.write(content);
		
		fileWriter.close();
		
	}

}
