public class DoWhileCase {
    public static void main(String[] args) {
        int m=20;
        int n=100;
        int sum=0;
        do {
            sum=sum+m;
            m++;
        } while (m<=n);
        System.out.println("m到n的和为"+sum);
    }
}
