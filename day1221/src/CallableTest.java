import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public class CallableTest {
    public static void main(String[] args) throws Exception{
        // 创建一个 “未来任务” 对象
        FutureTask<Object> task = new FutureTask<Object>(new Callable<>() {
            @Override
            public Object call() throws Exception {
                String args = "线程返回值";
                System.out.println("call method begin");
                Thread.sleep(1000);
                System.out.println("call method end");
                return args;
            }
        });

        Thread t = new Thread(task);

         t.start();

         Object obj = task.get();
         System.out.println("线程执行结果：" + obj);
    }
}
