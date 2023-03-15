package a;
import b.*;
public class a {
    int aa = 100;
    public static void main(String[] args) {
        System.out.println(b.bb);

        System.out.println((new b()).b2);

        // System.out.println(b.b3);

        // System.out.println(b.b4);

        System.out.println((new a()).aa);
    }
}
