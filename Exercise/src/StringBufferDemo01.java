public class StringBufferDemo01 {
    public static void main(String[] args) {
        // 创建一个字符缓冲区对象，用于存储数据
        StringBuffer sb = new StringBuffer();

        // 添加数据。不断添加数据后，要对缓冲区的最后的数据进行操作，必须转为字符串
        String str = sb.append(true).append("hello").toString();
        System.out.println("数据:" + str);

        System.out.println("---插入数据---");
        StringBuffer sb1 = sb.insert(2, "it");
        System.out.println("str: " + str);
        System.out.println("插入后:" + sb1);

        System.out.println("---删除数据---");
        System.out.println("str: " + str);
        StringBuffer sb2 = sb.delete(1, 4);
        System.out.println("删除后: " + sb2);

        System.out.println("---替代数据---");
        System.out.println("str:" + str);
        StringBuffer sb3 = sb.replace(1, 4, "cast");
        System.out.println("替代后: " + sb3);

        System.out.println("---设置长度（多余部分删除）---");
        System.out.println("str: " + str);
        sb.setLength(2);
        System.out.println();


    }
}
