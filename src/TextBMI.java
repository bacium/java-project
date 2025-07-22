import java.util.Scanner;

public class TextBMI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入身高:");
        double height = scanner.nextDouble();
        System.out.println("请输入体重:");
        double weight = scanner.nextDouble();
        double BMI = height / weight;
        System.out.println(BMI);

    }
}