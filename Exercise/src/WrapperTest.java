import java.util.Arrays;

public class WrapperTest {
    /*
     * 将“23 9 -4 18 100 7”按照从小到大排序，生成一个数值有序的字符串
     */
    private static final String SPACE = " ";

    public static void main(String[] args) {
        String numsString = "23 9 -4 18 100 7";
        numsString = sortNumberString(numsString);
        System.out.println("nums = " + numsString);
    }

    private static String sortNumberString(String numsString) {
        // 获取字符串中数字
        String[] strs = numsString.split(SPACE);
        // 将字符串转为int数组
        int[] nums = parseIntArray(strs);
        // 对数组进行排序
        Arrays.sort(nums);
        // 将数组转为字符串
        return toString(nums);
    }

    private static String toString(int[] nums) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < nums.length; i++) {
            if (i != nums.length - 1) {
                sb.append(nums[i] + " ");
            } else {
                sb.append(nums[i]);
            }
        }
        return sb.toString();
    }

    private static int[] parseIntArray(String[] strs) {
        // 定义一个int数组
        int[] arr = new int[strs.length];
        // 遍历字符串数组，将元素转成int存储到arr中
        for (int i = 0; i < strs.length; i++) {
            arr[i] = Integer.parseInt(strs[i]);
        }
        return arr;
    }
}
