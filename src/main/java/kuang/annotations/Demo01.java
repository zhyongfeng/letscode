package kuang.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @Author: yfzhang
 * @Description:
 * @Date: Created in 2:21 PM 2020/6/30
 * @Modified By:
 */
@MyAnnotation("Test")
@SuppressWarnings("all")
public class Demo01 extends Object {

    @Override
    public String toString() {
        return super.toString();
    }

    @MyAnnotation("Arthur")
    public void Demo01() {
    }

    public static void main(String[] args) {
        System.out.println("Demo01");
    }
}

/**
 * @author yfzhang
 */
//定义一个注解
//Target表示我们的注解可以用在哪些地方
@Target(value = {ElementType.METHOD, ElementType.TYPE})
//Retention 表示
@Retention(value = RetentionPolicy.SOURCE)
@interface MyAnnotation {

    /*注解的参数： 参数类型+参数名+（）
     *如果没有default默认值，则使用的时候，必须显式赋值
     */
    String value() default "";
    int age() default  -1;

}
