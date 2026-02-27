
package problems;

import java.util.Scanner;

public class palindrome_check {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number;

        while(true){

            System.out.print("Enter a number: ");

            if(scanner.hasNextInt()){
                number = scanner.nextInt();
                break;
            }else{
                System.out.print("Invalid input. Try again.");
                scanner.next();
            }
        }

        if(isPalindrome(number)){
            System.out.println("Palindrome");
        }else {
            System.out.println("Not Palindrome");
        }

        scanner.close();
    }

    public static boolean isPalindrome ( int number){
        int originalNumber = number;
        int reverse = 0;

        while (number > 0) {
            int digit = number % 10;
            reverse = reverse * 10 + digit;
            number = number / 10;
        }
        return reverse == originalNumber ;
    }

}
