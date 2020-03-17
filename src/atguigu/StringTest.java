package atguigu;

import sun.applet.Main;

/**
 * @Author: yfzhang
 * @Description:
 * @Date: Created in 3:48 PM 2020/3/17
 * @Modified By:
 */
public class StringTest {
    public static void main(String[] args) {
        String string = new String();
        System.out.println("Hello, I'm a string");
        System.out.println(string.getClass().getClassLoader());

        StringTest stringTest = new StringTest();
        System.out.println(stringTest.getClass().getClassLoader());
    }
}
