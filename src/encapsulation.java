public class encapsulation {
   public static void main(String[] args) {
      Student s1 = new Student("lalitha",10);
      System.out.println(s1.getName()); 
      s1.setCgpa(90);
      System.out.println(s1.getCgpa()); 
   } 
}

class Student  {
   private String name;
   private int rollno;
   private double cgpa = 0;
 
   public Student (String n,int r){
         this.name = n;
         this.rollno = r;
   }
   public String getName (){
    return this.name;
   }
   public int getRoll (){
    return this.rollno;
   }
   public double getCgpa (){
    return this.cgpa;
   }
   public void setCgpa (double d){
   this.cgpa = d;
}
}