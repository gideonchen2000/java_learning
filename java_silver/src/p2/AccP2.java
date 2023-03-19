package p2;
import p1.*;

public class AccP2 extends Acc {
    public static void main(String[] args) {
        Acc obj = new AccP2();
        // 父类类型引用变量 只能访问public属性
        obj.s = 1;

        AccP2 obj2 = new AccP2();
        // 子类继承不同包父类 子类类型引用变量 可以访问protected 和 public属性
        obj2.r = 1;
        obj2.s = 2;
    }
}
