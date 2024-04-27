public class swapFunc {
    public static void main(String[] args) {
        System.out.println(swap(2,3));
    }
    public static int swap(int x,int y){
        int temp = y;
        y = x;
        x = temp;
        return x;
    }
}
