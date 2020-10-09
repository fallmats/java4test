package se.addq.java4test;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;
import java.util.Iterator;

public class JsonExample {

    public String getName() {
        String name = "";
        JSONParser parser = new JSONParser();
        String filename = this.getClass().getClassLoader().getResource("persons.json").getPath();
        try {
            Object obj = parser.parse(new FileReader(filename));
            JSONObject jsonObject = (JSONObject) obj;

            JSONArray companyList = (JSONArray) jsonObject.get("persons");

            Iterator<JSONObject> iterator = companyList.iterator();

            while (iterator.hasNext()) {
                JSONObject jo = iterator.next();
                System.out.println(jo);
                name = jo.get("name").toString();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return name;
    }
}