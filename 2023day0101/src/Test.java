import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD, ElementType.TYPE}) 
@Retention(RetentionPolicy.RUNTIME)
public @interface Test {
    
    // 使用value名时，使用时无需填入属性名称，其他则需，value仅能存在一个
    String value() default "使用default为属性指定默认值";
}
