package app;

/*
 Ŭ������ ���� ������,��ü�� �ν��Ͻ�(Instance)��� �Ѵ�. 

 Cat cat1 = new Cat();
 cat1.meow; 
 �̷��� ��ü�� Ư�� ������ �����Ű�� ���� �ν��Ͻ� �޼��� ȣ���̶�� �Ѵ�.
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
		System.out.println("�߿�!");
	}
	void claw() {
		System.out.println("������!! ����!");
	}
}