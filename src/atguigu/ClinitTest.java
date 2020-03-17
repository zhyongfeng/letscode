package atguigu;

/**
 * @Author: yfzhang
 * @Description:
 * @Date: Created in 9:59 AM 2020/3/17
 * @Modified By:
 */
public class ClinitTest {
    static class Father{
        public static int A = 1;
        static {
            A = 2;
        }
    }

    static class Son extends Father{
        public static int B = A;
    }

    public static void main(String[] args) {
        System.out.println(Son.B);
    }
}
