import java.util.Scanner;
public class logicalOps {
    public static void main(String[] args) {
        int myAge;
        int ageOfBrother;
        //Write your code here
        Scanner input = new Scanner(System.in);
        myAge = input.nextInt();
       // System.out.println("enter your brother age:");
        ageOfBrother =input.nextInt();
        Boolean valid = (myAge<25)&&(ageOfBrother<25);
        System.out.println(valid);
      }
}
