public class subclassInherit {
    public static void main(String[] args) {
        Student s1 = new Student("Lalitha",2024,200000);
        System.out.println(s1.getName());
        researchStudent s2 = new researchStudent("venky",2022,2000,"Software development");
        System.out.println(s2.getName());
        System.out.println(s2.getCourse());
        phdStudent s3 = new phdStudent("rithu",2023,10000,"fullstack","very great ");
        System.out.print(s3.getName());
        System.out.print(s3.getCourse());
        System.out.print(s3.getThesisreview());
    }  
}
class Student {
    public String name;
    public int year;
    public int fee;
    public Student (String name,int year,int fee){
        this.name = name;
        this.year = year;
        this.fee = fee;
    }
    public String getName(){
        return "Name: " + this.name + "\n" + getYear() + "\n" + getFee();

    }
    public String getYear(){
        return "Year: " + this.year; 
    }
    public String getFee(){
        return "Fee: " + this.fee + "\n"; 
    }
    public void setName (String name){
        this.name = name;
    }
}
class researchStudent extends Student{
    private String researchCourse;
    private int annualFees;
    public researchStudent (String name,int year,int annualFees,String researchCourse){
    super(name,year,annualFees);
    this.researchCourse = researchCourse;
    this.annualFees = annualFees;
    }
    public String getCourse(){
        return this.name  + " joined in " + this.researchCourse + " course\n";
    }
   

}

class phdStudent extends researchStudent{
    private String thesisReview;
    public phdStudent(String name,int year,int annualFees,String researchCourse,String thesisReview){
          super(name,year,annualFees,researchCourse);
          this.thesisReview = thesisReview;
    }
    public String getThesisreview(){
        return this.thesisReview;
    }
}