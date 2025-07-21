import java.util.Scanner;

public class IsEqure {
    public static void main(String[] args) {
        System.out.println("请输入第一个数");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        System.out.println("请输入第二个数");
        int num2 = sc.nextInt();
        boolean flag = num1 == num2;
        System.out.println(flag);
    }
}
