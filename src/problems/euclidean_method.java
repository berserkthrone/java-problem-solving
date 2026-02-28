package problems;

import java.util.Scanner;

public class euclidean_method {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a = readInteger(scanner, "Enter first number: ");
        int b = readInteger(scanner, "Enter second number: ");

        int result = greatestCommonDivisor(a, b);

        System.out.println("The greatest common divisor between " + a + " and " + b + " is " + result);

        scanner.close();
    }

    public static int readInteger(Scanner scanner, String message) {

        while (true){
            System.out.print(message);

            if(scanner.hasNextInt()){
                int value = scanner.nextInt();

                if(value >= 0){
                    return value;
                }else{
                    System.out.println("Number must be non negative.");
                }
            }else{
                System.out.println("Invalid input. Enter an integer.");
                scanner.next();
            }
        }
    }

    public static int greatestCommonDivisor(int a , int b){

        while(b != 0){
            int remainder = a % b;
            a = b;
            b = remainder;
        }
        return a;
    }
}
