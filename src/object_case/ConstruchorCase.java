package object_case;

public class ConstruchorCase {
    public static void main(String[] args) {
        Person bai=new Person();
        Person li=new Person("李四");
        Person chen=new Person("陈麻子",28);
        System.out.println("姓名:"+chen.getName()+"年龄:"+chen.getAge());
    }
}
class Person {
    private String name;
    private int age;
    public Person () {

    }
    public Person (String name) {
        this.name=name;
    }
    public Person (String name, int age) {
        this.name=name;
        this.age=age;
    }
    public String getName() {
        return  this.name;
    }
    public int getAge() {
        return  this.age;
    }
}