package lab;
public class Student {
    private String  sno;
    private String  sname;
    private String  sdept;
    public Student() {
		// TODO 自动生成的构造函数存根
	}
	public Student(String sno, String sname, String sdept) {
		this.sno = sno;
		this.sname = sname;
		this.sdept = sdept;
	}
	public String getSno() {
		return sno;
	}
	public void setSno(String sno) {
		this.sno = sno;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getSdept() {
		return sdept;
	}
	public void setSdept(String sdept) {
		this.sdept = sdept;
	}
	@Override
	public String toString() {
		return "学号:" + sno + ", 姓名:" + sname + ",学生的系部:" + sdept ;
	}
	public String setSno() {
		// TODO 自动生成的方法存根
		return null;
	}
}
