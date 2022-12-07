import java.util.*;

public class MapTest {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "jack");
        map.put(2, "rose");
        System.out.println(map.get(2));
        System.out.println("---------------------------------");

        map.put(2, "Alice");
        System.out.println(map.get(2));
        System.out.println("---------------------------------");

        // 为了防止将之前的键值对覆盖掉
        map.putIfAbsent(2, "fiora");
        System.out.println(map.get(2));
        System.out.println("---------------------------------");

        // 返回不存在的映射时，默认会返回null作为结果 也可以返回一个备选的返回值
        System.out.println(map.get(3));
        System.out.println(map.getOrDefault(3, "该值不存在"));
        System.out.println("---------------------------------");

        // 正常插入一个键值对时，会得到null返回值，而冲突时会得到一个被覆盖的值
        System.out.println(map.put(0, "bruce"));
        System.out.println(map.put(0, "li"));
        System.out.println("---------------------------------");

        //直接替换为新的
        map.replace(0, ">>>");   
        System.out.println(map);

        
    }
}
