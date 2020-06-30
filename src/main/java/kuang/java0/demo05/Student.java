package kuang.java0.demo05;

/**
 * @Author: yfzhang
 * @Description:
 * @Date: Created in 5:00 PM 2020/6/26
 * @Modified By:
 */
public class Student extends Person{
    private String name = "yfzhang";


    public void test(String name){
        System.out.println(name);
        System.out.println(this.name);
        System.out.println(super.name);
    }
}
