import java.util.Scanner;

public class 计算圆面积周长 {
    public static void main(String[] args) {
        System.out.println("请输入圆的半径：");
        Scanner op = new Scanner(System.in);
        double r = op.nextDouble();
        double area = 3.14 * r * r;
        double perimeter = 2 * 3.14 * r;
        System.out.println("半径为"+r+"圆的面积为：" + String.format("%.2f",area));
        System.out.println("半径为"+r+"圆的周长为：" + String.format("%.2f",perimeter));
    }
}
