package EX_30_Comparable_vs_Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Comparable_Program_001 {
    public static void main(String[] args) {
        Employee emp = new Employee(10,"Sahoo");
        Employee emp1 = new Employee(9, " Chinmay");
        Employee emp2 = new Employee(30, "Ramu");

        List< Employee> emplist = new ArrayList<>();
        emplist.add(emp);
        emplist.add(emp1);
        emplist.add(emp2);
        System.out.println(emplist);

        Collections.sort(emplist);
        System.out.println(emplist);

    }
}


class  Employee implements Comparable<Employee>{
    private Integer id;
    private  String name ;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String printdetails(){
        return id + " " + name;

    }

    public Employee(Integer id, String name) {
        this.id = id;
        this.name = name;
    }
    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Employee o) {
        //return this.id-o.id;
        return this.name.compareTo(o.name);
    }
}