package Utility;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Utility {
//    WebDriver driver;
    String fileName = "./src/test/resources/Users.json";
    String accountinfo = "./src/test/resources/accountinfo.json";

//    public Utility(WebDriver driver){
//        this.driver = driver;
//        PageFactory.initElements(driver,this);
//    }

    public void writeInJSON(String username, String password) throws IOException, ParseException {
        JSONParser jsonParser = new JSONParser();
        Object obj = jsonParser.parse(new FileReader(fileName));
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("username",username);
        jsonObject.put("password", password);
        JSONArray jsonArray = (JSONArray) obj;
        jsonArray.add(jsonObject);
        FileWriter file = new FileWriter(fileName);
        file.write(jsonArray.toJSONString());
        file.flush();
    }

    public String readFromJSON(int position, String key) throws IOException, ParseException {
        JSONParser jsonParser = new JSONParser();
        Object object = jsonParser.parse(new FileReader(fileName));
        JSONArray jsonArray = (JSONArray) object;
        JSONObject jsonObject = (JSONObject) jsonArray.get(position);
        String value = (String) jsonObject.get(key);
        return value;
    }


    public void writeInJSONaccount(String newaccount) throws IOException, ParseException {
        JSONParser jsonParser = new JSONParser();
        Object obj = jsonParser.parse(new FileReader(accountinfo));
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("newaccount",newaccount);
        JSONArray jsonArray = (JSONArray) obj;
        jsonArray.add(jsonObject);
        FileWriter file = new FileWriter(accountinfo);
        file.write(jsonArray.toJSONString());
        file.flush();
    }
}
