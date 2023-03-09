package day03_variables;

public class CastingExamples {

    public static void main(String[] args) {

        long number = 90;       // type is int, cast to long automatically
        long number2 = 100L;



        //Small to bigger

        short number3 = 10;
        float number4 = number3;

        System.out.println(number4);

        // Bigger to small

        long number5 = 11;
        int number6 = (int)number5;

        System.out.println(number6);

        double number7 = 40.7;
        int number8 = (int)number7;

        System.out.println(number8);

        int number9 = 200;
        byte number10 = (byte)number9;
        System.out.println(number10);

        char letter = 'G';
        int number11 = (int)letter;
        System.out.println(number11);

        char letterTwo = 'Z';


        System.out.println((int)letterTwo);  // cinvers char to int type so we will know id for Z letter
        System.out.println();
        System.out.println((byte)letterTwo);

        int number12 = 97;
        System.out.println((char) number12);





    }

}
