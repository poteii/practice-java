package org.example;

import java.util.Scanner;

public class HelloWorld {

    public static void main(String[] args) {
        int studentAge = 15;
        double gpa = 3.45;
        boolean attendence = true;
        String firstname = "Poteii";
        String lastname = "De Aon";
        //charAt = grab first char
        char stdFirstInit = firstname.charAt(0);
        char stdLastInit = lastname.charAt(0);

        System.out.println(studentAge);
        System.out.println(gpa);
        System.out.println(stdFirstInit);
        System.out.println(stdLastInit);
        System.out.println(attendence);
        System.out.println(firstname);
        System.out.println(lastname);

        System.out.println(firstname + " " + lastname + " has gpa of " + gpa);
        System.out.println("What you want to update it to?");
        Scanner input = new Scanner(System.in);
        gpa = input.nextDouble();
        System.out.println(firstname + " " + lastname + " now has gpa of " + gpa);

    }
}
