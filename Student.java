public class Student extends Person{ //inheritance

   private int studentNumber;

   public Student(String n, int numb){
      super (n);
      studentNumber = numb; //use super first
   }
   
   public int getStuNum(){
      return studentNumber;
   }
   
   public void setStuNum(int num){
      studentNumber = num;
   }
    
   public boolean equals (Student other){
      return super.equals(other) && this.studentNumber == other.studentNumber;
   }  
   
   public String toString (){
      return super.toString() + "\nStudent#: "+studentNumber;
   }
}