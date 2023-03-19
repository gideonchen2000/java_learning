public class StringTest {
    public static void main(String[] args) {
        String a = "a";
        String b = "a";
        System.out.println(a == b);

        String c = new String(a);
        String d = new String(a);
        System.out.println(c == d);

        System.out.println(a == c);

        String e = c;
        String f = a;
        System.out.println(e == c);
        System.out.println(f == e);

        StringBuilder sb1 = new StringBuilder("duke");
        String str1 = sb1.toString();
        String str2 = sb1.toString();
        System.out.println(str1 == str2);

        System.out.println("5 + 2 = " + 3 + 4);
        System.out.println("5 + 2 = " + (3 + 4));
        System.out.println("5" + 2 + 3 + 4);
        System.out.println(5 + 2 + 3 + 4);
    }
}
