import java.util.Scanner;

public class salarySlipGenerator {
    public static void main(String[]arr){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Basic Salary: ");
        int B=sc.nextInt();
        int HRA=(B*10)/100;
        int DA=(B*20)/100;
        int GrossSalary=B+HRA+DA;
        System.out.println("Basic Salary: "+B);
        System.out.println("HRA: "+HRA);
        System.out.println("DA: "+DA);
        System.out.println("Gross Salaey: "+GrossSalary);
    }
}
