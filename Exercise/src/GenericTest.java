import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class GenericTest {
    public static void main(String[] args) {
        // 创建一个唯一性元素集合并按照朝阳都排序，需要比较器，匿名内部类完成
        Set<String> set = new TreeSet<String>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                int temp = o1.length() - o2.length();
                return temp == 0 ? o1.compareTo(o2) : temp;
            }
        });
        // 添加元素
        set.add("abcde");
        set.add("java");
        set.add("hello");

        for (Iterator<String> it = set.iterator(); it.hasNext(); ) {
            String string = it.next();
            System.out.println(string);
        }


    }
}
