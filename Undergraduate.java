public class Undergraduate extends Student{

   private int year;

   public Undergraduate(String n, int num, int y){
      super(n, num);
      year = y;
   }
   
   public int getYear(){
      return year;
   }
      
   public void setYear(int y){
      year = y;
   }
   
   public boolean equals (Undergraduate other){
      return super.equals(other) && this.year == other.year;
   }
   
   public String toString(){
      return super.toString()+"\nYear: "+year;
   }
   
}