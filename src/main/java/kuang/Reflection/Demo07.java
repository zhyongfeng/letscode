package kuang.Reflection;

import javax.sound.midi.Soundbank;

/**
 * @Author: yfzhang
 * @Description: Classloader
 * @Date: Created in 8:40 PM 2020/6/30
 * @Modified By:
 */
public class Demo07 {

    public static void main(String[] args) throws ClassNotFoundException{
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        System.out.println(systemClassLoader);

        ClassLoader parent = systemClassLoader.getParent();
        System.out.println(parent);

        ClassLoader root = parent.getParent();
        System.out.println(root);

        ClassLoader classLoader = Class.forName("kuang.Reflection.Demo07").getClassLoader();
        System.out.println(classLoader);

        ClassLoader classLoader1 = Class.forName("java.lang.Object").getClassLoader();
        System.out.println(classLoader1);

        System.out.println(System.getProperty("java.class.path"));
    }
}
