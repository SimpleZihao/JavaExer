import java.lang.reflect.Array;
import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int[] ns = {23, 56, 7, 84, 90, 12, 63};
        System.out.println("排序前：" + Arrays.toString(ns));
        for (int i = 0; i < ns.length - 1; i++) {
            for (int j = 0; j < ns.length - i - 1; j++) {
                if (ns[j] > ns[j + 1]) {
                    // 交换ns[j]和ns[j+1]
                    int tmp = ns[j];
                    ns[j] = ns[j + 1];
                    ns[j + 1] = tmp;
                }
            }

        }
        System.out.println("排序后：" + Arrays.toString(ns));
        int[] ns1 = {23, 56, 7, 84, 90, 12, 63};
        Arrays.sort(ns1);
        System.out.println("Array中内置排序函数sort:" + Arrays.toString(ns1));

    }
}
