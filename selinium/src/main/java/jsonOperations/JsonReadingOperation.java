package jsonOperations;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonReadingOperation {

	public static void main(String[] args) throws IOException, ParseException {

		JSONParser parser = new JSONParser();
		
		FileReader reader = new FileReader("jsonfile.json");
		
		Object parsed = parser.parse(reader);
		
		JSONObject object = (JSONObject) parsed;
		
		System.out.println(object.get("name").toString());
		System.out.println(object.get("age").toString());
		System.out.println(object.get("Special Qualities").toString());
	}

}
