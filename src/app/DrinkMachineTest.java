package app;

/*
  메소드 스코프(scope)
  -파라미터와 지역변수의 경우, 메소드 스코프를 가진다. 즉, 이들의 활동 영역은 해당 메소드 내부로 제한되는데
    여기서 지역변수란, 메소드 내부에 선언된 변수이다.
  
  ex)
  void pushButton(int num){     //파라미터 num은 pushButton메서드 안에서만 활동할 수 있는데 이것을 메서드 스코프라고한다.
  	String[] drinks = {"콜라", "사이다", "맥주"};  //drinks처럼 메서드 내부에 선언된 변수를 지역변수(로컬변수)라고 한다.
  	output = drinks[num];
 */

public class DrinkMachineTest {

	public static void main(String[] args) {
		DrinkMachine dm1 = new DrinkMachine();
		DrinkMachine dm2 = new DrinkMachine();
		
		//음료 뽑기
		dm1.pushButton(1);
		dm2.pushButton(2);
		
		//뽑은 음료 확인
		dm1.printOutput();
		dm2.printOutput();
	
	}

}


class DrinkMachine{
	//필드로서 DrinkMachine클래스 전역에서 활동할 수 있다.
	String output;
	
	//메서드 - pushButton메서드의 파라미터 num은 메서드 안에서만 활동할 수 있다.
	void pushButton(int num) {
		String[] drinks = {"콜라" , "사이다", "맥주"};
		output = drinks[num];
	}
	void printOutput() {
		System.out.println(output);
	}
	
	
}