import java.util.Map;
import java.util.TreeMap;

public class MapTest {
    public static void main(String[] args) {
        /* 练习：”e+j-ja=dja-lq=wer“，获取字符串中每一个字母出现的次数
         * 要求返回结果格式为 a(1)b(2)...;
         * 思路分析；
         * 1. 获取到字符串中的每一个字母
         * 2. 用字母去查表，如果查到了该字母对应的次数，就将这个次数+1后重新存入表中，如果没查到则将数字 1 存入表中
         * 3. 每一个字母都查完表后，表中记录所有字母出现的次数
         *
         * 字母和次数之间存在对应关系，而且字母唯一，所以可用map集合做表进行查询，通过结果发现字母又顺序，所以可通过map集合中的treemap作为表
         */

        String str = "ejjadjalqwer";
        str = getCharCount(str);
        System.out.println(str);

    }


    // 获取字符串中字母出现次数
    private static String getCharCount(String str) {
        // 1.将字符串转为字符数组
        char[] chs = str.toCharArray();

        // 2.定义表
        TreeMap<Character, Integer> map = new TreeMap<Character, Integer>();

        // 3.遍历字符串
        for (int i = 0; i < chs.length; i++) {
            // 判断必须是字母
            if (!(chs[i] >= 'a' && chs[i] <= 'z' || chs[i] >= 'A' && chs[i] <= 'Z')) {
                continue;
            }


            // 4. 将遍历到的字母作为键去查map这个表，获取对应的次数
            Integer value = map.get(chs[i]);
            // 5. 有可能要查询的字母在表中不存在对应的次数，需要判断
            // 如果返回的是null,说明字母没有对应的次数，就将这个字母和1存储到表中
            if (value == null) {
                // 将字母和 1 存储
                map.put(chs[i], 1);
            } else {
                //否则，说明有对应的次数对次数自增。将字母和新的次数存储到表中
                value++;
                map.put(chs[i], value);
            }
        }
        return maptoString(map);
    }

    // 将map集合中的键值转为 a(1)b(2)...格式
    // map中有很多数据，无论多少个，是什么类型，最终都变成字符串，StringBuffer符合此需求。
    // 如果是单线程，优先使用StringBuilder
    private static String maptoString(Map<Character, Integer> map) {
        // 1.明确容器
        StringBuilder sb = new StringBuilder();

        // 2. 遍历map集合
        for (Character key : map.keySet()) {
            Integer value = map.get(key);
            sb.append(key + "(" + value + ")");
        }
        return sb.toString();
    }
}
