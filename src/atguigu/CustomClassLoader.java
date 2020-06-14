package atguigu;

/**
 * @Author: yfzhang
 * @Description:
 * @Date: Created in 2:57 PM 2020/3/17
 * @Modified By:
 */
public class CustomClassLoader extends ClassLoader{



    public static void main(String[] args) {
        CustomClassLoader customClassLoader = new CustomClassLoader();
        System.out.println(customClassLoader);
        try {
            Class<?> clazz = Class.forName("One",true,customClassLoader);
            Object obj = clazz.newInstance();
            System.out.println(obj.getClass().getClassLoader());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }

    }
}
