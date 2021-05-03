package helowrld;

import java.util.Random;
import java.util.Scanner;

public class guessingChallenge {
    public static void main(String[] args) {
        System.out.println("welcome, please enter your name");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();

        System.out.println("welcome, "+ name+" are you ready?");
        Scanner ready = new Scanner(System.in);
        String yes = ready.next();
        if (yes!=yes) {
            System.out.println("bye");
        }else{

        }

        System.out.println("i am thinking of a number between 1 and 7");
        Random random = new Random();
        int number = random.nextInt(7)+1;
        int t=0;
        while (t<6){
            Scanner question = new Scanner(System.in);
            int answer = question.nextInt();
            if (answer==number){
                System.out.println("congrats, you guessed the number");
                break;
            }else{
                if (answer<number) {
                    System.out.println("wrong, the answer is higher");
                    t++;
                }else{
                    System.out.println("wrong, the answer is lower");
                    t++;
                }
            }
        }


    }
}
