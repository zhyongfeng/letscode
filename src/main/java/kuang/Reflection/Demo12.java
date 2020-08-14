package kuang.Reflection;

import sun.util.resources.cldr.ss.CalendarData_ss_SZ;

import java.lang.annotation.*;
import java.lang.reflect.Field;

/**
 * @Author: yfzhang
 * @Description:反射操作注解
 * @Date: Created in 6:01 PM 2020/7/1
 * @Modified By:
 */
public class Demo12 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException {
        Class c1 = Class.forName("kuang.Reflection.Student");

        //通过反射获取注解
        Annotation[] annotations = c1.getAnnotations();
        for (Annotation annotation : annotations) {
            System.out.println(annotation);
        }

        //获取注解的value的值
        TableAnnotation tableAnnotation = (TableAnnotation) c1.getAnnotation(TableAnnotation.class);
        System.out.println(tableAnnotation.value());

        //获取属性的注解
        Field field = c1.getDeclaredField("name" );
        FieldAnnotaion annotation = field.getAnnotation(FieldAnnotaion.class);
        System.out.println(annotation.columnName());
        System.out.println(annotation.type());
        System.out.println(annotation.length());

    }
}

@TableAnnotation("mysql_student")
class Student{
    @FieldAnnotaion(columnName = "id",type = "int",length = 12)
    private int id;
    @FieldAnnotaion(columnName = "age",type = "int",length = 3)
    private int age;
    @FieldAnnotaion(columnName = "name",type = "varchar",length = 20)
    private String name;

    public Student() {
    }

    public Student(int id, int age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

//类名的注解
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface TableAnnotation{
    String value();
}

//属性的注解
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@interface FieldAnnotaion{
    String columnName();
    String type();
    int length();
}