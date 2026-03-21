package EX_30_Comparable_vs_Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Comparable_Program_003 {
    public static void main(String[] args) {
        List<University> unv = new ArrayList<>();
        unv.add(new University("Tgaa", 90, 2000));
        unv.add(new University("Pbhsda", 30, 9000));
        unv.add(new University("qHDN", 80, 1000));

        System.out.println(unv);

        Comparator<University> namecomp = (e1, e2) -> e1.getName().compareTo(e2.getName());
        Comparator<University> idcomp = ( e1,e2) -> e1.getStudentid()- e2.getStudentid();
        Comparator<University> Rollcomp = ( e1,e2) -> e1.getRollno()-e2.getRollno();

        Collections.sort(unv,Rollcomp);
        System.out.println(unv);


    }
}


class  University{
   private String name ;
    private int studentid;
    private int Rollno;

    public int getRollno() {
        return Rollno;
    }

    public void setRollno(int rollno) {
        Rollno = rollno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStudentid() {
        return studentid;
    }

    public void setStudentid(int studentid) {
        this.studentid = studentid;
    }


    public University(String name, int studentid, int rollno) {
        this.name = name;
        this.studentid = studentid;
        Rollno = rollno;
    }

    @Override
    public String toString() {
        return "University{" +
                "name='" + name + '\'' +
                ", studentid=" + studentid +
                ", Rollno=" + Rollno +
                '}';
    }
}