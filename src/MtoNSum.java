public class MtoNSum {
    public static void main(String[] args) {
//        求m到n的和;
        int m=20;
        int n=100;
        int sum=0;
        while (m<=n){
            sum=sum+m;
            m++;
        }
        System.out.println("m到n的和为"+ sum);
    }
}
