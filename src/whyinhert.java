public class whyinhert {
    public static void main(String[] args) {
        Student s1 = new Student("Lalitha",2024,200000);
        System.out.println(s1.getName());
        researchStudent s2 = new researchStudent("venky",2022,2000);
        System.out.println(s2.getName());
    }
}
class Student {
    private String name;
    private int year;
    private int fee;
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
class researchStudent {
    private String name;
    private int year;
    private int fee;
    public researchStudent(String name,int year,int fee){
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
