import lab.Student;

public interface IStudentDAO {
	// 插入学生信息记录
	public void insertStudent(Student stu);
	// 删除指定学号学生信息记录
	public void deleteStudent(String sno);
	// 更新指定学生信息记录
	public void updateStudent(Student stu);
	// 按学号查询指定学生信息记录
	public Student findStudentBySno(String sno);
	// 显示指定学号学生信息记录
	public void displayStudentBySno(String sno);
	// 显示所有学生信息记录
	public void displayAllStudent();
  
}
