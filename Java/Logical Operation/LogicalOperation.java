import java.util.Scanner;

public class LogicalOperation {

    // A method to perform AND operation
    static void andOperation(int a, int b) {
        if ((a == 0 && b == 0) || (a == 0 && b == 1) || (a == 1 && b == 0)) {
            System.out.println("Y = 0");
        } else if (a == 1 && b == 1) {
            System.out.println("Y = 1");
        } else {
            System.out.println("Please enter 0 or 1");
        }
    }

    static void orOperation(int a, int b){
      if(a == 0 && b == 0) {
         System.out.println("Y = 0");
      } else if(a == 1 || b == 1){
         System.out.println("Y = 1");
      } else {
         System.out.println("Please enter 0 or 1");
     }
    }

    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        
        System.out.print("Enter a value (0 or 1): ");
        int a = ip.nextInt();
        
        System.out.print("Enter b value (0 or 1): ");
        int b = ip.nextInt();
         ip.nextLine();
        System.out.print("Select One And , or , not : ");
        String select = ip.nextLine().toLowerCase();
        if (String.format(select) == "and") {
            andOperation(a, b);
        } else if(select == "or"){
            orOperation(a, b);
        } else {
            System.out.println("Invalid Input.");
        }

        ip.close();
    }
}
