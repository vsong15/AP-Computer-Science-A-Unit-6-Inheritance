public class Unit6Methods {
      
   public static double smallest (double x, double y, double z){
      return Math.min(x,Math.min(y,z));
   }
   
   public static double average (double x, double y, double z){
      return (x+y+z)/3.0;
   }
   
   public static boolean allTheSame(double x, double y, double z){
      if(x == y && y == z && x == z)
         return true;
      else 
         return false;
   }
   
   public static double average (double [] nums){
      double total = 0;
      for(int i = 0; i < nums.length; i++){
         total += nums[i];
      }
      return total/(nums.length);
   }    
   
   public static String shrink(String word){
      String ans = "";
      String newW = word.toLowerCase();
      for(int i = 0; i < word.length()-1; i++)
         if(newW.substring(i,i+1).equals(word.substring(i+1,i+2))){
            ans+=newW.substring(i,i+1);
            if(i+1 != word.length())
               i++;
         }
         else
            ans+=newW.substring(i,i+1);
      if(newW.substring(newW.length()-2, newW.length()-1).compareTo(newW.substring(newW.length()-1)) != 0)
         ans+=newW.substring(newW.length()-1);
      return ans;
   } 
}