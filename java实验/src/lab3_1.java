class Person {
    private String name;
    private int age;
    private String sex;

    public Person() {
    }

    public Person(String name, String sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + "," + sex + "," + age;
    }

}

class Student extends Person {
    private String no;
    private String enter;
    private String major;

    public Student(String name, String sex, int age, String no, String enter, String major) {
        super(name, sex, age);
        this.no = no;
        this.enter = enter;
        this.major = major;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString() + "," + no + "," + enter + "," + major;
    }

}

class Teacher extends Person {
    private String pro;
    private String dept;

    public Teacher(String name, String sex, int age, String pro, String dept) {
        super(name, sex, age);
        this.pro = pro;
        this.dept = dept;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString() + "," + pro + "," + dept;
    }

}

public class lab3_1 {
    public static void main(String[] args) {
        Student stu = new Student("小明", "男", 20, "202202201", "2022", "计算机科学与技术");
        Teacher tea = new Teacher("小红", "女", 30, "教授", "计算机科学与技术学院");
        System.out.println("学生的信息为：" + stu);
        System.out.println("教师的信息为：" + tea);
    }
}
