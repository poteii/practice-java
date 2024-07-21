package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }

        Triangle triangleA = new Triangle(15, 8, 15,
                8, 17);
        Triangle triangleB = new Triangle(3, 2.598,
                3, 3, 3);
        double triangleAArea = triangleA.findArea();
        System.out.println(triangleAArea);
        System.out.println(triangleA.sideLenThree);

        double triangleBArea = triangleB.findArea();
        System.out.println(triangleBArea);
        System.out.println(triangleB.base);

        System.out.println(Triangle.numOfSides);
    }
}