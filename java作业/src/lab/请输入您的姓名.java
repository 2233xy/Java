package lab;
import java.util.Scanner;

public class 请输入您的姓名 {
    public static void main(String[] args) throws Exception {
        System.out.println("请输入您的姓名");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println(name+"，您好！欢迎学习Java程序设计！");
        scanner.close();
    }
}
