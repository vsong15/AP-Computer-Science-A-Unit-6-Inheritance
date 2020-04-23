public class Person{

   private String name;
   
   public Person(String n){
      name = n;
   }
   
   public String getName(){
      return name;
   }
   
   public void setName(String n){
      name = n;
   }
   
   public boolean equals(Person other){
      return this.name.equals(other.name);
   }
   
   public String toString(){
      return "Name: "+name;
   }
}