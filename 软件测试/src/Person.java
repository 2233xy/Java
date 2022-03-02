import java.util.regex.Pattern;

public class Person {
    int age;
    String gender;
    String marriage;
    int child;
    boolean flag = true;

    public Person() {
    }

    public Person(String age, String gender, String marriage, String child) {
        if (ageCheck(age)) {
            this.age = Integer.parseInt(age);
        } else {
            flag = false;
        }
        if (genderCheck(gender)) {
            this.gender = gender;
        } else {
            flag = false;
        }
        if (marriageCheck(marriage)) {
            this.marriage = marriage;
        } else {
            flag = false;
        }
        if (childCheck(child)) {
            if (child.equals("")) {
                child = "0";
            }
            this.child = Integer.parseInt(child);
        } else {
            flag = false;
        }
    }

    public boolean ageCheck(String age) {
        Pattern pattern = Pattern.compile("^[1-9][0-9]?$");
        return pattern.matcher(age).matches();
    }

    public boolean genderCheck(String gender) {
        return gender.equals("M") || gender.equals("F");
    }

    public boolean marriageCheck(String marriage) {
        return marriage.equals("已婚") || marriage.equals("未婚");
    }

    public boolean childCheck(String child) {
        Pattern pattern = Pattern.compile("[1-9]*");
        return pattern.matcher(child).matches();
    }
}
