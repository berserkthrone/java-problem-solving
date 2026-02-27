

package problems;

import java.util.Scanner;

public class Summing_OddNumbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int start;
        int end;

        while (true){

            System.out.print("Enter start value: ");

            if(!scanner.hasNextInt()){
                System.out.println("Invalid Input. Please enter an integer.");
                scanner.next();
                continue;
            }

            start = scanner.nextInt();

            System.out.print("Enter end value: ");

            if(!scanner.hasNextInt()){
                System.out.println("Invalid Input. Please enter an integer.");
                scanner.next();
                continue;
            }

            end = scanner.nextInt();

            if(start < 0 || end < 0 || end < start) {
                System.out.println("Invalid range. Ensure start >= 0 and end >= start.");
                continue;
            }

            break;
        }

        int result = sumOdd(start, end);
        System.out.println("Sum of odd numbers: " + result);

        scanner.close();
    }

    public static boolean isOdd(int number){
        return number > 0 && number % 2 != 0;
    }

    public static int sumOdd(int start, int end){

        int sum = 0;

        for(int i = start; i <= end; i++){
            if(isOdd(i)){
                sum += i;
            }
        }

        return sum;
    }
}
