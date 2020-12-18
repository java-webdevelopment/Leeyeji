package spring.di.ui;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import spring.di.entity.Exam;

@Component("console")
public class InlineExamConsole implements ExamConsole {

	//�����޴� �� ������ (Exam)
	@Autowired
	//@Qualifier("exam2")
	private Exam exam;
	
	
	public InlineExamConsole() {
		System.out.println("constructor");
	}
	
	//source���� �ʵ带 ���� ������ ����, ����Ʈ
	public InlineExamConsole(Exam exam) {
		System.out.println("Overload constructor");
		this.exam = exam;
	}

	@Override
	public void print() {//inline�� examconsole �������̽��� ����� ����
		if(exam == null) {
			
			System.out.printf("total is %d, avg is %f\n", 0, 0.0);
		}else {
			
			System.out.printf("total is %d, avg is %f\n", exam.total(), exam.avg());
		}
	}//�������� Exam�� �޼������ ���

	
	@Override
	public void setExam(Exam exam) {
		System.out.println("setter");
		this.exam=exam;
	}
	public Exam getExam() {
		return exam;
	}
}
