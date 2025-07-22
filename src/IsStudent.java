import java.util.Scanner;

//判断是否为小学生,(6-12)
public class IsStudent {
    public static void main(String[] args) {
        System.out.println("请输入判断年龄");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        boolean flag = age >= 6 && age <= 12;
        System.out.println("该年龄" + (flag ? "是" : "不是") + "小学生");
        sc.close();
    }
}