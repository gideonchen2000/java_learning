import java.lang.annotation.Annotation;

/*
    interface Test
    true
    使用default为属性指定默认值
 */

public class ReflectAnnoTest {
    public static void main(String[] args) {
        Class<?> c = MyAnnotationTest.class;
        for (Annotation annotation : c.getAnnotations()) {
            System.out.println(annotation.annotationType()); // 获取类型
            System.out.println(annotation instanceof Test); // 判断是否为Test
            Test test = (Test) annotation;
            System.out.println(test.value()); // 获取在注解中写入的内容
        }
    }
}
