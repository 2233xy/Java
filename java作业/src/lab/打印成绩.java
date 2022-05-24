package lab;
import java.util.Scanner;

class 打印成绩 {
    public static void main(String[] args) {
        double scores = 0;
        System.out.println("请输入成绩：");
        Scanner scanner = new Scanner(System.in);
        scores = scanner.nextDouble();
        if (scores > 100) {
            System.out.println("成绩不能超过100");
        }else if(scores < 0){
            System.out.println("成绩不能低于0");            
        }else{
            switch ((int)scores/10) {
                case 10:
                    System.out.println("A+");
                    break;
                case 9:
                    System.out.println("A");
                    break;
                case 8:
                    System.out.println("A-");
                    break;
                case 7:
                    System.out.println("B");
                    break;
                case 6:
                    System.out.println("C");
                    break;
            }
        }
        scanner.close();
    }
}