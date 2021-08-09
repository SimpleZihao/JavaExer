public class StringBufferDemo02 {
    public static void main(String[] args) {
        /*
         * int[] arr = [34, 12, 89, 68]
         * 将一个int[]中元素转为字符串，格式为 [34, 12, 89, 68]
         *
         * */
        // 缓冲区的应用:无论多少数据，什么类型，只要最终变成自字符串就可以使用StringBuffer这个容器
        int[] arr = {34, 12, 89, 68};
        String str = toString(arr);
        System.out.println(str);
    }

    public static String toString(int[] arr) {
        // 创建缓冲区
        StringBuffer sb = new StringBuffer();

        sb.append("[");
        for (int i = 0; i < arr.length; i++) {
            if (i != arr.length - 1) {
                sb.append(arr[i] + ",");
            } else {
                sb.append(arr[i] + "]");
            }
        }

        return sb.toString();
    }
}
