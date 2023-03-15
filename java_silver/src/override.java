public class override {
    public static void main(String[] args) {
        final A a2 = new B();
    
        final B b = new B();
    
        System.out.println(a2.show(b));
    }
}
class A {
    public String show(final A obj) {
        return ("A and A");
    }
}
    
class B extends A {
    public String show(final B obj) {
        return ("B and B");
    }
    
    @Override
    public String show(final A obj) {
        return ("B and A");
    }
}
    
    
