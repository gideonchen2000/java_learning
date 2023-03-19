public class Arry {
    static int value;
    public static void main(String[] args) {
        try {
            addValue("123");
            System.out.println(value);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    private static void addValue(String v) throws Exception {
        value = Integer.parseInt(v);
    }
}
