package object_case;

public class Case01 {
    public static void main(String[] args) {
    Person1 ming=new Person1();
    ming.setName("老六");
        System.out.println( ming.getName());
    ming.setAge(20);
        System.out.println(ming.getAge());
    }
}
class Person1 {
    private String name;
    private int age;
    public String getName() {
        return name;
    }
    public void setName (String name) {
        this.name=name;
    }
    public int getAge(){
        return  this.age;
    }
    public void setAge (int age) {
        this.age=age;
    }
}