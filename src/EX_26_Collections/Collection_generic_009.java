package EX_26_Collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Collection_generic_009 {
    public static void main(String[] args) {
        List marks = new ArrayList<>();
        marks.add(89);
        marks.add(20);
        marks.add(40);
        marks.add(30);

        System.out.println(marks);
        Collections.sort(marks);
        System.out.println(marks);
    }
}
