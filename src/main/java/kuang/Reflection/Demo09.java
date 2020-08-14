package kuang.Reflection;

import sun.plugin.javascript.navig.FrameArray;

import javax.sound.midi.Soundbank;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @Author: yfzhang
 * @Description:
 * @Date: Created in 3:27 PM 2020/7/1
 * @Modified By:
 */
public class Demo09 {

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException, NoSuchFieldException {
        //通过反射初始化对象
        Class c1 = Class.forName("kuang.Reflection.Father");
        Father father = (Father) c1.newInstance();
        System.out.println(father);
        //通过构造函数初始化对象
        Constructor constructor = c1.getConstructor(String.class,int.class);
        Father father1 = (Father) constructor.newInstance("arthur",40);
        System.out.println(father1.toString());
        //通过反射调用方法
        Method setName = c1.getMethod("setName", String.class);
        setName.invoke(father1,"John");
        System.out.println(father1.toString());
        System.out.println("=================================");
        //通过反射操作属性
        Field age = c1.getDeclaredField("age" );
        age.set(father1,30);
        System.out.println(father1);


    }
}
