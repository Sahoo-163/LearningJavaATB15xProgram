package EX_21_Interface;

import EX_14_OOPs_002.Heirachical_inheritance.Father1;

public class Interface_002 {
    public static void main(String[] args) {
        civilEngineer shivu = new civilEngineer();
        shivu.overallhouse();

    }
}


 class civilEngineer implements layoutdesign,Houseconstruction{

    void overallhouse(){
        Foundation();
        Structraldesing();
        plotsize();
        dimensions();
        pillarlayout();
        Houseconstruction.Plinthlayout();
    }

     @Override
     public void Foundation() {
         System.out.println("this is core foundation for house construction");
     }

     @Override
     public void Structraldesing() {
         System.out.println("this is the structutal design for house");
     }

     @Override
     public void plotsize() {
         System.out.println("this is the plotsize for house const");
     }

     @Override
     public void dimensions() {
         System.out.println("this is the length/breadth of dimension");
     }
 }

interface layoutdesign{
    void plotsize();
    void dimensions();

}


interface Houseconstruction{
    void Foundation();
    void Structraldesing();

    default void pillarlayout(){
        System.out.println("here design of pillar will be given");
    }
    static void Plinthlayout(){
        System.out.println("here the design of plinth will be given");
    }
}