package fileWritingOperations;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class pathExample {

	public static void main(String[] args) throws IOException {
		
		String location = "C:\\Users\\Admin\\Documents\\Work\\pathtext.txt";
		String content = "File using Path Successfully Saved";

		Path path = Paths.get(location);
		
		Files.write(path, content.getBytes());

	}

}
