package org.example;

import java.util.Scanner;

public class Flow {

    public static void main(String[] args) {
        System.out.println("Pick a number between 1 to 10");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        if(num < 5) {
            System.out.println("Good luck");
        }else {
            System.out.println("Bye!");
        }

        boolean isOnRepeat = true;
        while (isOnRepeat) {
            System.out.println("Playing song");
            System.out.println("Would you like to take this song off of repeat, if so, yes");
            String listen = input.next();
            if("yes".equals(listen)) {
                isOnRepeat = false;
            }

        }

        System.out.println("Play next Song");


    }
}
