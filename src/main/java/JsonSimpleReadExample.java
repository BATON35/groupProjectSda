import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class JsonSimpleReadExample {


    public static void main(String[] args) {

        JSONParser parser = new JSONParser();
        try {

            Object obj = parser.parse(new FileReader("listaNBP.json"));
            System.out.println(obj);
            JSONObject jsonObject = (JSONObject) obj;
            String currency = (String) jsonObject.get("currency");
            System.out.println(currency);

            JSONArray tablicaWalut = (JSONArray) jsonObject.get("rates");
            Iterator<Object> iterator = tablicaWalut.iterator();
            List<Object> objectList = new ArrayList<Object>();
            while (iterator.hasNext()) {
                int index = 0;
                objectList.add(index, iterator.next().toString());
                index++;
            }
            for (Object object : objectList) {
                System.out.println(object);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }


    }

}