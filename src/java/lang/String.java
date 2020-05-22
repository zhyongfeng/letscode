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
    //双亲委派，一直到引导类加载器 BootstrapClassLoader，但是核心类库中String类没有main方法
    //在JVM中，只有全类名一样，并且这个类的加载器也相同，这两个类才是一样的

    public static void main(String[] args) {
        System.out.println("This is customized String ");
    }
}
