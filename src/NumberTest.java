import java.util.Scanner;

//接受键盘输入的三位数字，将数字的个十百位输出控制台
public class NumberTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入三位数据");
        int num = sc.nextInt();
        // 获取个位数
        int unitsDigit = num % 10;
        // 获取十位数
        int tensDigit = (num / 10) % 10;
        // 获取百位数
        int hundredsDigit = num / 100;
        System.out.println("个位数: " + unitsDigit);
        System.out.println("十位数: " + tensDigit);
        System.out.println("百位数: " + hundredsDigit);
        sc.close(); // 关闭 Scanner 资源
    }
}
