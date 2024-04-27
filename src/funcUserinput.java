import java.util.Scanner;
public class funcUserinput {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      String name = input.nextLine();
      String result = greeting(name);
      System.out.println(result);  
    }
    public static String greeting(String name) {
        return "hello " + name;
    }
}
 