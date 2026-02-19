package school;
//import java.util.Arrays;//
import java.util.Scanner;
public class student extends person {
  
        String course;
        int  admissionNo;
        void addStudent()
        {
            Scanner input = new Scanner(System.in);
            System.out.print("SCHOOL MANAGEMENT");
            System.out.print("Enter Fullname");
            fullname = input.nextLine();
            System.out.print("Gender");
            System.out.print("Admission Number");
            admissionNo = input.nextInt();
            gender = input.nextLine();
            System.out.print("course");
            course = input.nextLine();
            System.out.println("Full name" + fullname);
            System.out.println("Gender: " + gender);
            System.out.println("Course: " + course);
            System.out.println("Admission Number: " + admissionNo);
            input.close();

        }


    }

