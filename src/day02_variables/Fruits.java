package day02_variables;

public class Fruits {

    public static void main(String[] args) {


        int apples = 7;
        int grapes = 3;
        int bananas = 17;

        System.out.println("apples = " + apples);
        System.out.println("grapes = " + grapes);
        System.out.println("bananas = " + bananas);

        int totalNumberOfFruits = apples + grapes + bananas;

        System.out.println("totalNumberOfFruits = " + totalNumberOfFruits);

        // soutv short cat for print variables

        apples = 30;
        totalNumberOfFruits = apples + grapes + bananas;

        System.out.println("After update");
        System.out.println();
        System.out.println("totalNumberOfFruits = " + totalNumberOfFruits);
        System.out.println("apples = " + apples);
        System.out.println("grapes = " + grapes);
        System.out.println("bananas = " + bananas);



    }

}
