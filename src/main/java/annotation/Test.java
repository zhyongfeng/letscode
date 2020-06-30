package annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Type;

/**
 * @Author: yfzhang
 * @Description:
 * @Date: Created in 8:13 PM 2020/6/19
 * @Modified By:
 */
@SuppressWarnings("all")
public class Test extends Object{

    @MyAnnotation(name = "david")
    public static void main(String[] args) {
        System.out.println();

    }
}


/**
 * @author yfzhang
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotation{
    String name() default "arthur";
}
