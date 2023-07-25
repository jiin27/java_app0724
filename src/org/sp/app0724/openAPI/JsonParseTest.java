package org.sp.app0724.openAPI;

import java.text.ParseException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

//JSON 이란? 자바스크립트 객체 표기법. xml과 함께 이기종간 데이터 교환시 사용되는 데이터 포맷(그냥 문자열)
//java는 json 이해 못함. 따라서 문자열에 불과한 json포맷을 자바 언어가 이해하도록 처리, 해석하는 프로그래밍을 배워보자.
//파싱법
public class JsonParseTest {

	public static void main(String[] args) {
		new JsonParseTest();
		
		//외부 라이브러리 maven repository
		
		//String 클래스의 특징
		//- 불변: 즉 한 번 선언된 String 객체는 수정이 불가. immutable (문자열 상수로 인식)
		
		//String 은 문자열 상수이므로 변할 수 없다. 따라서 다수의 문자열을 변경할 목적으로 프로그램을 작성할 때는 StringBuilder, StringBuffer
		//
		
		//명시적 선언법 explicit
		String s=new String();
		
		//암시적(묵시적) 선언법 implicit
		StringBuilder str= new StringBuilder();
		
		str.append("{");
		str.append("\"name\": \"철수\" ,");
		str.append("\"age\": 28,");
		str.append("\"children\" : [");
		str.append("{");
		str.append("\"type\":\"고양이\",");
		str.append("\"age\":2,");
		str.append("\"name\":\"나비\",");
		str.append("\"color\":\"검정\"");
		str.append("},");
		str.append("{");
		str.append("\"type\":\"강아지\",");
		str.append("\"age\":5,");
		str.append("\"name\":\"뽀미\",");
		str.append("\"color\":\"하얀색\"");
		str.append("}");
		str.append("]");
		str.append("}");
		
		System.out.println(str);
		
		JSONParser jsonParser=new JSONParser();
		try{
			JSONObject obj=(JSONObject)jsonParser.parse(str.toString());		
			//System.out.println(obj.get("name"));
			
			JSONArray array=(JSONArray)obj.get("children");
			System.out.println(array.size());
			for(int i=0; i<array.size(); i++) {
				JSONObject pet=(JSONObject)array.get(i);
				System.out.println("종류 "+pet.get("type"));
				System.out.println("나이 "+pet.get("age"));
				System.out.println("이름 "+pet.get("name"));
				System.out.println("색상 "+pet.get("color"));
			}
			
		} catch (org.json.simple.parser.ParseException e) {
			e.printStackTrace();
		}
		
	}
		
}
