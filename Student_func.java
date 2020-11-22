package mini;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Student_func {

	private int student=0; //학생수
	private String firstName=null;
	private String lastName=null;
	private int balance=0;
	private int classLevel;
	private String gradeLevel;
	private ArrayList<String> course = new ArrayList<>();
	private int payment=0;
	
	
	public void student() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of new students to enroll: ");
		//학생 수 입력
		try {			
			setStudent(Integer.parseInt(sc.nextLine())); 
		}catch(Exception e) {
			System.out.println("숫자를 입력하세요!");
		}
	}
	
	public void input() {

		Scanner sc = new Scanner(System.in);

			//sname 컬럼
			System.out.print("Enter student first name: ");
			setFirstName(sc.nextLine());
			System.out.print("Enter student last name: ");
			setLastName(sc.nextLine());
			
			//balance 컬럼
			
			System.out.println("Enter your balance: ");
			try {
			setBalance(Integer.parseInt(sc.nextLine()));
			}catch(Exception e) {
				System.out.println("숫자를 입력하세요!");
			}

			//gradelevel 컬럼
			System.out.println("1 - Freshmen\n 2 - Sophmore \n 3 - Junior \n 4 - Senior");
			System.out.print("Enter student class level:");
			try {				
				classLevel = Integer.parseInt(sc.nextLine());
				if(classLevel<1 || classLevel>4) {
					System.out.println("숫자를 입력하세요!(1~4)");
				}
			}catch(Exception e) {
				System.out.println("숫자를 입력하세요!(1~4)");
			}
			switch(classLevel) {
				case 1 : setGradeLevel("1. Freshmen"); break;
				case 2 : setGradeLevel("2. Sophmore"); break;
				case 3 : setGradeLevel("3. Junior"); break;
				case 4 : setGradeLevel("4. Senior"); break;
				default : System.out.println("다시 입력하세요."); break;
			}//for
			while(true) {
				System.out.print("Enter course to enroll (Q to quit):"); 
				try {					
					getCourse().add(sc.nextLine());
				}catch(Exception e) {
					System.out.println("바른 값을 입력하세요!");
				}
				if(getCourse().get(getCourse().size()-1).equals("q")
						||getCourse().get(getCourse().size()-1).equals("Q")){
					break;
				}
			}//while

			//잔액과 결제
			System.out.println("Your balance is : "+getBalance());
			System.out.print("Enter your payment: $");
			try {				
				payment = Integer.parseInt(sc.nextLine());
				if(payment<0) {
					System.out.println("0원 이상 입력하세요!");
				}
			}catch(Exception e) {
				System.out.println("숫자를 입력하세요!");
			}
			System.out.println("Your balance is : "+(getBalance()-payment));
			setBalance(getBalance() - payment);
		
	}

	public int getStudent() {
		return student;
	}

	public void setStudent(int student) {
		this.student = student;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getGradeLevel() {
		return gradeLevel;
	}

	public void setGradeLevel(String gradeLevel) {
		this.gradeLevel = gradeLevel;
	}

	public ArrayList<String> getCourse() {
		return course;
	}

	public void setCourse(ArrayList<String> course) {
		this.course = course;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
}