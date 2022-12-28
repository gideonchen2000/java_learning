package bean;

// 反射属性Field 
// Field是属性/成员 
// 下面有四个Field，分别采用了不同的访问控制权限修饰符
public class Student {
    public int no;
    private String name;
    protected int age;
    boolean sex;

    public void test(String str){
        System.out.println(name+str);
    }
}
