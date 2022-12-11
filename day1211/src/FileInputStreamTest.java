/* 
 * FileInputStream类中 其他常用方法
 * int available(); 返回流当中剩余的没有读到的字节数量
 * long skip(long n); 跳过几个字节不读
 */
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest {
    public static void main(String[] args) {
        FileInputStream fis = null;

        try {
            fis = new FileInputStream("D:/java_learning/temp");
            
            // int readData = fis.read(); // 返回读取到的“字节”本身
            // System.out.println(readData); //“a” 得到97

            byte[] bytes = new byte[4];
            while(true){
                int readCount = fis.read(bytes);
                if(readCount == -1){
                    break;
                }
                System.out.print(new String(bytes,0,readCount));
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
