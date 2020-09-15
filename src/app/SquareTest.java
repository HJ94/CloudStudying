package app;

public class SquareTest {

	public static void main(String[] args) {
		Square sq = new Square();
		
		sq.length = 4;
		sq.area();
		
		System.out.println("한 변의 길이가 "+ sq.length + "인 정사각형의 넓이 : " + sq.area());
	}

}
//정사각형 클래스
class Square{
	//필드 - 한 변의 길이!
	int length;
	
	//메서드 - 정사각형의 넓이 반환!
	int area() {
		return length * length;

	}
}