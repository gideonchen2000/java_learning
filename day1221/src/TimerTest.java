import java.util.Timer;
import java.util.TimerTask;

public class TimerTest {
    public static void main(String[] args) {
        Timer timer = new Timer();    //创建定时器对象
        timer.schedule(new TimerTask() {   //注意这个是一个抽象类，不是接口，无法使用lambda表达式简化，只能使用匿名内部类
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName());    //打印当前线程名称
                timer.cancel(); //结束线程 不然程序不会结束
            }
        }, 1000 * 10);    //执行一个延时任务 10s
    }
}
