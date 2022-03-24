/*
任务：编写一个程序，由用户输入住房贷款和贷款年限，程序输出不同利率下的月还款额和总还款额，利率从 5%～8%，增长间隔为 1/8。
例如，如果输入贷款额 10000 元人民币，贷款期限 5 年，程序应输出如下内容：

贷款金额: 10000
贷款年限: 5
利率    月还款额    总还款额
5.000%    188.71    11322.74
5.125%    189.28    11357.13
……
8.000%    202.76    12165.83

利率请保留3位小数，月还款额和总还款额请保留2位小数。
利率和月还款额以及总还款额之间保留4个空格。

思路：获取住房贷款以及贷款年限，计算不同利率下的月还款额以及总还款额。


*/

// 请在Begin-End间编写完整代码，类名请使用LoanTest
/********** Begin **********/

// 导入 Scanner 类
import java.util.Scanner;

// 定义公开类  LoanTest
public class 住房贷款还款计算 {
    // 定义主方法 main，在该方法中完成本关任务
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int money = sc.nextInt();
        int year = sc.nextInt();
        System.out.println("贷款金额: " + money);
        System.out.println("贷款年限: " + year);
        System.out.println("利率    月还款额    总还款额");
        for (double i = 5; i <= 8; i += 0.125) {
            double e = i / 12;
            double c = money * e * Math.pow(1 + e, 12 * year) / Math.pow(1 + e, 12 * year - 1);
            double d = c * 12 * year;
            System.out.printf("%.3f%%    %.2f    %.2f\n", i, c, d);
        }
    }
}

/********** End **********/
