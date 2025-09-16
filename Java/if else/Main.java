import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner ip = new Scanner(System.in);
        System.out.print("What is your age? : ");
        String age = ip.nextLine().trim();

        if(age.isEmpty()){
            System.out.println("Invalid Input.");
        } else if(Integer.parseInt(age)<=17){
            System.out.println("You can't Drive.");
        }
        else {
            System.out.println("You can Drive.");
        }
        ip.close();
    }
}
