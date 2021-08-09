import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo {
    public static void main(String[] args) {
        Set set = new LinkedHashSet();

        set.add("abcd");
        set.add("hahahah");
        set.add("java");
        set.add("itcast");

        for (Iterator it = set.iterator(); it.hasNext(); ) {
            System.out.println(it.next());
        }


    }


}
