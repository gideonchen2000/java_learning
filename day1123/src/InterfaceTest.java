public class InterfaceTest {
    public static void main(String[] args) {

    Inter1 inter1 = new InterImpl();
    inter1.method1();

    Inter2 inter2 = new InterImpl();
    inter2.method2();
    
    Inter3 inter3 = new InterImpl();
    inter3.method3();    
    }
}

class InterImpl implements Inter1, Inter2, Inter3 {
    public void method1() {
    System.out.println("----method1-------");
    }
    public void method2() {
    System.out.println("----method2-------");
    }
    public void method3() {
    System.out.println("----method3-------");
    }
}

interface Inter1 {
    public void method1();
}

interface Inter2 {
    public void method2();
}

interface Inter3 {
    public void method3();
}
/*
interface Inter {
    public void method1();
    public void method2();
    public void method3();
}
*/