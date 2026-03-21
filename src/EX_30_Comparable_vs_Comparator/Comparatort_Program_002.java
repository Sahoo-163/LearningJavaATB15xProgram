package EX_30_Comparable_vs_Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Comparatort_Program_002 {
    public static void main(String[] args) {

        List<Employee2> emp = new ArrayList<>();
        emp.add(new Employee2(90,"zanu", 90000));
        emp.add(new Employee2(20,"wika", 3000));
        emp.add(new Employee2(30, "opla", 7000));

        System.out.println(emp);

        Comparator<Employee2> idcomp = (e1,e2) -> e1.id- e2.id;
        Comparator< Employee2> namecomp = ( e1, e2)-> e1.name.compareTo(e2.name);
        Comparator<Employee2> Salcomp = ( e1,e2)->e1.Salary.compareTo(e2.Salary);

        Collections.sort(emp,Salcomp);
        System.out.println(emp);


    }
}

class Employee2 {
    Integer id ;
    String name;
    Integer Salary;

    public Employee2(Integer id, String name, Integer salary) {
        this.id = id;
        this.name = name;
        Salary = salary;
    }

    @Override
    public String toString() {
        return "Employee2{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", Salary=" + Salary +
                '}';
    }
}
