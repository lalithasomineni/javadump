public class methodoverload {
   public static void main(String[] args) {
    bankAccount account0 = new bankAccount("hdfc1246gh",20000);
    bankAccount account1 = new bankAccount("hdfc1246gh",200);
    bankAccount account2 = new bankAccount("hdfc1246gh",20600);
    Student s1 = new Student("Lalitha",2024,account0);
    System.out.println(s1.getName());
    System.out.println(account0.getaccountBalance());
    researchStudent s2 = new researchStudent("venky",2022,account1,"Software development");
    phdStudent s3 = new phdStudent("Obito",2000,account2,"Software Engineering","Life of a language in market");
    System.out.println(s2.getName());
    System.out.println(s3.getName());
   System.out.println(s2.getFee(1000));
   System.out.println(s1.getFee());
   } 
}
class Student {
    public String name;
    public int year;
    public int fee;
    protected bankAccount bankAccount;
    public static int annualFee = 1000;
    public Student (String name,int year,bankAccount bankAccount){
        this.name = name;
        this.year = year;
        this.bankAccount = bankAccount;
    }
    public String getName(){
        return "Name: " + this.name + "\n" + getYear() + "\n" +  getFee();

    }
    public String getYear(){
        return "Year: " + this.year; 
    }
    public float getFee() {
        return Student.annualFee * 2;
    }
    public int getFee(int annualFee){
        return this.annualFee;
    }


    public void setName (String name){
        this.name = name;
    }
}
class researchStudent extends Student{
    private String researchCourse;
    private int annualFees;
    public researchStudent (String name,int year,bankAccount bankAccount,String researchCourse){
    super(name,year,bankAccount);
    this.researchCourse = researchCourse;
    }
    public String getName(){
        return super.getName() + " " + "\n" + researchCourse;
    }
   

}

class phdStudent extends researchStudent{
    private String thesisReview;
    public phdStudent(String name,int year,bankAccount bankAccount,String researchCourse,String thesisReview){
          super(name,year,bankAccount,researchCourse);
          this.thesisReview = thesisReview;
    }
    public String getName (){
        return super.getName() + " " +"\n" + thesisReview;
    }
}

class bankAccount {
    private String accountNumber;
    private int accountBalance;
    public bankAccount(String accountNumber,int accountBalance){
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
    }
    public int getaccountBalance(){
        return this.accountBalance;
    }
}


