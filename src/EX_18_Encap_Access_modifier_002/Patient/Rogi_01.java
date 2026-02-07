package EX_18_Encap_Access_modifier_002.Patient;

public class Rogi_01 {
   protected int num;
   protected String disease;

  public Rogi_01( int count, String coma){
       this.num= count;
       this.disease = coma;
   }

   protected   void hospital (){
       System.out.println("Patients will get admitted in hospital");
   }
   void hospitallocation(){
       System.out.println(" Ptient admitted");
   }

}
