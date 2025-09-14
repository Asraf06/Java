import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Your Name : ");
        String name = input.next();
        System.out.println("Enter Your Age : ");
        int age = input.nextInt();
        System.out.println("Your name is : "+ name + "\nAnd Your age is : " + age);
        input.close();
    }
}