public class Employee extends Person{

   private int employeeID;

   public Employee (String n, int num){
      super (n);
      employeeID = num;
   }
   
   public int getEmpID (){
      return employeeID;
   }
      
   public void setEmpID(int num){
      employeeID = num;
   }
   
   public boolean equals (Employee other){
      return super.equals(other) && this.employeeID == other.employeeID;
   }
   
   public String toString(){
      return super.toString()+"\nEmployee ID: "+employeeID;
   }
}