package jsonOperations;

import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class JsonWritingOperation {

	public static void main(String[] args) throws IOException {

		JSONObject object = new JSONObject();
		object.put("age", 22);
		object.put("name", "Santhosh Kumar J");

		JSONArray array = new JSONArray();
		array.add("Magical Smile");
		array.add("Magnectic Eyes");

		object.put("Special Qualities", array);

		FileWriter writer = new FileWriter("jsonfile.json");

		writer.write(object.toJSONString());

		writer.close();

	}

}
