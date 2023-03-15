import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LambdaTest {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>(Arrays.asList("apple", "banana", "lemon"));
        fruits.replaceAll(s -> s.toUpperCase());
        System.out.println(fruits);

        String str = "www";
        String str2 = str.toUpperCase();
        System.out.println(str2);
    }
}
