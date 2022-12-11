import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest {
    public static void main(String[] args) {
        FileOutputStream fos = null;
        try {
            // 文件不存在会新建，存在会覆盖
            // fos = new FileOutputStream("myfile");

            // append = true 在文件末尾写入，不会覆盖
            fos = new FileOutputStream("myfile", true);
            byte[] bytes = {97, 98, 99, 100};
            fos.write(bytes); // abcd
            fos.write(bytes, 0, 2); // ab


            fos.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        
    }
}
