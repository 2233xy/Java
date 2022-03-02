public class Main {
    public static void main(String[] args) {
        InsuranceRatesCal irc = new InsuranceRatesCal();
        System.out.println("开始接待客户！");
        while (irc.list.size() != 0) {
            irc.showRate();
        }
    }
}
