public class LazerMartian extends Martian{

   private double eyeDistance;

   public LazerMartian(String n, int a, double dist){
      super(n,a);
      eyeDistance = dist;
   }
   
   public String toString(){
      return super.toString() + "\neye Distance = "+eyeDistance;
   }
}