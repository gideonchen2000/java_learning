// import java.io.FileReader;
import java.io.InputStream;
import java.util.Properties;

public class IoPropertiesTest {
    public static void main(String[] args) throws Exception{
        // 获取一个文件的绝对路径
        // String path = Thread.currentThread().getContextClassLoader().getResource("classinfo.properties").getPath();
        // FileReader reader = new FileReader(path);
        
        // 直接以流的形式返回 效果同上
        InputStream reader = Thread.currentThread().getContextClassLoader().getResourceAsStream("classinfo.properties");

        Properties pro = new Properties();
        pro.load(reader);
        reader.close();
        // 通过key获取value
        String classname = pro.getProperty("classname");
        System.out.println(classname);
    }
}
