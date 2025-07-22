public class StringTest {
    public  static  void main(String[] args) {
        String t="hello";
        String s=t;
        t="world";
        System.out.println(t);// world
        System.out.println(s);// hello
    }
}