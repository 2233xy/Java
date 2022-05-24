package lab;
import java.util.Scanner;

public class 计算矩形的面积周长 {
    public static void main(String[] args) {
        Scanner op = new Scanner(System.in);
        System.out.print("请输入矩形的长度：");
        double length = op.nextDouble();
        System.out.print("请输入矩形的宽度：");
        double width = op.nextDouble(); 
        double area = length * width;
        double perimeter = 2 * (length + width);
        System.out.println("矩形的面积为：" + String.format("%.2f",area));
        System.out.println("矩形的周长为：" + String.format("%.2f",perimeter));   
    }
}
