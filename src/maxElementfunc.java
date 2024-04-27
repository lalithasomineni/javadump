import java.util.Scanner;
public class maxElementfunc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int[] arr = new int[x]; //length of array
        for(int i = 0;i < arr.length;i++){
             arr[i] = input.nextInt(); //values
        }
        //int max;
        System.out.println(maxElement(arr));
        
    }
    public static int maxElement(int arr[]){
        int max = arr[0];
        for(int i = 1;i <arr.length;i++){
             //max = arr[0];
            if(arr[i]> max){
                max = arr[i];
            }
        }
        return max;
    }
}
