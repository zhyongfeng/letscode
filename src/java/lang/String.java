package java.lang;

/**
 * @Author: yfzhang
 * @Description:
 * @Date: Created in 3:49 PM 2020/3/17
 * @Modified By:
 */
public class String {
    static {
        System.out.println("I'm a customized String");
    }

    //Error: Main method not found in class java.lang.String
    //双亲委派，一直到系统类加载器找到了String，但是系统类String没有main方法

    public static void main(String[] args) {
        System.out.println("This is customized String ");
    }
}
