import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;


public class DateTest {
    public static void main(String[] args) throws Exception{

        Date today = new Date();
        System.out.println(today);

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(sdf.format(today));

        Calendar c = Calendar.getInstance();
        System.out.println(c.get(Calendar.DAY_OF_MONTH));

        //取得2000-02-05为星期几
        Date d = new SimpleDateFormat("yyyy-MM-dd").parse("2000-02-05");
        c.setTime(d);
        System.out.println(c.get(Calendar.DAY_OF_WEEK) - 1);
    }
}