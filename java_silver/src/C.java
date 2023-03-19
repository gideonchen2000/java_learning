public class C extends E {
    public String test() {
        return "C";
    }

    public static void main(String[] args) {
        D b1 = new D();
        D b2 = new C();

        // b1 = (A)b2; //line n1
        // A b3 = (B)b2; //line n2

        System.out.println(b1.test());
        System.out.println(b2.test());
    }
}

class D {
    public String test() {
        return "D";
    }
}

class E extends D {
    public String test() {
        return "E";
    }
}