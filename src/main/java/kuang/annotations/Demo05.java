package kuang.annotations;

/**
 * @Author: yfzhang
 * @Description:
 * @Date: Created in 8:07 PM 2020/6/30
 * @Modified By:
 */
public class Demo05 {
    public static void main(String[] args) {
        A a = new A();
        System.out.println(A.m);
    }
}

class A{

    static {
        System.out.println("A Static block");
        int m = 300;
    }

    static int m= 100;

    public A() {
        System.out.println("Constructor");
    }
}