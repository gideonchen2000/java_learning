import java.io.BufferedWriter;
import java.io.FileWriter;

public class BufferedWriterTest {
    public static void main(String[] args) throws Exception{
        // 带有缓冲区的字符输出流
        BufferedWriter out = new BufferedWriter(new FileWriter("copy", true));

        out.write("hello world!");
        out.write("\n");
        out.write("GOD bless us!");

        out.flush();

        out.close();
    }
}
