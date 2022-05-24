package lab;
import java.util.Scanner;

public class Score {

    public static void main(String[] args) {
        Scanner op = new Scanner(System.in);
        double score = 0, sum = 0, avg = 0;
        int a = 0, b = 0, c = 0, d = 0, e = 0;
        while (score != -1) {
            score = op.nextDouble();
            if (score == -1) {
                break;
            }
            if (score > 90) {
                a++;
            } else if (score >= 80 && score <= 89) {
                b++;
            } else if (score >= 70 && score <= 79) {
                c++;
            } else if (score >= 60 && score <= 69) {
                d++;
            } else if (score > 0 && score < 60) {
                e++;
            }
            sum += score;
        }
        int count = a + b + c + d + e;
        avg = sum / count;
        System.out.println("不及格的人数为:" + e);
        System.out.println("及格的人数为:" + d);
        System.out.println("中等的人数为:" + c);
        System.out.println("良好的人数为:" + b);
        System.out.println("优秀的人数为:" + a);
        System.out.printf("全班平均分为:%.1f", avg);
    }

}
