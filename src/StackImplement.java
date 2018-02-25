import java.lang.reflect.Array;
import java.util.Scanner;

/*  Class StackImplement  */
public class StackImplement extends StackNew {
    public static void main(String[] args) {
        char ch;
        /*Taking user input for */
        Scanner scan = new Scanner(System.in);
        System.out.println("How many element you want to add in Stack: ");
        int num = scan.nextInt();
        /* Creating object of class StackNew */
        StackNew stack = new StackNew(num);
        /* Stack Operations */

        do {
            System.out.println("\nStack Operations");
            System.out.println("1. Push element");
            System.out.println("2. Pop element");
            System.out.println("3. Check Stack Empty/Full");
            System.out.println("4. Size");
            int UserChoice = scan.nextInt();
            switch (UserChoice) {
                /*Switch case for push function*/
                case 1:
                    System.out.println("Enter number to push into the Stack: ");
                    try {
                        stack.push(scan.nextInt());
                    } catch (Exception e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;
                    /*Switch case for pop function*/
                case 2:
                    try {
                        System.out.println("Element popped out is: " + stack.pop());
                    } catch (Exception e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;
                    /*Switch case for isEmpty function*/
                case 3:
                    System.out.println("Stack is empty: " + stack.isEmpty());
                    break;
                    /*Switch case for getSize function*/
                case 4:
                    System.out.println("Size of the Stack is " + stack.getSize());
                    break;
                default:
                    System.out.println("Please enter valid Integer. \n ");
                    break;
            }
            /* Calling display function on stack obj*/
            stack.display();

            System.out.println("\nWould you like to continue (Y/N): \n");

            /*Take first character of "YES" or "NO" if user enters instead of Y/N*/
            ch = scan.next().charAt(0);

        } while (ch == 'Y' || ch == 'y');
    }
}