package _EX_13_OOPs;

public class Const_Chaining_001 {
    public static void main(String[] args) {
        chain c1 = new chain();
        System.out.println( c1);
        chain c2 = new chain("rodtype",22);
        System.out.println(c2.num);
        System.out.println(c2.type);
        chain c3 = new chain("metal", 40, 40.09);
        System.out.println( c3.type);
        System.out.println( c3.num);
        System.out.println( c3.deccount);
    }
}


class  chain {
     String type;
     int num;
     double deccount;

     chain(){

         System.out.println(" no chain const");
     }

     chain( String chaintype, int chainnum ) {
         this.num = chainnum;
         this.type = chaintype;

     }
         chain(String chaintype, int chainnum, double chaindouble) {
             this(chaintype, chainnum);  // correct constructor chaining
             this.deccount = chaindouble;





     }

        }