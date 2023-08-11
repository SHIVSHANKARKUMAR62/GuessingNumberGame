package CodeSoftProject;

import java.util.Scanner;

class Number{

    int i, guess,n,k=5,count =0;

    public void guessingNumber() {
        System.out.println("A number is chosen between 1 to 100. Guess the number within 5 trials.");
        do {
            Scanner sc = new Scanner(System.in);

            int number = 1 + (int) (100 * Math.random());

            for (i = 0; i < k; i++) {

                System.out.print("Guess the number: ");

                guess = sc.nextInt();


                if (number == guess) {
                    System.out.println("Congratulations! You guessed the number.");
                    break;
                } else if (number>guess) {
                    System.out.println("Guess Number is too Low...");
                }else {
                    System.out.println("Guess Number is too high...");
                }
                count++;
            }
            if (i == k) {
                System.out.println("You have exhausted " + k + " trials.");
                System.out.println("The number was " + number);
                System.out.print("If You want to Get More Chance then Press 1 otherwise press any other key: ");
                n = sc.nextInt();
            }
        }while (n==1);
    }
}

public class NumberGame {
    public static void main(String[] args) {
        Number n = new Number();
        n.guessingNumber();
        System.out.println("Thank You...");
        System.out.println("You take "+n.count+" chance...");
    }
}
