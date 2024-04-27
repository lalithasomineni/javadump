public class whileLoop {
    public static void main(String[] args) {
        Boolean drivingState = false;
        int fuel = 50;
        while(fuel > 0){
            drivingState = true;
            System.out.println("keep on driving");
            fuel = fuel - 1;
        }
        drivingState = false;
        System.out.println("refuel needed");
        System.out.println(drivingState);
    }
}
