package kuang.annotations;

import java.lang.annotation.ElementType;

/**
 * @Author: yfzhang
 * @Description:所有类型的class
 * @Date: Created in 7:38 PM 2020/6/30
 * @Modified By:
 */
public class Demo04 {
    public static void main(String[] args) {
        Class c1 = Object.class;
        Class c2 = Comparable.class;
        Class c3 = int[].class;
        Class c4 = String[][].class;
        Class c5 = Override.class;
        Class c6 = ElementType.class;
        Class c7 = Integer.class;
        Class c8 = void.class;
        Class c9 = Class.class;

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);
        System.out.println(c5);
        System.out.println(c6);
        System.out.println(c7);
        System.out.println(c8);
        System.out.println(c9);

    }
}
