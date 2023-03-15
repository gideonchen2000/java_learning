public class WhileTest {
    public static void main(String[] args) {
        int x = 5;
        while (isAva(x)){
            System.out.print(x);
            x--;
        }
    }


    public static boolean isAva(int x){
        return x-- > 0 ? true : false;
    }
}
