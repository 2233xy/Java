import java.util.ArrayList;
import java.util.List;

import lab.Student;

public class StudentDAOImpl implements IStudentDAO {
	// 泛型
	static List<Student> students = new ArrayList<Student>();

	@Override
	public void insertStudent(Student stu) {
		// TODO 自动生成的方法存根
				students.add(stu);
				System.out.println("添加成功！");
	}

	@Override
	public void deleteStudent(String sno) {
		// TODO 自动生成的方法存根
		boolean flag = false;
		if (students.size() > 0) {
			for (Student stu : students) {
				if (sno.equals(stu.getSno())) {
					students.remove(stu);
					System.out.println("删除成功！");
					flag = true;
					break;

				}
			}
		}
		if (flag != true) {
			System.out.println("删除失败！");
		}
	}

	@Override
	public void updateStudent(Student stu) {
		// TODO 自动生成的方法存根
		for (Student s : students) {
			if (stu.getSno().equals(s.getSno())) {
				s.setSname(stu.getSname());
				s.setSdept(stu.getSdept());
				System.out.println("更新成功！");
			}
		}
	}

	@Override
	public Student findStudentBySno(String sno) {
		// TODO 自动生成的方法存根
		Student Stu = new Student();
		Stu = null;
		for (Student stu : students) {
			if (stu.getSno().equals(sno))
				Stu = stu;
		}
		return Stu;
	}

	@Override
	public void displayStudentBySno(String sno) {
		// TODO 自动生成的方法存根
		for (Student stu : students) {
			if (sno.equals(stu.getSno())) {
				System.out.println(stu);
				break;//学号重复的
			}
		}
	}

	@Override
	public void displayAllStudent() {
		// TODO 自动生成的方法存根
		if (students.size() > 0) {
			for (Student stu : students) {
				System.out.println("学号: " + stu.getSno() + "\t姓名: " + stu.getSname() + "\t系部: " + stu.getSdept());
			}
		} else {
			System.out.println("数据库中无学生记录!");
		}

	}

}
