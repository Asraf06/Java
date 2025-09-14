import java.util.Scanner;

public class User {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // System.out.print("Enter Your Name : ");
        // String name = input.next();
        // System.out.println("\nYour name is " + name);
        // System.out.print("\nEnter Your Age : ");
        // int age = input.nextInt();
        // System.out.println("\nYour age is " + age);
        
        // Check if user inputed the right Data type.
        // System.out.print("Input Int value : ");
        // boolean num = input.hasNextInt();
        // System.out.println("Result is : " + num);

        // Input String value with space.
        System.out.print("Enter Your fullname : ");
        String name = input.next(); // this does not store space-separated string value.
        input.nextLine(); // consume the leftover newline
        System.out.println("Your name is : " + name);

        System.out.print("Enter Your fullname : ");
        String fullname = input.nextLine(); // this stores space-separated string value.
        System.out.println("Your name is : " + fullname);

        input.close();
    }
}
