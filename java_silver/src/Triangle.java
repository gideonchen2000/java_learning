public class Triangle {
    static double area;
    int b = 2, h = 3;
    public static void main(String[] args) {
        double p, b, h;
        if (area == 0) {
            b = 3;
            h = 4;
            p = 0.5;
            area = p*b*h;
        }
        // 下列代码只能被放到 if中 放到外面 会提示未被初始化 
        // 类中的变量 不用初始化 方法中的局部变量必须初始化 
        // area = p*b*h;
        System.out.println(area);
    }
}
