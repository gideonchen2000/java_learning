import java.lang.reflect.Method;

public class MethodTest {
    public static void main(String[] args) throws ReflectiveOperationException {
        Class<?> clazz = Class.forName("bean.Student");
        Object instance = clazz.newInstance();   //创建出学生对象
        Method method = clazz.getMethod("test", String.class);   //通过方法名和形参类型获取类中的方法
        
        method.invoke(instance, "what's up");   //通过Method对象的invoke方法来调用方法
        
        System.out.println(method.getName());   //获取方法名称
        System.out.println(method.getReturnType());   //获取返回值类型
    }
}
