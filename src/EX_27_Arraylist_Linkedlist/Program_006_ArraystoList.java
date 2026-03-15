package EX_27_Arraylist_Linkedlist;

import java.util.Arrays;
import java.util.List;

public class Program_006_ArraystoList {
    public static void main(String[] args) {
      String a[] = {"java","Python", "C++"};
        List<String> list = Arrays.asList(a);
        System.out.println(list);

    }
}
