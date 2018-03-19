import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.IOException;

public class OutputWeatherData {
    public static void main(String[] args) {
        try {
            JSONParser parser = new JSONParser();
            JSONObject data = (JSONObject) parser.parse(new FileReader("src/resources/weather.json"));
            System.out.println("Today is weather conditions in Nashville are as follows: " + data);
        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }
    }
}
