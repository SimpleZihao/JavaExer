import java.util.HashMap;
import java.util.Map;

public class MapDemo01 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<String, String>();

        // 添加元素
        System.out.println(map.put("星期一", "Monday")); // 此时打印为结果null，因为没有星期一没有对应的旧值
        // System.out.println(map.put("星期一", "Mond")); // 打印结果为Monday
        // 如果键相同，值覆盖。put方法会返回旧值，没有旧值则为null

        map.put("星期日", "Sunday");

        // 通过给定值获取值
        String value = map.get("星期二"); // 如果键不存在，返回null,可通过此方法来判断键是否存在
        System.out.println("value=" + value);

        // 删除元素，根据键删除
        String s = map.remove("星期一"); // 获取给定键对应的值，并将该键值对从map集合删除
        System.out.println("s=" + s);

        System.out.println(map);

    }

}
