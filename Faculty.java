public class Faculty extends Employee{

   private String subject;
   
   public Faculty(String n, int num, String s){
      super (n, num);
      subject = s;
   }
   
   public String getSubject(){
      return subject;
   }
   
   public void setSubject(String s){
      subject = s;
   }
   
   public boolean equals(Faculty other){
      return super.equals(other) && this.subject.equals(other.subject);
   }
   
   public String toString(){
      return super.toString()+"\nSubject: "+subject;
   }
}