package atguigu;

/**
 * @Author: yfzhang
 * @Description:
 * @Date: Created in 2:29 PM 2020/3/16
 * @Modified By:
 */
public class VariableTest {

    public static void main(String[] args) {
        int i = 1;
        i = i++;
        System.out.println("i=" + i);

        int j = i++;
        System.out.println("i=" + i);

        int k = i + ++i * i++;

        System.out.println("i=" + i);
        System.out.println("j=" + j);
        System.out.println("k=" + k);

    }
}
