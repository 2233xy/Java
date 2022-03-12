import java.util.Scanner;

/**
 * 任务：按升序（从小到大）输出三个数
 */
public class 按大小排列 {

    /**
     * 请在下面的 Begin - End 之间按照注释中给出的提示编写正确的代码
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 声明整型变量 x ， y ，z 获取控制台的输入
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = scanner.nextInt();
        // 声明整型变量 temp ，用于变量值的临时存储
        int temp = 0;
        /********** Begin **********/		
        // 使用 if 语句判断 x、y、z 的大小 ，并将三个数中的最小值赋值给 x，最大值赋值给 z。\
        if (x > y) {
            temp = x;
            x = y;
            y = temp;
        }
        if (x > z) {
            temp = x;
            x = z;
            z = temp;
        }
        if (y > z) {
            temp = y;
            y = z;
            z = temp;
        }
       
        /********** End **********/
        System.out.println("从小到大排列:" + x + " " + y + " " + z);
        scanner.close();
    }

}
