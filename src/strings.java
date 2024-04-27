import java.util.Scanner;

public class strings {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String firstName = input.next();
        String lastName = input.next();
        String fullName = firstName + lastName;
        System.out.println(fullName);
        System.out.println(firstName + " "+ lastName);
    }
}
