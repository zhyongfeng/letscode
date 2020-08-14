package kuang.annotations;

/**
 * @Author: yfzhang
 * @Description:测试class类的创建方式
 * @Date: Created in 7:27 PM 2020/6/30
 * @Modified By:
 */
public class Demo03 {

    public static void main(String[] args) throws ClassNotFoundException {
        Person person = new Student();
        System.out.println("this is: " + person.name);

        Class c1 = person.getClass();
        System.out.println(c1.hashCode());

        Class c2 = Class.forName("kuang.annotations.Student");
        System.out.println(c2.hashCode());

        Class<Student> c3 = Student.class;
        System.out.println(c3.hashCode());
    }
}

class Person {
    String name;
}

class Student extends Person {
    public Student() {
        this.name = "Student";
    }
}

class Teacher extends Person {
    public Teacher() {
        this.name = "Teacher";
    }
}