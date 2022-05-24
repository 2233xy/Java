package lab;
import java.util.Arrays;
import java.util.Scanner;

public class 成绩统计 {
    public static void main(String[] args) {
		System.out.println("  ====成绩统计====");
		System.out.println("请输入逗号分隔的多个成绩分数(最多1位小数)：");
		Scanner sc = new Scanner(System.in);
		String a=sc.next();
		String [] b=a.split(",");
		double []s=new double[b.length];
		int i=0;
		for(String st:b){
			s[i]=Double.valueOf(st);
			i++;
		}
		Arrays.sort(s);
		System.out.println("按从大到小(降序)排序后的数据：");
		double sum=0;
		for(int j=s.length-1;j>=0;j--){
			System.out.print(s[j]+" ");
			sum+=s[j];
		}
		System.out.println();
		System.out.println("最高分："+s[s.length-1]);
		System.out.println("最低分："+s[0]);
		System.out.printf("平均分：%.2f",sum/s.length);

	}

}
