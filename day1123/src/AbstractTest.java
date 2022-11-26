public class AbstractTest {
    public static void main(String[] args) {
        //Person p = new Employee();
        Person p = new Student();
        //Person p = new Person();
        p.setName("张三");
        p.printInfo();
        }
}

abstract class Person {
    private String name;
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void commonMethod1() {
        System.out.println("---------commonMethod1-------");
    }

    public abstract void printInfo();

}

class Employee extends Person {

    public void printInfo() {
        System.out.println("Employee.printInfo()");
    }
}

class Student extends Person {

    public void printInfo() {
        System.out.println("Student.printInfo()");
    }
}