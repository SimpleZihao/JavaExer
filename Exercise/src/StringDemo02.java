
public class StringDemo02 {
    public static void main(String[] args) {
        String s1 = "IamchineseAndiloveChina";

        System.out.println("---是否以特定字符串开头或者结尾---");
        boolean b1 = s1.startsWith("Iam"); //true
        boolean b2 = s1.endsWith("china"); //false
        System.out.println("b1=" + b1 + ", b2=" + b2);


        System.out.println("---字符串中是否包含另一个字符串以及出现位置---");
        boolean b3 = s1.contains("chinese"); //true
        // 出现的位置
        int b4 = s1.indexOf("chinese");// 3, 没有则返回-1
        System.out.println("b3=" + b3 + ", b4=" + b4);

        System.out.println("---将指定字符串替换为另一个字符串---");
        String b5 = s1.replace("chinese", "achinese");//没有被替换内容时，结果是原字符串
        System.out.println("b5=" + b5);

        System.out.println("---将字符串转成一个字符或者字节数组---");
        char[] b6 = s1.toCharArray();
        byte[] b7 = s1.getBytes();
        System.out.println("b6=" + b6 + ",b7=" + b7);

        System.out.println("---将字符串转换大小写---");
        String b8 = s1.toUpperCase(); //大写
        String b9 = s1.toLowerCase(); // 小写
        System.out.println("b8=" + b8 + ". b9=" + b9);


        System.out.println("---字符串分割---");
        String s2 = "I,am,Java";
        String[] names = s2.split(",");
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

        System.out.println("---字符串比较大小---");
        // 相等时结果为0
        int result = "ab".compareTo("ab"); //只要想让对象具备比较大小的功能，只需实现Compareable接口
        System.out.println("result:"+result);

    }
}
