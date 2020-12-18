package spring.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import spring.di.ui.ExamConsole;

public class Program {

	public static void main(String[] args) {
		
		/* 스프링에게 지시하는 방법으로 코드를 변경
		Exam exam = new NewlecExam();
		
		ExamConsole console = new GridExamConsole(exam); 
		*/
			
		//위의 부품들 중에 new로 선언한 객체가 바뀐다고 가정해보자.
		//new가 바뀔시 set조립문도 바뀌어야 하기 때문에 총 세가지를 모두 분리시켜야 한다.
		//부품을 생성, 조립해서 나에게 던져주는 게 스프링
		
		ApplicationContext context = 
				new AnnotationConfigApplicationContext("NewlecDIConfig.class");
		//spring 패키지 안에 di 패키지 안에 있는 setting.xml
		
//		Exam exam = context.getBean(Exam.class);
//		System.out.println(exam.toString());
		
		//ExamConsole console=context.getBean(ExamConsole.class);
		ExamConsole console=(ExamConsole) context.getBean("console");
		console.print(); //출력

//		List<Exam> exams = (List<Exam>) context.getBean("exams");//new ArrayList<>();
//		//exams.add(new NewlecExam(1,1,1,1));
//		
//		for(Exam e : exams){
//			System.out.println(e);
//		}
	}
}
