package kuang.annotations;

import javax.sound.midi.Soundbank;

/**
 * @Author: yfzhang
 * @Description:
 * @Date: Created in 7:16 PM 2020/6/30
 * @Modified By:
 */
public class Demo02 {

    public static void main(String[] args) throws ClassNotFoundException {
        Class c1 = Class.forName("kuang.annotations.User");
        System.out.println(c1.hashCode());

        Class c2 = Class.forName("kuang.annotations.User");
        System.out.println(c2.hashCode());

        Class c3 = Class.forName("kuang.annotations.User");
        System.out.println(c3.hashCode());

    }

}

class User {
    private String name;
    private int age;

    User() {
    }

    User(String name, int age) {
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

    public void setAge(int age) {
        this.age = age;
    }
}
