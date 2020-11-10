import java.util.Scanner;

public class BankingApplication {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);//메뉴 입력 받음

		System.out.print("Insert your Id:");
		String id = sc.nextLine();
		System.out.print("Insert your password:");
		String pw = sc.nextLine();

		Banking_func f = new Banking_func();//메뉴들의 기능이 담긴 클래스 호출

		if(id.equals("lee") && pw.equals("1234")) {
			while(true) {
				f.menu(id);//id를 메뉴 출력 메서드에 전달
				System.out.println("===================================");
				System.out.println("Enter an option");
				System.out.println("===================================");

				String menu = sc.nextLine();//메뉴 입력

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
					System.out.println("바른 값을 입력해주세요!");
				}//if
			}//while end
		}else {
			System.out.println("Please check your id&password");
			return;
		}
		sc.close();
	}//main end	
}
