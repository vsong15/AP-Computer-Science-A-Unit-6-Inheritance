public class Graduate extends Student{

   private String major;

   public Graduate (String n, int num, String m){
      super(n, num);
      major = m;
   }
   
   public String getMajor(){
      return major;
   }
      
   public void setMajor(String m){
      major = m;
   }
   
   public boolean equals (Graduate other){
      return super.equals(other) && this.major.equals(other.major);
   }
      
   public String toString(){
      return super.toString()+"\nMajor: "+major;
   }
}