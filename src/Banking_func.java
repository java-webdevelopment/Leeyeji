import java.util.Scanner;

class Banking_func{

	Scanner scan = new Scanner(System.in);
	
	private int balance;
	private int money;
	private String pre;
	
	public void menu(String id) {//Bank_mainŬ�������� id�� ���޹���	
		System.out.println("Welcome XYZ");
		System.out.println("Your ID is "+id);//id�� ���
		System.out.println();
		System.out.println("A. Check Balance");
		System.out.println("B. Deposit");
		System.out.println("C. Withdraw");
		System.out.println("D. Previous transaction");
		System.out.println("E. Exit");
	}//�޴� ��� �޼���

	public void balance() {//�ܰ� ���
		System.out.println();
		System.out.println("-------------------");
		System.out.println("Balance = "+balance);
		System.out.println("-------------------");
		System.out.println();
	}

	public void deposit() {//�Ա�
		System.out.println();
		System.out.println("-------------------");
		System.out.println("Enter an amount to deposit");
		System.out.println("-------------------");
		this.money = Integer.parseInt(scan.nextLine());//�ݾ� �Է�
		
		if (money<=0) {
			System.out.println("0�� �̻� �Է��ϼ���.");
		}else {			
			balance+=money;
			pre = "Deposited: ";
		}
		
		System.out.println();
	}
	
	public void withdraw() {//���
		System.out.println();
		System.out.println("-------------------");
		System.out.println("Enter an amount to withdraw");
		System.out.println("-------------------");
		this.money = Integer.parseInt(scan.nextLine());
		
		if(money>=balance) {
			System.out.println("���� �ܰ�� "+balance+"�� �Դϴ�.");
			System.out.println(balance+"�� �̻� ����� �� �����ϴ�.");
		}else if(money<=0){
			System.out.println("0�� �̻� �Է��ϼ���.");
		}else {
			balance-=money;
		}
		pre = "withdrawn: ";			
		
		System.out.println();
	}
	
	public void pre() {//���� ����
		System.out.println();
		System.out.println("-------------------");			
		System.out.println(pre+money);
		if(money>balance) {
			System.out.println("�ܰ��� �ݾ��� ���� ��� �����Ͽ����ϴ�.");
		}
		System.out.println("-------------------");
		System.out.println();
	}
}
