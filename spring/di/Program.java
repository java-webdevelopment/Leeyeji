package spring.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import spring.di.ui.ExamConsole;

public class Program {

	public static void main(String[] args) {
		
		/* ���������� �����ϴ� ������� �ڵ带 ����
		Exam exam = new NewlecExam();
		
		ExamConsole console = new GridExamConsole(exam); 
		*/
			
		//���� ��ǰ�� �߿� new�� ������ ��ü�� �ٲ�ٰ� �����غ���.
		//new�� �ٲ�� set�������� �ٲ��� �ϱ� ������ �� �������� ��� �и����Ѿ� �Ѵ�.
		//��ǰ�� ����, �����ؼ� ������ �����ִ� �� ������
		
		ApplicationContext context = 
				new AnnotationConfigApplicationContext("NewlecDIConfig.class");
		//spring ��Ű�� �ȿ� di ��Ű�� �ȿ� �ִ� setting.xml
		
//		Exam exam = context.getBean(Exam.class);
//		System.out.println(exam.toString());
		
		//ExamConsole console=context.getBean(ExamConsole.class);
		ExamConsole console=(ExamConsole) context.getBean("console");
		console.print(); //���

//		List<Exam> exams = (List<Exam>) context.getBean("exams");//new ArrayList<>();
//		//exams.add(new NewlecExam(1,1,1,1));
//		
//		for(Exam e : exams){
//			System.out.println(e);
//		}
	}
}
