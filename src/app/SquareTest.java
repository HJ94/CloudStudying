package app;

public class SquareTest {

	public static void main(String[] args) {
		Square sq = new Square();
		
		sq.length = 4;
		sq.area();
		
		System.out.println("�� ���� ���̰� "+ sq.length + "�� ���簢���� ���� : " + sq.area());
	}

}
//���簢�� Ŭ����
class Square{
	//�ʵ� - �� ���� ����!
	int length;
	
	//�޼��� - ���簢���� ���� ��ȯ!
	int area() {
		return length * length;

	}
}