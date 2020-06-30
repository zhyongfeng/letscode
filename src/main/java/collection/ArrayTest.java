package collection;

/**
 * @Author: yfzhang
 * @Description:冒泡排序
 * @Date: Created in 5:23 PM 2020/6/17
 * @Modified By:
 */
public class ArrayTest {

    public static void main(String[] args) {
        int[] array = {2, 3, 5, 1};
        array = sort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static int[] sort(int[] array) {
        int temp;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] < array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return array;

    }
}
