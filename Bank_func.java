import java.util.Scanner;

class Bank_func{

	Scanner scan = new Scanner(System.in);

	private int balance;
	private int money;
	private String pre;

	public void menu(String id) {		
		System.out.println("Welcome XYZ");
		System.out.println("Your ID is "+id);
		System.out.println();
		System.out.println("A. Check Balance");
		System.out.println("B. Deposit");
		System.out.println("C. Withdraw");
		System.out.println("D. Previous transaction");
		System.out.println("E. Exit");
	}//메뉴 출력

	public void balance() {
		System.out.println();
		System.out.println("-------------------");
		System.out.println("Balance = "+balance);
		System.out.println("-------------------");
		System.out.println();
	}

	public void deposit() {
		System.out.println();
		System.out.println("-------------------");
		System.out.println("Enter an amount to deposit");
		System.out.println("-------------------");
		this.money = Integer.parseInt(scan.nextLine());

		if (money<=0) {
			System.out.println("0원 이상 입력하세요.");
		}else {			
			balance+=money;
			pre = "Deposited: ";
		}

		System.out.println();
	}

	public void withdraw() {
		System.out.println();
		System.out.println("-------------------");
		System.out.println("Enter an amount to withdraw");
		System.out.println("-------------------");
		this.money = Integer.parseInt(scan.nextLine());

		if(money>balance) {
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

	public void pre() {
		System.out.println();
		System.out.println("-------------------");			

		if(pre==null) {
			System.out.println("아무동작도 하지 않았습니다!");
		}else if(balance==0) {
			System.out.println(pre+money);
		}else if(money>balance) {
			System.out.println("잔고보다 금액이 많아 출금 실패하였습니다.");
		}else {
			System.out.println(pre+money);
		}
		System.out.println("-------------------");
		System.out.println();
	}
}
