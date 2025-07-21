import java.util.Scanner;

public class Money {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入金额");
        int money = sc.nextInt();
        if (money > 100) {
            System.out.println("您的金额大于100元");
        } else {
            System.out.println("您的金额小于等于100元");
        }
    }
}
