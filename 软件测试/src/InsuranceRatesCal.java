import java.util.LinkedList;
import java.util.Scanner;

public class InsuranceRatesCal {
    private Person temp = null;
    private int counter = 1;
    LinkedList<Person> list = new LinkedList<Person>();

    public InsuranceRatesCal() {
        String age, gender, marriage, child;
        Scanner sc = new Scanner(System.in);
        for (int i = 1; ; i++) {
            System.out.println("第" + i + "位客户");
            System.out.println("年龄:");
            if ((age = sc.nextLine()).equals("-1")) {
                break;
            }
            System.out.println("性别:");
            gender = sc.nextLine();
            System.out.println("婚姻:");
            marriage = sc.nextLine();
            System.out.println("子女:");
            child = sc.nextLine();
            System.out.println("已登记");
            list.add(new Person(age, gender, marriage, child));
        }
        sc.close();
    }

    public float rateCal() {
        int points = 0;
        if (temp.age >= 20 && temp.age <= 39) {
            points += 6;
        } else if (temp.age >= 40 && temp.age <= 59) {
            points += 4;
        } else {
            points += 2;
        }
        if (temp.gender.equals("M")) {
            points += 5;
        } else {
            points += 3;
        }
        if (temp.marriage.equals("已婚")) {
            points += 3;
        } else {
            points += 5;
        }
        if (temp.child < 6) {
            points -= temp.child * 0.5;
        } else {
            points -= 3;
        }
        if (points >= 10) {
            return 0.6f;
        } else {
            return 0.1f;
        }
    }

    public void showRate() {
        temp = list.pop();
        System.out.println("第" + counter + "位客户的保险费率为:");
        if (temp.flag) {
            System.out.println(rateCal() + "%");
        } else {
            System.out.println("无法推算");
        }
        counter++;
    }
}
