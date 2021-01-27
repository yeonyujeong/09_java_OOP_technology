package step9_01.OOP_Theory;

/*
 *  # toString
 *  
 *  - 객체의 주소를 문자열 형태로 반환한다.
 *  
 * 
 * */

class Test1{
	
}

class Test2{

	@Override
	public String toString() {
		return "객체에 대한 설명";
	}
}

class Test3{
	
	String name;
	int age;
	
	// 자동완성 기능 : 이클립스 좌측상단 Source > Generate Construct using fields
	public Test3(String name, int age) {
		this.name = name;
		this.age = age;
	}

	
	// 자동완성 기능 :  이클립스 좌측상단 Source > Generate toString()
	@Override
	public String toString() {
		return "Test3 [name=" + name + ", age=" + age + "]";
	}
	
	
	
}


public class OOPEx01 {

	public static void main(String[] args) {

		Test1 t1 =  new Test1();
		System.out.println(t1);		// 객체의 주소가 콘솔에 출력된다.
		
		Test1 t2 =  new Test1();	// 객체의 주소가 콘솔에 출력된다.
		System.out.println(t2);
		
		System.out.println("===================================");
		
		Test2 t3 = new Test2();		
		System.out.println(t3);		// toString()메서드의 return값이 콘솔에 출력된다.
		
		Test2 t4 = new Test2();
		System.out.println(t4);		// toString()메서드의 return값이 콘솔에 출력된다.

		System.out.println("===================================");
		
		Test3 t5 = new Test3("제임스 고슬링" , 50);
		System.out.println(t5);		// toString()메서드의 return값이 콘솔에 출력된다.
		
		Test3 t6 = new Test3("팀 버너스 리" , 55);
		System.out.println(t6);		// toString()메서드의 return값이 콘솔에 출력된다.
		
	}

}
