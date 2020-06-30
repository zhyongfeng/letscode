package collection;

/**
 * @Author: yzhang
 * @Description:
 * @Date: Created in 9:28 PM 2019/11/5
 * @Modified By:
 */
public class RemoveDuplicates {

    public static void main(String[] args) {
        int[] b = null;
        System.out.println(removeDuplicates(b));

    }

    public static int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int count = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[count] != nums[i]) {
                nums[++count] = nums[i];
            }
        }
        return count + 1;
    }

}
