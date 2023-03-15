public class Test2 {
    public static void main(String[] args) {
        int num[];
        num = new int[2];
        num[0] = 10;
        num[1] = 20;
        for (int i : num) {
            System.out.print(" " + i);
        }

        num = new int[4];
        num[2] = 30;
        num[3] = 40;

        for (int i : num) {
            System.out.print(" " + i);
        }

        num = new int[10];
        for (int i : num) {
            System.out.print(" " + i);
        }
    }
}
