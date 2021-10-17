package fileWritingOperations;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterExample {

	public static void main(String[] args) throws IOException {
		
		String location = "C:\\Users\\Admin\\Documents\\Work\\bufferfile.txt";
		String content = "BufferWriter Successfully Saved\nThis is Secondline";
		
		FileWriter fileWriter = new FileWriter(location);
		
		BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
		
		bufferedWriter.write(content);
		
		bufferedWriter.close();

	}

}
