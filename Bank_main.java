import java.util.Scanner;

public class Bank_main {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);//메뉴 입력 받음
		Bank_func f = new Bank_func();//메뉴들의 기능이 담긴 클래스 호출
		
		f.login();
		String id = f.getId();
		String pw = f.getPw();
		
		if(id.equals("lee") && pw.equals("1234")) {
			f.menu();
			while(true) {
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
					System.out.println();
				}//if
			}//while end
		}else {
			System.out.println("Please check your id&password");
			return;
		}
		sc.close();
	}//main end	
}
