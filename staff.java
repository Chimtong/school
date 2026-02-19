package school;
import java.util.Scanner;
public class staff extends person {
    
    int staffNo;
    String position;

    void addStuff(){
        Scanner input = new Scanner(System.in);
        System.out.print("STAFF MANAGEMENT");
        System.out.print("Enter Fullname: ");
        fullname = input.nextLine();
        System.out.print("Gender: ");
        gender = input.nextLine();
        System.out.print("Staff Number: ");
        staffNo = input.nextInt();
        System.out.print("position: ");
       position = input.nextLine();
        System.out.println("Full name: " + fullname);
        System.out.println("Gender: " + gender);
        System.out.println("Course: " + position );
        System.out.println("Admission Number: " +staffNo );

        input.close();

    }

 }


