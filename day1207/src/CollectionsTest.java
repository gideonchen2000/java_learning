import java.util.*;

public class CollectionsTest {
    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>();
        l.add(5);
        l.add(1);
        l.add(4);
        l.add(2);
        for (Iterator<Integer> iter=l.iterator(); iter.hasNext();) {
            System.out.println(iter.next());
        }
        System.out.println("");

        Collections.sort(l);
        for (Iterator<Integer> iter=l.iterator(); iter.hasNext();) {
            System.out.println(iter.next());
        }
        System.out.println("");

        Set<Integer> set = new HashSet<>();
        set.add(10);
        set.add(1);
        set.add(4);
        set.add(9);

        //不能直接对set排序
        //Collections.sort(set);
        List<Integer> setList = new ArrayList<>(set);
        Collections.sort(setList);
        for (Iterator<Integer> iter=setList.iterator(); iter.hasNext();) {
            System.out.println(iter.next());
        }
        System.out.println("");

        int index = Collections.binarySearch(setList, 9);
        System.out.println("index=" + index);

        System.out.println("");
        Collections.reverse(setList);
        for (Iterator<Integer> iter=setList.iterator(); iter.hasNext();) {
            System.out.println(iter.next());
        }
    }
}
