package app;

/*
 Ŭ���� ������(scope)
 -�ʵ��� Ȱ�� ������ Ŭ���� ��ü�̴�. �޼ҵ� ȣ�� �� �ʵ带 ����� �� �ִ�.
 -�̷��� ������ Ȱ�������� ������(scope)��� �Ѵ�. �� ! �ʵ��� Ȱ�� ������ Ŭ���� �����̴�!!
 */


public class CatTest3 {

	public static void main(String[] args) {
		
		Cat2 cat1 = new Cat2();
		Cat2 cat2 = new Cat2();	
	
		cat1.name = "�׷�";
		cat2.name = "����";
		
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
		System.out.println(name +"�� �߿�~");
	}
	void claw() {
		System.out.println(name + "�� ������! ����~");
	}
}