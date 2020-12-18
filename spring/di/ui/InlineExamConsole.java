package spring.di.ui;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import spring.di.entity.Exam;

@Component("console")
public class InlineExamConsole implements ExamConsole {

	//물려받는 걸 적어줌 (Exam)
	@Autowired
	//@Qualifier("exam2")
	private Exam exam;
	
	
	public InlineExamConsole() {
		System.out.println("constructor");
	}
	
	//source에서 필드를 가진 생성자 생성, 임포트
	public InlineExamConsole(Exam exam) {
		System.out.println("Overload constructor");
		this.exam = exam;
	}

	@Override
	public void print() {//inline이 examconsole 인터페이스의 기능을 구현
		if(exam == null) {
			
			System.out.printf("total is %d, avg is %f\n", 0, 0.0);
		}else {
			
			System.out.printf("total is %d, avg is %f\n", exam.total(), exam.avg());
		}
	}//물려받은 Exam의 메서드들을 사용

	
	@Override
	public void setExam(Exam exam) {
		System.out.println("setter");
		this.exam=exam;
	}
	public Exam getExam() {
		return exam;
	}
}
