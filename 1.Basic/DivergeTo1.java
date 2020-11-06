import java.util.Scanner;

public class DivergeTo1 {
    public static void main(String[] args) {
        System.out.println("This is a simple algorithm which takes natural number n(greater than 2) as input and diverge it to 1 by using following operations.");
        System.out.println("If n is odd : Divide it by 2");
        System.out.println("If n is even: Multiply by 3 and add 1 to it.");
        System.out.println("Enter any natural number ");
        Scanner getNumber = new Scanner(System.in);
        int number = getNumber.nextInt();
        getNumber.close();
        divergeTo1(number);
    }

    public static void divergeTo1(int number) {
        if(number == 1) {
            System.out.println("Nice Try! Better luck next time.");
        }
        else {
            int operations = 0;
            System.out.println("See How number gets diverged to 1.");
            while(number > 2) {
                if(number % 2 == 0) {
                    number = number/2;
                }
                else if(number % 2 != 0){
                    number = (number * 3) + 1;
                }
                System.out.print(number + " -> ");
                operations += 1;
            }
            System.out.print("1");
            System.out.println("\nWe performed " + operations + " operations.");
        }
    }
}