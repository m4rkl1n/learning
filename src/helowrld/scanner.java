package helowrld;

import java.util.Random;
import java.util.Scanner;

public class scanner {
    public static void main(String[] args) {
//        System.out.println("enter a number");
//        Scanner newscanner = new Scanner(System.in);
//        int answer = newscanner.nextInt();
//        System.out.println("you said "+ answer);
//
//        System.out.println("enter your name");
//        String name = newscanner.next();
//        System.out.println("your name is: "+ name);

        Random random = new Random();
        int number = random.nextInt(20)+1; //20 is the max, 1 is the min.
        System.out.println("random is: "+ number);
    }
}
