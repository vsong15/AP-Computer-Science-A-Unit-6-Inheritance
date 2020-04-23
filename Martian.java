public class Martian{

   private String name;
   private int numAnt;
   
   public Martian (String n, int a){
      name = n;
      numAnt = a;
   }
   
   public String toString(){
      return "name = "+name+"/nnumber of antenae = "+numAnt;
   }
}