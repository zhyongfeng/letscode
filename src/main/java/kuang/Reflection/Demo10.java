package kuang.Reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @Author: yfzhang
 * @Description: 测试通过反射调用方法，对性能的影响
 * @Date: Created in 4:44 PM 2020/7/1
 * @Modified By:
 */
public class Demo10 {
    public static void main(String[] args) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Father father = new Father();

        long start = System.currentTimeMillis();
        for (long i = 0; i < 1000000000; i++) {
            father.getName();
        }

        long end = System.currentTimeMillis();
        System.out.println(end - start);

        test1();
        test2();

    }

    public static void test1() throws InvocationTargetException, IllegalAccessException, NoSuchMethodException {
        Father father= new Father();
        Class c1 = father.getClass();
        Method getName = c1.getDeclaredMethod("getName",null);
        long start = System.currentTimeMillis();
        for (long i = 0; i < 1000000000; i++) {
            getName.invoke(father,null);
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }

    /*
    *反射方式调用方法，关闭检测可以提高性能
     */
    public static void test2() throws InvocationTargetException, IllegalAccessException, NoSuchMethodException {
        Father father= new Father();
        Class c1 = father.getClass();
        Method getName = c1.getDeclaredMethod("getName",null);
        getName.setAccessible(true);
        long start = System.currentTimeMillis();
        for (long i = 0; i < 1000000000; i++) {
            getName.invoke(father,null);
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }
}
