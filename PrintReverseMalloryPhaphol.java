import java.util.*;

// Name: Mallory Phaphol
// Class: CS 3305/Section03
// Term: Spring 2025
// Instructor: Umama Tasnim
public class PrintReverseMalloryPhaphol {
    public static void printReverse(String string) { //reverses user's string
        if (string.length() == 0) {
            return;
        }
        printReverse(string.substring(1));
        System.out.print(string.charAt(0));
    }
    public static void main (String[] args)
    {
        String userInput;
        String yes_no;
        Scanner scan = new Scanner(System.in);
        do {
            System.out.print("Enter string: ");
            userInput = scan.nextLine();
            System.out.print("Reversed string: ");
            printReverse(userInput);
            System.out.println(" ");
            System.out.print("Try Again(Y/N): ");
            yes_no = scan.nextLine();
        }
        while(Objects.equals(yes_no, "Y"));
    }
}
