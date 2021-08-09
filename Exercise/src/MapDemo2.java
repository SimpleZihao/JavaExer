import java.util.*;

public class MapDemo2 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<String, String>();

        map.put("星期一", "Monday");
        map.put("星期日", "Sunday");

        System.out.println("-------KeySet方法获取--------");
        // Set<k> KeySet(); 用于获取map集合中键的set集合
        Set<String> KeySet = map.keySet();

        // 普通for循环获取
        for (Iterator<String> it = KeySet.iterator(); it.hasNext(); ) {
            String key = it.next();
            String value = map.get(key); // 通过键获取对应的值
            System.out.println(key + "::" + value);
        }

        // foreach循环进行遍历
        for (String key : KeySet) {
            System.out.println(key + ":::" + map.get(key));
        }

        System.out.println("-------entrySet方法获取--------");

        // Set entrySet():将map集合中映射关系存储到了Set集合中
        // 映射关系：键和值的对应关系，是Map.Entry类型
        Set<Map.Entry<String, String>> entrySet = map.entrySet();
        Iterator<Map.Entry<String, String>> it = entrySet.iterator();
        // 遍历Set中的映射关系对象
        while (it.hasNext()) {
            Map.Entry<String, String> me = it.next(); // 取到了映射关系对象
            // 获取键
            String key = me.getKey();
            // 获取值
            String value = me.getValue();
            System.out.println(key + "---" + value);
        }
        // map集合没有迭代器，取出元素的方式 : 将map集合转成单列结合，再使用单列集合的迭代器
        for (Map.Entry<String, String> me : map.entrySet()) {
            String key = me.getKey();
            // 获取值
            String value = me.getValue();
            System.out.println(key + "---------" + value);
        }

        System.out.println("-------获取所有值的方法values()--------");

        // 获取所有的值，因为值不需要保证值的唯一性，所以返回类型 collection

        Collection<String> values = map.values();
        for (String value : values) {
            System.out.println("value : " + value);
        }

    }
}
