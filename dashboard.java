package school;
import java.util.Scanner;
public class dashboard {
    public static void main(String[] args) {
        int menuItem;
        Scanner input = new Scanner(System.in);
        System.out.println("SCHOOL MIS");
        System.out.println("STUDENT MANAGEMENT");
        System.out.println("STAFF MANAGEMENT");
        System.out.println("Type (1) or (2) to select manu item:");
        menuItem = input.nextInt();
     if(menuItem==1){
         student theStudent = new student();
         theStudent.addStudent();

     }
     else if(menuItem==2){
         staff theStaff = new staff();
         theStaff.addStuff();
     }
     else{
         System.out.println("Invalid menu selected");
     }
     input.close();


    }
}
