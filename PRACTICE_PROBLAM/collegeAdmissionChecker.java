import java.util.Scanner;
public class collegeAdmissionChecker {

    public static void main(String[]a){
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the Student Namae: ");
        String studentName = sc.next();
        System.out.println("Enter the Student Marks: ");
        System.out.print("Physics: ");
        int physicsMarks = sc.nextInt();
        System.out.print("Chemestry: ");
        int chemestryMarks=sc.nextInt();
        System.out.print("Math: ");
        int mathMarks=sc.nextInt();
        int averagemarks=(physicsMarks+mathMarks+chemestryMarks)/3;
        if(averagemarks>=60){
            System.out.println("Eligible");
        }else{
            System.out.println("Not Eligible");
        }
    }
}