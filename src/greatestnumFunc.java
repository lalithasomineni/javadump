import java.util.Scanner;
public class greatestnumFunc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int y = input.nextInt();
        System.out.println(compareNum(x,y));
        
    }
    public static int compareNum(int x,int y){
        if(x>y){
            return x;
        }
        else{
            return y;
        }
    }
}
