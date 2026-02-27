//Reverse the Number 9471

package problems;

import java.util.Scanner;

public class reverse_number {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number;

        while (true){

            System.out.print("Enter a number: ");

            if(scanner.hasNextInt()){
                number = scanner.nextInt();
                break;
            }else{
                System.out.print("Invalid Input. Try again.");
                scanner.next();
            }
        }
        scanner.close();

        int reversed = reverse(number);
        System.out.println("Reversed number: " + reversed);
    }

    public static int reverse(int number){

        int originalNumber = number;
        int reverse = 0;

        while(number > 0){
            int digit = number % 10;
            reverse = reverse * 10 + digit;
            number /= 10;
        }
        return reverse;
    }
}
