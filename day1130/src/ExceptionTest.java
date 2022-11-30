public class ExceptionTest {
    // 1 
    // public static void main(String[] args) throws ClassNotFoundException {
    //     doSome();
    // }

    // 2
    public static void main(String[] args) {
        try {
            doSome();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            e.getMessage();
        }
    }

    public static void doSome() throws ClassNotFoundException {
        System.out.println("do some!!!");
    }
}
