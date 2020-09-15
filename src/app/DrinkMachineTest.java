package app;

/*
  �޼ҵ� ������(scope)
  -�Ķ���Ϳ� ���������� ���, �޼ҵ� �������� ������. ��, �̵��� Ȱ�� ������ �ش� �޼ҵ� ���η� ���ѵǴµ�
    ���⼭ ����������, �޼ҵ� ���ο� ����� �����̴�.
  
  ex)
  void pushButton(int num){     //�Ķ���� num�� pushButton�޼��� �ȿ����� Ȱ���� �� �ִµ� �̰��� �޼��� ����������Ѵ�.
  	String[] drinks = {"�ݶ�", "���̴�", "����"};  //drinksó�� �޼��� ���ο� ����� ������ ��������(���ú���)��� �Ѵ�.
  	output = drinks[num];
 */

public class DrinkMachineTest {

	public static void main(String[] args) {
		DrinkMachine dm1 = new DrinkMachine();
		DrinkMachine dm2 = new DrinkMachine();
		
		//���� �̱�
		dm1.pushButton(1);
		dm2.pushButton(2);
		
		//���� ���� Ȯ��
		dm1.printOutput();
		dm2.printOutput();
	
	}

}


class DrinkMachine{
	//�ʵ�μ� DrinkMachineŬ���� �������� Ȱ���� �� �ִ�.
	String output;
	
	//�޼��� - pushButton�޼����� �Ķ���� num�� �޼��� �ȿ����� Ȱ���� �� �ִ�.
	void pushButton(int num) {
		String[] drinks = {"�ݶ�" , "���̴�", "����"};
		output = drinks[num];
	}
	void printOutput() {
		System.out.println(output);
	}
	
	
}