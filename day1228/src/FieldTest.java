import java.lang.reflect.Field;

public class FieldTest {

    // 反射Student类当中的所有Field
    public static void main(String[] args) throws Exception {
        // 获取整个类
        Class<?> studentClass = Class.forName("bean.Student");

        // 获取类中所有public的Field
        java.lang.reflect.Field[] fields = studentClass.getFields();
        System.out.println(fields.length);
        // 取出这个Field
        java.lang.reflect.Field f = fields[0];
        // 取出它的名字
        String fieldName = f.getName();
        System.out.println(fieldName);

        // 获取所有的Field
        java.lang.reflect.Field[] fs = studentClass.getDeclaredFields();
        System.out.println(fs.length);
        System.out.println("===========================================");
        // 遍历
        for(Field field : fs){
            // 获取属性的类型
            System.out.println(field.getType());
            // 获取变量的修饰符
            System.out.println(field.getModifiers());
            // 获取属性的名字
            System.out.println(field.getName());
        }
    }
}
