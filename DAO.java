package mini;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class DAO {


	public static void main(String[] args) {

		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String user = "week7";
		String pwd = "week7";

		Connection con = null;
		PreparedStatement pt = null;
		ResultSet rs = null;
		String sql = null;

		Student_func s_f = new Student_func();
		s_f.student();

		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, user, pwd);
			sql = "insert into student (sname, gradelevel, s_id, course, balance) values "
					+ "(?, ?, s_seq.nextval, ?, ?)";
			pt = con.prepareStatement(sql);

			int i = 0;
			int re = 0;

			while(i<s_f.getStudent()) {//학생수만큼 반복				
				s_f.input();	

				pt.setString(1, s_f.getFirstName()+s_f.getLastName());
				pt.setString(2, s_f.getGradeLevel());
				pt.setString(3, s_f.getCourse().get(s_f.getCourse().size()-2));
				//-1하면 마지막 인덱스인 q나오니까 -2
				pt.setInt(4, s_f.getBalance());
				re = pt.executeUpdate();//반복마다 실행(디비에 저장됨)

				i++;
			}

			if(re==1) {
				System.out.println("저장되었습니다.");
			}
			
			//DB저장내용 출력
			sql = "select * from student where sname=?";
			pt = con.prepareStatement(sql);
			
			System.out.print("이름을 입력하세요(그만두려면 q): ");
			
			Scanner scan = new Scanner(System.in);
			String name_ = scan.nextLine();
			if(name_.equals("q")||name_.equals("Q")) {
				return;
			}
			pt.setString(1, name_);
			rs = pt.executeQuery();
			
			System.out.println("Students Data");
			while(rs.next()) {

				String name = rs.getString("sname");
				String gradelevel = rs.getString("gradelevel");
				int s_id = rs.getInt("s_id");
				String course = rs.getString("course");
				int balance = rs.getInt("balance");
				
				System.out.println("Name : "+name+" / Grade Level : "+gradelevel+" / ID : "+"0000"+s_id+
						" / Courses : "+course+" / Balance : "+balance);
			}

		}catch(Exception e) {e.printStackTrace();}
		finally {
			try {
				if(rs != null)	rs.close();
				if(pt != null) pt.close();
				if(con != null) con.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
