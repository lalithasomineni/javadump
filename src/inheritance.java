public class inheritance {
        public static void main(String[] args) {
            Student s1 = new Student("Lalitha",2024,200000);
            System.out.println(s1.getName());
            researchStudent s2 = new researchStudent("venky",2022,2000,"Software development");
            System.out.println(s2.getName());
            System.out.println(s2.getCourse());
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
            return "Fee: " + this.fee; 
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
            return this.name  + " joined in " + this.researchCourse + " course";
        }
       
    
    }
    
