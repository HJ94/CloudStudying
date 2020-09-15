package app;

/*
 * 문제 : 주어진 코드는 Bicycle 객체 b1을 생성하고 그 정보를 출력하는 코드이다. 해당 코드를 수정하여, 출력 예와 같은 결과를 얻으시오.
 */

public class BicycleTest {

	public static void main(String[] args) {
		Bicycle bc = new Bicycle();
		
		bc.name = "로드 바이크";
		bc.weight = 17.25;
		bc.price = 	500000;
	
		System.out.println("자전거 이름 : " + bc.name + "/ 자전거 무게 : "+ bc.weight+ "/ 자전거 가격 : " + bc.price);
	
	
		Bicycle bc2 = new Bicycle();
		
		bc2.name = "픽시 바이크";
		bc2.weight = 15.55;
		bc2.price = 350000;
	
		System.out.println("자전거 이름 : " + bc2.name + "/ 자전거 무게 : "+ bc2.weight+ "/ 자전거 가격 : " + bc2.price);
		
	
	}
	//새 자전거 객체 bc2 생성 
		
}


//자전거 클래스 생성 
class Bicycle{
	
	String name; //이름
	double weight; //무게
	int price; //가격
	
	void move() { //move메서드
		System.out.println("앞으로 이동합니다.");
	}
	void horn() { //horn메서드
		System.out.println("따르릉 벨");
	}
	
}