import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileTest {
    public static void main(String[] args) {
        File f1 = new File("copy");
        // 获取文件名
        System.out.println(f1.getName());
        
        // 判断是否是一个目录
        System.out.println(f1.isDirectory()); // false

        // 判断是否是一个文件
        System.out.println(f1.isFile()); // true

        // 获取文件最后一次修改时间
        long haoMiao = f1.lastModified(); // 从1970年到现在的总毫秒数
        Date time = new Date(haoMiao);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
        String strTime = sdf.format(time);
        System.out.println(strTime);

        // 获取文件大小
        System.out.println(f1.length());

        // 获取当前目录下所有的子文件
        File f = new File("D:/java_learning");
        File[] files = f.listFiles();

        for(File file : files) {
            System.out.println(file.getName());
        }
    }
}
