import java.util.Scanner;
public class switchCase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String a = input.nextLine();

        switch (a) {
            case "january" :{
               
                System.out.println("winter");
                break;
            }
            case "february" :{
               
                System.out.println("summer");
                break;
            }
            default :
                {
                    System.out.println("invalid");
                }
        }
    }
}
