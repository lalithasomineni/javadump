import java.util.Scanner;
public class primeFunc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        System.out.println(isPrime(x));
    }
    public static Boolean isPrime(int x){
        Boolean prime = false; 
        int i;
        for(i=2 ; i < x/2; i++){
            if(x%i == 0){
                prime = false;
                break;
            }
            else{
                prime = true;
            }
        }

        return prime;
    }
}
