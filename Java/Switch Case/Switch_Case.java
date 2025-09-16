// import java.util.Scanner;

// public class Switch_Case{
//     public static void main(String[] args) {
//         Scanner ip = new Scanner(System.in);
//         System.out.println("Which Ice-cream do you want?\n\t1. Chocolate, \n\t2. Strawberry, \n\t3. Vanilla, \n\t4. Coconut");
//         System.out.print("Please enter the item number : ");
//         // int choice = ip.nextInt();
//         String choice = ip.nextLine();
//         switch (Integer.parseInt(choice)) {
//             case 1:
//                 System.out.println("Your Chocolate Ice-Cream oder will be ready soon. Please wait.");
//                 break;
//             case 2:
//                 System.out.println("Your Strawberry Ice-Cream oder will be ready soon. Please wait.");
//                 break;
//             case 3:
//                 System.out.println("Your Vanilla Ice-Cream oder will be ready soon. Please wait.");
//                 break;
//             case 4:
//                 System.out.println("Your Coconut Ice-Cream oder will be ready soon. Please wait.");
//                 break;
        
//             default:
//                 System.out.println("Invalid input.");
//                 break;
//         }

//         ip.close();
//     }
// }


import java.util.Scanner;

public class Switch_Case{
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.println("Which Ice-cream do you want?\n\t1. Chocolate, \n\t2. Strawberry, \n\t3. Vanilla, \n\t4. Coconut");
        System.out.print("Please enter the item name : ");
        // int choice = ip.nextInt();
        String choice = ip.nextLine().toLowerCase();
        switch (choice) {
            case "chocolate" -> {
                System.out.println("Your Chocolate Ice-Cream oder will be ready soon. Please wait.");
                System.out.println("Best Choice.");
            }
            case "strawberry" -> System.out.println("Your Strawberry Ice-Cream oder will be ready soon. Please wait.");
            case "vanilla" -> System.out.println("Your Vanilla Ice-Cream oder will be ready soon. Please wait.");
            case "coconut" -> System.out.println("Your Coconut Ice-Cream oder will be ready soon. Please wait.");
        
            default -> System.out.println("Invalid input.");
        }

        ip.close();
    }
}

