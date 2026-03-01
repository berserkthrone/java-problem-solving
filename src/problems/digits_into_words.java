package problems;

import java.util.Scanner;

public class digits_into_words {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = readInteger(scanner, "Enter the number: ");

        digits_into_words(number);

        scanner.close();
    }

    public static int readInteger(Scanner scanner, String message){

        while(true){

            System.out.println(message);

            if(scanner.hasNextInt()){
                 return scanner.nextInt();
            }else{
                System.out.println("Invalid Input. Enter an Integer.");
                scanner.next();
            }
        }
    }

    public static void digits_into_words(int number){

        if(number < 0){
            System.out.println("Invalid Input");
            return;
        }

        if(number == 0){
            System.out.println("Zero");
            return;
        }

        int originalDigitCount = getDigitCount(number);
        int reversed = reverse(number);
        int reversedDigitCount = getDigitCount(reversed);

        while(reversed > 0){

            int digit = reversed % 10;
            switch(digit){
                case 0: System.out.println("Zero");break;
                case 1: System.out.println("One");break;
                case 2: System.out.println("Two");break;
                case 3: System.out.println("Three");break;
                case 4: System.out.println("Four");break;
                case 5: System.out.println("Five");break;
                case 6: System.out.println("Six");break;
                case 7: System.out.println("Seven");break;
                case 8: System.out.println("Eight");break;
                case 9: System.out.println("Nine");break;
            }
            reversed /= 10;
        }

        for(int i = 0; i < originalDigitCount - reversedDigitCount; i++){
            System.out.println("Zero");
        }
    }
    public static int reverse(int number){

        int reversed = 0;
        int sign = number < 0 ? -1 : 1;
        number = Math.abs(number);

        while(number > 0){
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }
        return reversed * sign;
    }

    public static int getDigitCount(int number){

        if(number < 0){
            return -1;
        }
        if(number == 0){
            return 1;
        }

        int count = 0;
        while(number > 0){
            count++;
            number /= 10;
        }
        return count;
    }
}
