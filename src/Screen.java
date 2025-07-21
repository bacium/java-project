import java.util.Scanner;

public class Screen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入座位号");
        int order = sc.nextInt();
        if (order < 1 || order > 100) {
            System.out.println("输入不合法");
        } else {
            if (order % 2 == 0) {
                System.out.println("偶数，右边请");
            } else {
                System.out.println("奇数，左边请");
            }
        }

    }
}
