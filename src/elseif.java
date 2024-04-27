import java.util.Scanner;

public class elseif {
    public static void main(String[] args) {
        String flavor1 = "Cappicuno";
        String flavor2 = "Expresso";
        String flavor3 = "Latte";

        Scanner input = new Scanner(System.in);

        String userinput = input.next();
        System.out.println(userinput);

        if(userinput.equals(flavor1)){
            System.out.println("cappicuno ordered");
        }
        
        else if(userinput.equals(flavor2)){
            System.out.println("expresso ordered");
        }
        
        else if(userinput.equals(flavor3)){
            System.out.println("latte ordered");
        }
        else{
            System.out.println("not found");
        };
    }
}
