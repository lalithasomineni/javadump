public class abstarct {
    public static void main(String[] args) {
        Professor p1 = new Professor ("Dhawan","Software development");
        //System.out.println(p1.getDetails());
        Student s1 = new Student ("Abhiram",20000,2000);
        //System.out.println(s1.getDetails());
        researchStudent r1 = new researchStudent("venky",100000,2022,"Software development");
    phdStudent ph1 = new phdStudent("Obito",400000,2000,"Software Engineering","Life of a language in market");
        Person [] array = {p1,s1,r1,ph1};
        printDetails(array);
    }
    public static void printDetails(Person[] persons) {
        for (Person person : persons) {
            System.out.print(person.getDetails());
        }
    }
}
abstract class Person {
    protected static String name;

    public Person (String name){
        this.name = name;                       
    }
    public abstract String getDetails();
}

class Professor extends Person {
    protected int salary = 50000;
    protected String subject;
    public Professor (String name,String subject){
        super(name);
        this.subject = subject;
    }
        public String getDetails (){
            return this.name + " teaches " + this.subject + " and earns " + this.salary + " per month ";
        }
    }
class Student extends Person {
        public int year;
        public int fee;
        public static int annualFee = 1000;
        public Student (String name,int fee,int year){
            super(name);
            this.year = year;
        }
        public String getDetails(){
            return "Name: " + this.name + "\n" + getYear() + "\n" +  getFee();
    
        }
        public String getYear(){
            return "Year: " + this.year; 
        }
        public float getFee() {
            return Student.annualFee * 2;
        }
        public int getFee(int fee){
            return this.fee;
        }
    
    
        public void setName (String name){
            this.name = name;
        }
    }

    class researchStudent extends Student{
        private String researchCourse;
        private int annualFees;
        public researchStudent (String name,int fee,int year,String researchCourse){
        super(name,fee,year);
        this.researchCourse = researchCourse;
        }
        public String getDetails(){
            return super.getDetails() + " " + "\n" + researchCourse;
        }
       
    
    }

    class phdStudent extends researchStudent{
        private String thesisReview;
        public phdStudent(String name,int fee,int year,String researchCourse,String thesisReview){
              super(name,year,fee,researchCourse);
              this.thesisReview = thesisReview;
        }
        public String getDetails (){
            return super.getDetails() + " " +"\n" + thesisReview;
        }
    }