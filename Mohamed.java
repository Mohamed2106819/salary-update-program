import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;
public class Mohamed {
   static String grade;
    public static void main(String[]args){
        Scanner school=new Scanner(System.in);
        String studentname; int ass1, ass2, cat1, cat2, cat3, total; double avg;
      
        System.out.println("Enter the student name");
        studentname=school.nextLine();
        System.out.println("Enter ass1 Marks");
        ass1=school.nextInt();
        System.out.println("Enter ass2 Marks");
        ass2=school.nextInt();
        System.out.println("Enter cat1 Marks");
        cat1=school.nextInt();
        System.out.println("Enter cat2 Marks");
        cat2=school.nextInt();
        System.out.println("Enter cat3 Marks");
        cat3=school.nextInt();

        total=ass1+ass2+cat1+cat2+cat3;
        avg=total/5;

        if((avg>=45&&avg<=50)){
            grade="pass";
        }
        else if((avg>35&&avg<=49)){
            grade="Average";    
        }
        else
        System.out.println("Fail");

        System.out.println("The student name is:" + studentname);
        System.out.println("The grade is:" + grade);
        System.out.println("The average:" + avg);
    }
}

    



        


