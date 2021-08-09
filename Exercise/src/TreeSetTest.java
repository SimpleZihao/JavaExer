import CompareDemo.ComparatorByLength;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetTest {
    /*
     * 要求：对字符串进行长度排序（由短到长）
     * 思路分析：字符串之所以可以排序，因为是已经实现Comparable接口重写compareTo方法，建立了字符串的自然排序
     * 但是自然排序不是需求中所需要的，需要自定义一个比较器
     * */
    public static void main(String[] args) {
        Set set = new TreeSet(new ComparatorByLength());

        set.add("abc");
        set.add("haha");
        set.add("xixi");
        set.add("hiahia");
        set.add("z");

        for (Iterator it = set.iterator(); it.hasNext(); ) {
            System.out.println(it.next());
        }
    }


}
