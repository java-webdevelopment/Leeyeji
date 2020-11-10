import java.util.Scanner;

class Banking_func{

	Scanner scan = new Scanner(System.in);
	
	private int balance;
	private int money;
	private String pre;
	
	public void menu(String id) {//Bank_main클래스에서 id값 전달받음
		System.out.println("Welcome XYZ");
		System.out.println("Your ID is "+id);//id 출력
		System.out.println();
		System.out.println("A. Check Balance");
		System.out.println("B. Deposit");
		System.out.println("C. Withdraw");
		System.out.println("D. Previous transaction");
		System.out.println("E. Exit");
	}//메뉴 출력

	public void balance() {//잔고
		System.out.println();
		System.out.println("-------------------");
		System.out.println("Balance = "+balance);
		System.out.println("-------------------");
		System.out.println();
	}

	public void deposit() {//입금
		System.out.println();
		System.out.println("-------------------");
		System.out.println("Enter an amount to deposit");
		System.out.println("-------------------");
		this.money = Integer.parseInt(scan.nextLine());//금액 입력
		
		if (money<=0) {
			System.out.println("0원 이상 입력하세요.");
		}else {			
			balance+=money;
			pre = "Deposited: ";
		}
		
		System.out.println();
	}
	
	public void withdraw() {//출금
		System.out.println();
		System.out.println("-------------------");
		System.out.println("Enter an amount to withdraw");
		System.out.println("-------------------");
		this.money = Integer.parseInt(scan.nextLine());
		
		if(money>=balance) {
			System.out.println("현재 잔고는 "+balance+"원 입니다.");
			System.out.println(balance+"원 이상 출금할 수 없습니다.");
		}else if(money<=0){
			System.out.println("0원 이상 입력하세요.");
		}else {
			balance-=money;
		}
		pre = "withdrawn: ";			
		
		System.out.println();
	}
	
	public void pre() {//직전 동작
		System.out.println();
		System.out.println("-------------------");			
		System.out.println(pre+money);
		if(money>balance) {
			System.out.println("잔고보다 금액이 많아 출금 실패하였습니다.");
		}
		System.out.println("-------------------");
		System.out.println();
	}
}
