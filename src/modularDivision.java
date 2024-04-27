public class modularDivision {
    public static void main(String[] args) {
        int num = 23456;
        int ones = 23456%10;
        num = 23456/10;
        int tens = num % 10;
        num = num/10;
        int hundreds = num % 10;
        num = num/10;
        int thousands = num % 10;
        num = num/10;
        System.out.println(ones);
        System.out.println(tens);
        System.out.println(num);
    }
}
