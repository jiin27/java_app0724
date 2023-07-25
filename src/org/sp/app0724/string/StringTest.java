package org.sp.app0724.string;


/*
 * String 은 수정될 수 없다. 즉 문자열 상수로 본다.
 * 수정될 수 없으므로, 다수의 문자열 처리시 주의해야 한다.
 * */
public class StringTest {

	public static void main(String[] args) {
		
		String s1=new String("apple"); //명시적 선언법
		String s2=new String("apple"); //명시적 선언법
		
		System.out.println(s1==s2); //내용 비교가 아닌 주소 비교이기 때문에 결과 값 false.
		
		//암시적 선언법 - new 를 사용하지 않아도 인스턴스가 생성되었으므로,
		//					즉 new를 명시하지 않고 인스턴스를 생성했다고 묵시적, 암시적 생성법이라 한다.
		//+ 암시적 생성법으로 String 객체의 인스턴스를 생성하면, 힙영역의 Constant Pool에 생성되므로, 중복된 문자열 상수는 생성되지 않고 기존의 것을 이용한다.
		String m1="korea";
		String m2="korea";
		System.out.println(m1==m2); //두 래퍼런스 변수가 같은 문자열 상수를 가리키므로, 즉 같은 주소를 가리키고 있다. 결과 값 true.
		
		System.out.println(m1.equals(m2)); //내용 비교는 equals() 메서드를 사용한다.
	}
		
}
	
