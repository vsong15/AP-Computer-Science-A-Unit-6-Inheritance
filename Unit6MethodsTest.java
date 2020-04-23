public class Unit6MethodsTest{
   public static void main (String[]args){
      System.out.println(Unit6Methods.smallest(1,2,3));
      
      System.out.println(Unit6Methods.average(1,2,3));
      
      System.out.println(Unit6Methods.allTheSame(1,2,3));
      System.out.println(Unit6Methods.allTheSame(6,6,6));
      
      double [] nums = {1,2,3,4,5,6,7,8,9};
      System.out.println(Unit6Methods.average(nums));
      
      System.out.println(Unit6Methods.shrink("Caller"));
      
      System.out.println(Unit6Methods.shrink("Balloon"));
      
      System.out.println(Unit6Methods.shrink("Forrest"));
      
      System.out.println(Unit6Methods.shrink("Bass"));
      
      System.out.println(Unit6Methods.shrink("Basketball"));
      
      System.out.println(Unit6Methods.shrink("Tennis ball"));
   }
}