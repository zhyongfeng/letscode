package kuang.Reflection;

/**
 * @Author: yfzhang
 * @Description:
 * @Date: Created in 8:19 PM 2020/6/30
 * @Modified By:
 */
public class Demo06 {
    static {
        System.out.println("Demo06 is loaded");
    }

    public static void main(String[] args) throws ClassNotFoundException {
        Class son2 = Class.forName("kuang.Reflection.Son");
        Class son3 = kuang.Reflection.Son.class;
        System.out.println(son2 == son3);

    }
}

class Father {

    public String name;
    public int age;

    static {
        System.out.println("Father is loaded");
    }

    public Father(){}

    public Father(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    private void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Father{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

class Son extends Father {

    static {
        System.out.println("Son is loaded");
    }
}