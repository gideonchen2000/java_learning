public class ThrowDemo {
    static void checkEligibilty(int stuage){
        if(stuage<18) {
            throw new ArithmeticException("年纪未满 18 岁，禁止观影");
        } else {
            System.out.println("请认真观影!!");
        }
    }

    public static void main(String args[]){
        checkEligibilty(10);
        System.out.println("愉快地周末..");
    }
}