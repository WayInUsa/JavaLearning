package day03_variables;

public class YourName {

    public static void main(String[] args) {

        char y = 89;
        char u = 117;
        char r = 114;
        char i = 105;

        System.out.println("My name is: " + y + u + r + i + i); // working because start with string
        System.out.println(y + u + r + i + i + " is my name");  // not working because its calculating first
//        System.out.println(89+117+114+105);                   // example how calculation is working on example above

        char y2 = 'Y';
        char u2 = 'u';
        char r2 = 'r';
        char i2 = 'i';

//        System.out.println(y2 + u2 + r2 + i2 + i2 + " its my name");
        System.out.println("My name is: " + y2 + u2 + r2 + i2 + i2); // working because start with string

        System.out.print(y2);
        System.out.print(u2);
        System.out.print(r2);
        System.out.print(i2);
        System.out.print(i2 + "\n");

        System.out.println("My name is: " + y2 + u2 + r2 + i2 + i2); // working because start with string

    }


}
