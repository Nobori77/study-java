package jsonTest;

import java.util.ArrayList;
import java.util.Arrays;

import org.json.JSONArray;
import org.json.JSONObject;

public class JsonTask {
   public static void main(String[] args) {
//      "/news", "/game", "/brand", "/rank"
//      위 4개 경로를 모두 ArrayList에 추가하고,
//      경로 앞에 "/app"을 붙인 뒤
//      JSONArray로 변경하기
      ArrayList<String> result = new ArrayList<String>(
    		  Arrays.asList(
    				  new String("/news"),
    				  new String("/game"),
    				  new String("/brand"),
    				  new String("/rank")
    				  )
    		  );
      
    JSONObject userJSON = new JSONObject();
    JSONArray usersJSON = new JSONArray();
    	
    result
      	.stream()
      	.map(p -> "/app" + p)
      	.forEach(usersJSON::put);
    
    System.out.println(usersJSON);
	   
   }
}