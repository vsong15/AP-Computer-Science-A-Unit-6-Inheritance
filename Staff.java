public class Staff extends Employee{

   private String title;

   public Staff(String n, int num, String t){
      super (n, num);
      title = t;
   }
   
   public String getTitle(){
      return title;
   }
   
   public void setTitle(String t){
      title = t;
   }
   
   public boolean equals(Staff other){
      return super.equals(other) && this.title.equals(other.title);
   }
     
   public String toString(){
      return super.toString()+"\nTitle: "+title;
   } 
     
}