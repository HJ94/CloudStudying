package app;

/*
 * ���� : �־��� �ڵ�� Bicycle ��ü b1�� �����ϰ� �� ������ ����ϴ� �ڵ��̴�. �ش� �ڵ带 �����Ͽ�, ��� ���� ���� ����� �����ÿ�.
 */

public class BicycleTest {

	public static void main(String[] args) {
		Bicycle bc = new Bicycle();
		
		bc.name = "�ε� ����ũ";
		bc.weight = 17.25;
		bc.price = 	500000;
	
		System.out.println("������ �̸� : " + bc.name + "/ ������ ���� : "+ bc.weight+ "/ ������ ���� : " + bc.price);
	
	
		Bicycle bc2 = new Bicycle();
		
		bc2.name = "�Ƚ� ����ũ";
		bc2.weight = 15.55;
		bc2.price = 350000;
	
		System.out.println("������ �̸� : " + bc2.name + "/ ������ ���� : "+ bc2.weight+ "/ ������ ���� : " + bc2.price);
		
	
	}
	//�� ������ ��ü bc2 ���� 
		
}


//������ Ŭ���� ���� 
class Bicycle{
	
	String name; //�̸�
	double weight; //����
	int price; //����
	
	void move() { //move�޼���
		System.out.println("������ �̵��մϴ�.");
	}
	void horn() { //horn�޼���
		System.out.println("������ ��");
	}
	
}