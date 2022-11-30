public class ExceptionManualThrowTest {
    public static void main(String[] args) {
        try {
            int ret = method1(1000, 10);
            System.out.println(ret);
        }catch(Exception iae) { //可以采用Exception拦截所有的异常
            // IllegalArgumentException
            System.out.println(iae.getMessage());
        }
    }

    private static int method1(int value1, int value2) {
        if (value2 == 0) {
            
            throw new IllegalArgumentException("除数为0");
        }
        if (!(value1 >0 && value1<=100)) {
            
            throw new IllegalArgumentException("被除数必须为1~100之间的数据");
        }
        int value3 = value1/value2;
        return value3;
    }
}
// thorws是声明异常，throw是抛出异常