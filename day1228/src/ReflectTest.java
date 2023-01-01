import java.lang.reflect.Field;
import java.lang.reflect.Method;



public class ReflectTest {
    /*
    * 通过反射机制访问一个java对象的属性
    * 给属性赋值set
    * 获取属性的值get
    */
    public static void main(String[] args) throws Exception {
        Class<?> studenClass = Class.forName("bean.Student");
        Object obj = studenClass.newInstance();

        // 获取age属性（根据属性的名称来获取）
        Field field = studenClass.getDeclaredField("age");
        field.setAccessible(true);
        Field nameField = studenClass.getDeclaredField("name");
        nameField.setAccessible(true);
        

        // 给obj（Student）对象的age属性赋值
        field.set(obj, 33);
        nameField.set(obj, "jack ");

        // 读取属性的值
        System.out.println(field.get(obj));
        
        Method method = studenClass.getMethod("test", String.class);
        method.invoke(obj, "hello");
    }
}
