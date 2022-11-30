public class ExceptionMyExceptionTest {
    public static void main(String[] args) {
        try {
            method1(10, 0);
        }catch(MyException e) {
            //必须拦截,拦截后必须给出处理，如果不给出处理，就属于吃掉了该异常
            //系统将不给出任何提示
            System.out.println(e.getMessage());
        }
    }

    private static void method1(int value1, int value2) throws MyException { //如果是受控异常必须声明
        if (value2 == 0) {
            throw new MyException("除数为0");
        }
        int value3 = value1 / value2;
        System.out.println(value3);
    }
}

//自定义受控异常
class MyException extends Exception {

    public MyException() {
        //调用父类的默认构造函数
        super();
    }

    public MyException(String message) {
        //手动调用父类的构造方法
        super(message);
    }
}