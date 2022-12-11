import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderTest {
    public static void main(String[] args) throws IOException {
        
        FileReader reader = new FileReader("myfile");
        // 当一个流的构造方法中需要一个流的时候，被传进的流叫：节点流
        // 外部负责包装的这个流，叫：包装流 或者 处理流
        // FileReader就是一个节点流 BufferedReader就是包装流
        BufferedReader br = new BufferedReader(reader);

        // 读一整行
        // String firstLine = br.readLine();

        String s = null;
        while ((s = br.readLine()) != null) {
            System.out.println(s);
        }

        // 关闭流 ：对于包装流来说，关闭最外层流 里面的节点流会自动关闭
        br.close();
    }
}
