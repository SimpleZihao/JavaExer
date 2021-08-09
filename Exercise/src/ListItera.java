import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListItera {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("banana");
        list.add("apple");
        list.add("pear");
        for (Iterator<String> it = list.iterator(); it.hasNext(); ) {
            String s = it.next();
            System.out.println(s);
        }
    }
}
