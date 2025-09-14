import java.util.Scanner;

public class Contvertor {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.print("Enter KM value : ");
        int km = ip.nextInt();
        System.out.println("Converted to miles : " + km * 1000);
        ip.close();
    }
}
