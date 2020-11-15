import java.util.ArrayList;
import java.util.Scanner;

class Bank_func{

	private String id;
	private String pw;
	private int balance;//잔고 저장
	private int money;//입력 받은 금액 저장
	ArrayList<String> pre = new ArrayList<String>();//직전 동작

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}


	public void login() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Insert your Id:");
		this.id = scan.nextLine();

		System.out.print("Insert your password:");
		this.pw = scan.nextLine();
	}

	public void menu() {		
		System.out.println("Welcome XYZ");
		System.out.println("Your ID is "+this.id);
		System.out.println();
		System.out.println("A. Check Balance");
		System.out.println("B. Deposit");
		System.out.println("C. Withdraw");
		System.out.println("D. Previous transaction");
		System.out.println("E. Exit");
	}//메뉴 출력

	public void balance() {
		System.out.println();
		System.out.println("----------------------------");
		System.out.println("Balance = "+balance);
		System.out.println("----------------------------");
		System.out.println();
	}

	public void deposit() {
		System.out.println();
		System.out.println("----------------------------");
		System.out.println("Enter an amount to deposit");
		System.out.println("----------------------------");

		Scanner scan = new Scanner(System.in);
		//입금, 출금 기능에서 금액 입력 받는 스캐너

		this.money = Integer.parseInt(scan.nextLine());

		if (money<=0) {
			System.out.println("0원 이상 입력하세요.");
		}else {			
			balance+=money;
			pre.add("Deposited: "+money);
		}

		System.out.println();

	}

	public void withdraw() {
		System.out.println();
		System.out.println("----------------------------");
		System.out.println("Enter an amount to withdraw");
		System.out.println("----------------------------");

		Scanner scan = new Scanner(System.in);
		//입금, 출금 기능에서 금액 입력 받는 스캐너

		this.money = Integer.parseInt(scan.nextLine());

		if(money>balance) {
			System.out.println("현재 잔고는 "+balance+"원 입니다.");
			System.out.println(balance+"원 이상 출금할 수 없습니다.");
			pre.add("잔고부족으로 출금하지 못했습니다.");
		}else if(money<=0){
			System.out.println("0원 이상 입력하세요.");
		}else {
			balance-=money;
			pre.add("withdrawn: "+money);			
		}

		System.out.println();

	}

	public void pre() {
		System.out.println();
		System.out.println("----------------------------");

		if(pre.isEmpty()) {
			System.out.println("아무동작도 하지 않았습니다!");
		}else {
			System.out.println(pre.get(pre.size()-1));
		}
		System.out.println("----------------------------");
		System.out.println();
	}
}
