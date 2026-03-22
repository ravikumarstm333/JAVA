import java.util.Scanner;

public class QuantumNumberStabilityTest {
    public static void main(String[]arr){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the 3 digit number: ");
        int number=sc.nextInt();
        int revnumber=0;
        int a=number;
        while (a>0) {
            int d=a%10;
            revnumber=revnumber*10+d;
            a=a/10;
        }
        int abDiffrent=number-revnumber;
        if(abDiffrent<0){
            abDiffrent=-abDiffrent;
        }
        if(abDiffrent%2==0 || abDiffrent%7==0){
            System.out.print("Stable");
        }else{
            System.out.print("Unstable");
        }

    }

}
