import java.io.FileReader;
import java.util.Properties;

/*
 * IO+Properties的联合应用
 * 
 * 经常需要改变的数据，可以单独写到一个文件中，使用程序动态获取
 * 将来只需要修改这个文件即可，代码不需要改动，不需要重新编译，服务器也不需要重启，就可以拿到动态的信息
 * 
 * 以上这种文件被称为配置文件
 * 并且当配置文件中的内容格式为：
 * key=value
 * 时
 * 这种配置文件称为属性配置文件
 * 
 * java规范中建议 属性配置文件以.properties结尾 
 */

public class IoPropertiesTest {
    public static void main(String[] args) throws Exception {
        // 想将userinfo文件中的数据加载到Properties对象当中

        // 新建一个输入流对象
        FileReader reader = new FileReader("./day1214/userinfo");

        // 新建一个map集合
        Properties pro = new Properties();

        // 调用Properties对象的Load方法将文件中的数据加载到Map集合中
        pro.load(reader); // 文件中的数据顺着管道加载到map集合中 = 左边做key = 右边做value

        // 通过key来获取value
        String username = pro.getProperty("username");
        System.out.println(username);

        String password = pro.getProperty("password");
        System.out.println(password);
    }
}
