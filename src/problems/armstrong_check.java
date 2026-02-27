package problems;

import java.util.Scanner;

public class armstrong_check {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;

        while(true){

            System.out.print("Enter a number: ");
            if(scanner.hasNextInt()){
                number = scanner.nextInt();
                break;
            }else{
                System.out.print("Invalid Input. Try again");
                scanner.next();
            }
        }

        scanner.close();

        if(isArmstrong(number)){
            System.out.println("Armstrong Number");
        }else{
            System.out.println("Not an Armstrong Number");
        }
    }

    public static boolean isArmstrong(int number){
        int originalNumber = number;
        int sum = 0;

        int digits = String.valueOf(number).length();

        while(number > 0){
            int digit = number % 10;
            sum += (int) Math.pow(digit, digits);
            number /= 10;
        }
        return originalNumber == sum;
    }
}
