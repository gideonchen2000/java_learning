public class AnonymousClassTest {
    public static void main(String[] args) {
        MyMath mm = new MyMath();
        mm.mySum(new MyInterface() {
            public int sum(int a, int b) {
                return a + b;
            }
        }, 1, 2);
    }
}

/**
 * MyInterface
 */
interface MyInterface {

    int sum(int a, int b); 
}

class MyMath {
    public void mySum(MyInterface c, int x, int y) {
        int retValue = c.sum(x, y);
        System.out.println(retValue);
    }
}