import java.util.Scanner;

public class switchCaseCalc {
    public static void main(String[] args) {
        // Using Switch Case to Make a simple Calculator.
        Scanner userInput = new Scanner(System.in);

        System.out.println("This is a Simple Calculator made using Switch Case of Java.");
        System.out.println("Enter the First Number");
        int a = userInput.nextInt();
       
        System.out.println("Enter the Second Number");
        int b = userInput.nextInt();

        System.out.println("Press 1 for Addition, 2 for Substraction, 3 for Multiplication and 4 for Division between the entered number.");
        int operation = userInput.nextInt();

        // Used Enhanced Switch Method.
        switch (operation){
            case 1 -> System.out.println("Adding these two Numbers We get: " + (a+b));   
            case 2 -> System.out.println("Subtracting these two Numbers We get: " + (a-b));          
            case 3 -> System.out.println("Multiplying these two Numbers We get: " + (a*b));
            case 4 -> System.out.println("Dividing these two Numbers We get: " + (a/b));
            default -> System.out.println("You are a Stupid person.");
        }
    }
}

/* 
 In Case you wonder for old Switch case method... HERE IS THE CODE

 switch (operation){
            case 1 : System.out.println("Adding these two Numbers We get: " + (a+b)); 
            break;  
            case 2 : System.out.println("Subtracting these two Numbers We get: " + (a-b)); 
            break;         
            case 3 : System.out.println("Multiplying these two Numbers We get: " + (a*b));
            break;
            case 4 : System.out.println("Dividing these two Numbers We get: " + (a/b));
            break;
            default : System.out.println("You are a Stupid person.");
  
        }
 */