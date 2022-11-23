public class FinalTest {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name = "lubenwei";
        System.out.println(p1.name);
        final Person p2 = new Person();
        p2.name = "wuwukai";
        System.out.println(p2.name);
        
        p2 = new Person();
        }  
}
class Person {

    String name;
}
