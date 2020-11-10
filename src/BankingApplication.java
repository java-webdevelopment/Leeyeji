import java.util.Scanner;

public class BankingApplication {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);//�޴� �Է� ����

		System.out.print("Insert your Id:");
		String id = sc.nextLine();
		System.out.print("Insert your password:");
		String pw = sc.nextLine();

		Banking_func f = new Banking_func();//�޴����� ����� ��� Ŭ���� ȣ��

		if(id.equals("lee") && pw.equals("1234")) {//id, pw 식별
			while(true) {
				f.menu(id);//id�� �޴� ��� �޼��忡 ����
				System.out.println("===================================");
				System.out.println("Enter an option");
				System.out.println("===================================");

				String menu = sc.nextLine();//�޴� �Է�

				if(menu.equals("a")||menu.equals("A")) {
					f.balance();
				}else if(menu.equals("b")||menu.equals("B")){
					f.deposit();
				}else if(menu.equals("c")||menu.equals("C")) {
					f.withdraw();
				}else if(menu.equals("d")||menu.equals("D")) {
					f.pre();		
				}else if(menu.equals("e")||menu.equals("E")) {
					break;
				}else {					
					System.out.println("�ٸ� ���� �Է����ּ���!");
				}//if
			}//while end
		}else {
			System.out.println("Please check your id&password");
			return;
		}
		sc.close();
	}//main end	
}
