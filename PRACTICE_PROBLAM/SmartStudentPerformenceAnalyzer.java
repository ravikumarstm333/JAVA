import java.util.Scanner;

public class SmartStudentPerformenceAnalyzer {
    public static void main(String[]arr){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Student Name: ");
        String StudentName=sc.next();
        System.out.print("Enter Student Roll number: ");
        int StudentRoll=sc.nextInt();
        System.out.print("Enter Student Course Name: ");
        String courseName=sc.next();
        int[] Marks=new int[3];
        int totaMarks=0;
        System.out.print("Enter marks: ");
        for(int i=0;i<3;i++){
            int a=sc.nextInt();
            Marks[i]=a;
            totaMarks+=a;
        }
        System.out.println("Student Name: "+StudentName);
        System.out.println("course: "+courseName);
        System.out.print("Marks: ");
        for(int i=0;i<3;i++){
            System.err.print(Marks[i]+", ");
        }
        System.out.println("Percentage of marks: "+(totaMarks/100)*100+"%");
    }
}
