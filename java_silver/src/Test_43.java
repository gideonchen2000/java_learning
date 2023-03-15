public class Test_43 {
    public static void main(String[] args) {
        foo();
    }
    private static void foo() {
        bar();
    }
    private static void bar() {
        // throw new Exception();
        try {
            throw new Exception();
        } catch (Exception e) {
            e.printStackTrace();
        }
        int a = 0;
        int b = 10;
        int c = b/a;
        System.out.println(c);
    }
}
