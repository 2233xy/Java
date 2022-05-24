package lab;
import java.util.Scanner;

public class 字符版计算器 {
    public static void main(String[] args) throws Exception {
        System.out.println("请输入第一个数字");
        Scanner scanner = new Scanner(System.in);
        double num1 = scanner.nextDouble();
        System.out.println("请输入第二个数字");
        double num2 = scanner.nextDouble();
        double result=0,result1=0,result2=0,result3=0;
        result = (num1) + (num2);
        result1= (num1) - (num2);   
        result2= (num1) * (num2);   
        result3= (num1) / (num2);    
        System.out.println("X + Y =" + result);
        System.out.println("X - Y =" + result1);
        System.out.println("X * Y =" + result2);
        System.out.println("X / Y =" + result3);
        scanner.close();
    }
}
