import java.util.ArrayList;
public class larraylist {

    public static void main(String[] args) {
        ArrayList <student> studentList = new ArrayList <student>();
        student s1 = new student("Amith",25);
        student s2 = new student("Nithin",15);
        student s3 = new student("Shresta",31);
        student s4 = new student("Amrish Puri",1);
        student s5 = new student("Tricha",33);
        studentList.add(s1);
        studentList.add(s2);
        studentList.add(s3);
        studentList.add(s4);
        studentList.add(3,s5);
        printDetails(studentList);
        studentList.remove(1);
        //studentList.add("hari");
        printDetails(studentList);
        System.out.println(studentList.contains(s5));
        System.out.println(studentList.contains(s2));

    }
    public static void printDetails(ArrayList<student> studentList) {
        for(Object o : studentList ) {
            student s = (student) o;
            System.out.println(s.getDetails());
        }
    }
}

class student {
    protected String name;
    protected int rollNumber;
    public student(String name,int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
    }
    protected String getDetails (){
        return this.name + " : " + this.rollNumber;
    }
}

