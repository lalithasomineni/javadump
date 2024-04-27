import java.util.Scanner;
public class elseIf2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1 = input.nextInt();
        int n2 = input.nextInt();
        if(n1>n2){
            System.out.println(n1+ ">" + n2);
        }
        else if(n1<n2){
            System.out.println(n1+ "<" + n2);
        }
        else if(n1==n2){
            System.out.println(n1+ "=" + n2);
        }
        else{
            System.out.println("invalid");
        }
    }
}
