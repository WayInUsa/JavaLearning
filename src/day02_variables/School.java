package day02_variables;

public class School {

    public static void main(String[] args) {


        int totalNumberOfStudents;

        short numberOfStudentsIn1stGrade = 13;
        short numberOfStudentsIn2stGrade = 5;
        short numberOfStudentsIn3stGrade = 25;
        short numberOfStudentsIn4stGrade = 30;
        short numberOfStudentsIn5stGrade = 11;

        totalNumberOfStudents = numberOfStudentsIn1stGrade + numberOfStudentsIn2stGrade + numberOfStudentsIn3stGrade + numberOfStudentsIn4stGrade + numberOfStudentsIn5stGrade;

        System.out.println("In total there is " + totalNumberOfStudents + " students total");

        double avgGradeInSchool = 89;

        System.out.println("My school avgGrade is " + avgGradeInSchool + "%");

        //float avgColdDaysInAYear = 30.5; Wrong for float without F
        float avgColdDaysInAYear = 30.5F;

        System.out.println(avgColdDaysInAYear);



    }


}
