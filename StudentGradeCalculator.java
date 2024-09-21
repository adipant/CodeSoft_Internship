//This Is Java Programming Task of CodSoft
//StudentGradeCalculator.java

import java.util.Scanner;

class Student{
    int physics, chemistry, biology, maths, physicalEducation;

    public void input() {
        Scanner phy = new Scanner(System.in);
        System.out.println("Enter Physics Marks");
        int physics = phy.nextInt();

        Scanner chem = new Scanner(System.in);
        System.out.println("Enter Chemistry Marks");
        int chemistry = phy.nextInt();

        Scanner bio = new Scanner(System.in);
        System.out.println("Enter Biology Marks");
        int biology = phy.nextInt();

        Scanner math = new Scanner(System.in);
        System.out.println("Enter Maths Marks");
        int maths = phy.nextInt();

        Scanner phyEdu = new Scanner(System.in);
        System.out.println("Enter Physic Education Marks");
        int physicalEducation = phy.nextInt();

        int sum = physics + chemistry + biology + maths + physicalEducation;

        int avg = sum/5;

        char grade;
        if(avg>90){
            grade = 'A';   //More than 90Marks!
        }else if (avg>80 && avg<90) {
            grade = 'B';     //More than 80Marks!
        }
        else if (avg>70 && avg<80) {
            grade = 'C';     //More than 70Marks!
        }
        else if (avg>60 && avg<70) {
            grade = 'D';     //More than 60Marks!
        }
        else if (avg>50 && avg<60) {
            grade = 'E';      //More than 50Marks!
        }
        else{
            grade = 'F';       //less than 50Marks!
        }
        System.out.println("~~~~~~~~Results~~~~~~~~");
        System.out.println("Total Marks " + sum);
        System.out.println("Average Percentage " + avg + "%");
        System.out.println("Grade " + grade);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~");
        input();
    }

}

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Student obj = new Student();
        obj.input();
    }
}

