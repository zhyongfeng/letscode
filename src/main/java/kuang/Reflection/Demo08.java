package kuang.Reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @Author: yfzhang
 * @Description:获得类的信息
 * @Date: Created in 2:25 PM 2020/7/1
 * @Modified By:
 */
public class Demo08 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException {
        Class c1 = Class.forName("kuang.Reflection.Father");
        //获得类名
        System.out.println(c1.getName());
        System.out.println(c1.getSimpleName());
        //类的属性
        System.out.println("=============");
        Field[] fields = c1.getDeclaredFields();//包括private和public的
        for (Field field : fields) {
            System.out.println(field);
        }
        System.out.println("=============");
        Field[] fields2 = c1.getFields();
        for (Field field2 : fields2) {
            System.out.println(field2);
        }

        System.out.println("=============");
        Method[] methods = c1.getMethods();//本类及其父类的所有public 方法
        for (Method method : methods) {
            System.out.println(method.getName());
        }

        Method[] methods2 = c1.getDeclaredMethods();
        for (Method method2 : methods2) {
            System.out.println(method2.getName());
        }


        Method setName = c1.getMethod("setName",String.class);
        System.out.println(setName);

    }
}
