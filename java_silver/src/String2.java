// 抛出NullPointerException
// string使用concat时 string字串本身不能为空 为null的话无法追加 会报错
public class String2 {
    public static void main(String[] args) {
        String[] strs = new String[2];
        int idx = 0;
        for (String s : strs) {
            strs[idx].concat(" element " + idx);
            idx++;
        }
        for (idx = 0; idx < strs.length; idx++) {
            System.out.println(strs[idx]);
        }
    }
}
