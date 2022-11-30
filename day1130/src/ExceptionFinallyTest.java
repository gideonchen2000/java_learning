import java.io.*;

public class ExceptionFinallyTest {
    public static void main(String[] args) {
        
        FileInputStream fis = null;
        try {
        //FileInputStream fis = new FileInputStream("test.txt");
        fis = new FileInputStream("test.txt");
        }catch(FileNotFoundException e) {
            e.printStackTrace();
        }finally {
            try {
                System.out.println("-------before fis.close--------");
                //放到finally中的语句，程序出现任何问题都会被执行
                //所以finally中一般放置一些需要及时释放的资源
                fis.close();
                System.out.println("-------after fis.close--------");
            }catch(IOException e) {
                e.printStackTrace();
            }
        }
    }        
}
