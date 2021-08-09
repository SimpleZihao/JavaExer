public class StringDemo01 {
    public static void main(String[] args) {
        // 定义一个字符串
        String str = "abc";
        System.out.println("str=" + str);

        // ----------------
        System.out.println("--------多个引用指向同一字符串--------");
        String s1 = "itcast";
        String s2 = "itcast";
        System.out.println(s1 == s2);

        System.out.println("--------两个内容相同，创建方式不同的字符串----");
        String s3 = "abc";
        String s4 = new String("abc");
        /*
         * s3 s4不同:
         * s3创建，在内存中只有一个对象
         * s4创建，在内存中有两个对象
         * */
        System.out.println(s3 == s4); //false
        //因为String复写了equals方法，建立字符串自己的判断相同的依据：通过字符串对象中的内容判断
        System.out.println(s3.equals(s4)); //true


        System.out.println("------字符串长度-------");
        String s5 = "abcdeacdb";
        System.out.println("len=" + s5.length());

        System.out.println("------字符串中某字符的位置------");
        int index = s5.indexOf('a'); // a第一次出现的位置
        System.out.println("'a'第一次出现的位置:" + index); //索引从0开始
        int index1 = s5.indexOf('a', index + 1); // a第二次出现的位置
        System.out.println("'a'第二次出现的位置:" + index1); //如果要找到字符不存在，则返回-1

        System.out.println("------获取指定位置上字符------");
        String s6 = "itcast";
        char ch = s6.charAt(3); // 不存在角标则返回StringIndexOutOfBoundsException
        System.out.println("ch=" + ch);

        System.out.println("------获取部分字符串------");
        String s7 = "welcometojavaworld";
        String s8 = s7.substring(2, 4); //包含头不含尾
        System.out.println("截取后为:" + s8);

    }
}
