public class Sum {
    public static void main(String[] args) {
        int num=1;
        int sum=0;
        while(num<=100) {
            sum=sum+num;
            num++;
        };
        System.out.println("1到100的和为:"+ sum);
    }
}
