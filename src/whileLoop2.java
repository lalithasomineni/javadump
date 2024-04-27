public class whileLoop2 {
    public static void main(String[] args) {
        /*int num = 0;
        while(num <= 100){
            System.out.println(num);
            num++;
        }*/
        int num1 = 1;
        int product = 1;

        while(num1 <=10){
            product = num1 * product;
           // System.out.println(product);
            num1 ++;
            
        }
        System.out.println(product);        
        boolean keepRunning = false;
        while (keepRunning = true) {
            System.out.println("Hey");
        }


    }
}
