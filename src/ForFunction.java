public class ForFunction {
    public static void main(String[] args) {
        int[] ns = {1, 4, 9, 16, 25};
        for (int index = ns.length - 1; index >= 0; index--) {
//            请用for循环倒序输出每一个元素
            System.out.println(ns[index]);
        }
        ;
        int sum = 0;
//        for each求和
        for (int n : ns) {
            sum = sum + n;
        }
        System.out.println("ns的和为:" + sum);

    }
}
