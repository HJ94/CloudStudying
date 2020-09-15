package app;

/*
 클래스 스코프(scope)
 -필드의 활동 영역은 클래스 전체이다. 메소드 호출 시 필드를 사용할 수 있다.
 -이렇게 변수의 활동영역을 스코프(scope)라고 한다. 즉 ! 필드의 활동 영역은 클래스 전역이다!!
 */


public class CatTest3 {

	public static void main(String[] args) {
		
		Cat2 cat1 = new Cat2();
		Cat2 cat2 = new Cat2();	
	
		cat1.name = "네로";
		cat2.name = "나비";
		
		cat1.meow();
		cat2.meow();
		
		cat1.claw();
		cat2.claw();
		
	}

}
	
class Cat2{
	String name;
	String breeds;
	int age;
	
	void meow() {
		System.out.println(name +"의 야옹~");
	}
	void claw() {
		System.out.println(name + "의 할퀴기! 샥샥~");
	}
}