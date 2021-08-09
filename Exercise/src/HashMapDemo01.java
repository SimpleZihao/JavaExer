import CompareDemo.Student;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo01 {
    public static void main(String[] args) {
        // 练习：学生对象（姓名、年龄）都有自己的归属地，既然有对应关系，so将学生对象和归属地存储到map集合中

        // 创建hashmap集合对象
        Map<Student, String> map = new HashMap<Student, String>();

        // 添加元素
        map.put(new Student("zs", 28), "上海");
        map.put(new Student("ls", 22), "北京");
        map.put(new Student("zss", 25), "成都");
        map.put(new Student("lss", 25), "南京");

        // 取出元素 keySet、entrySet
        // Set<Student> keySet = map.keySet();
        //for (Student key : keySet) {}
        for (Student key : map.keySet()) {
            String value = map.get(key);

            System.out.println(key.toString() + "..." + value);
        }
    }
}
