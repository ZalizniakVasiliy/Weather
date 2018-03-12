import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.IOException;

public class OutputWeatherData {
    public static void main(String[] args) {

        try {
            JSONParser parser = new JSONParser();
            JSONObject data = (JSONObject) parser.parse(new FileReader("E:/Soft" +
                    "/Java programming/bin/Nashville/src/main/resources/weather.json"));
            System.out.println("Today is weather conditions in Nashville are as follows: " + data);


            /* JSONArray jaData = (JSONArray) parser.parse(new FileReader("E:/Soft
            /Java programming/bin/Nashville/src/main/resources/weather.json"));*/
            /*for (Object o : jsonArray) {
                JSONObject conditions = (JSONObject) o;

                String coordinates = (String) conditions.get("coord");
                System.out.println("coordinates: " + coordinates);

                String weather = (String) conditions.get("weather");
                System.out.println("weather: " + weather);

                String base = (String) conditions.get("base");
                System.out.println("base: " + base);

                String main = (String) conditions.get("main");
                System.out.println("main: " + main);

                String visibility = (String) conditions.get("visibility");
                System.out.println("visibility: " + visibility);

                String wind = (String) conditions.get("wind");
                System.out.println("wind: " + wind);

                String clouds = (String) conditions.get("clouds");
                System.out.println("clouds: " + clouds);

                String dt = (String) conditions.get("dt");
                System.out.println("dt: " + dt);

                String sys = (String) conditions.get("sys");
                System.out.println("sys: " + sys);

                String id = (String) conditions.get("id");
                System.out.println("id: " + id);

                String name = (String) conditions.get("name");
                System.out.println("name: " + name);

                String cod = (String) conditions.get("cod");
                System.out.println("cod: " + cod);
            }*/

        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }
    }
}
