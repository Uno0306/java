package step02_collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.json.JSONArray;
import org.json.JSONObject;


import model.domain.Student;

public class Ex05JSON {
	public static void main(String[] args) {
		// JSON Object
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("name", "Java");
		jsonObject.put("age", 27);
		System.out.println(jsonObject);
		
		// HashMap으로 JSONObject 생성
		Map<String, String> map = new HashMap<String, String>();
		map.put("name", "Java");
		map.put("age", "27");
		
		JSONObject jsonObject2 = new JSONObject(map);
		System.out.println(jsonObject2);
		
		// JSON문자열로 JSONObject 생성
		// 큰따옴표 앞에 역슬래쉬를 붙여주면 문자열로 취급함
		JSONObject jsonObject3 = new JSONObject("{\"name\":\"Java\",\"age\":\"27\"}");
		System.out.println(jsonObject3);
		
		// POJO로 JSONObject 생성
		Student student1 = new Student("Java", 1, "Junior");
		JSONObject jsonObject4 = new JSONObject(student1);
		System.out.println(jsonObject4.get("name"));
		
		// List로 JSONObejct 생성
		List<String> friendList = new ArrayList<String>();
		friendList.add("Sam");
		friendList.add("Harry");
		
		JSONArray jsonFriendList = new JSONArray(friendList);
		System.out.println(friendList);
		System.out.println(jsonFriendList);
		
		JSONObject jsonObject5 = new JSONObject();
		jsonObject5.put("name", "Java");
		jsonObject5.put("age", "27");
		jsonObject5.put("friends", jsonFriendList);
		
		System.out.println(jsonObject5);
	}

}