import java.util.Scanner;
public class nestedIfelse {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
         Boolean available= input.nextBoolean();
         int ticketCost = input.nextInt();
         if(available){
            if(ticketCost<200){
                System.out.println("please give me a ticket");
            }
            else{
                System.out.println("it is too costly");
            }
         }
         else{
            System.out.println("when will they be available again");
         };
    }
}
