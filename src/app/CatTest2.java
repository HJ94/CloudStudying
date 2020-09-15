package app;

/*
 클래스를 통해 생성된,객체를 인스턴스(Instance)라고 한다. 

 Cat cat1 = new Cat();
 cat1.meow; 
 이렇게 객체에 특정 동작을 수행시키는 것을 인스턴스 메서드 호출이라고 한다.
 */
public class CatTest2 {

	public static void main(String[] args) {
		Cat cat1 = new Cat();
		Cat cat2 = new Cat();
		
		cat1.meow();
		cat2.meow();
		
		cat1.claw();
		cat2.claw();
	}

}

class Cat{
	String name;
	String breeds;
	int age;
	
	void meow() {
		System.out.println("야옹!");
	}
	void claw() {
		System.out.println("할퀴기!! 슥샥!");
	}
}