public class ReflectTest {
    public static void main(String[] args) {
        Class<?> c1 = null;
        try {
            c1 = Class.forName("java.lang.String");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        
        String s = "abc";
        Class<?> x = s.getClass();
        System.out.println(c1 == x); // true
        
    }

    
}
