import java.util.Scanner;

public class electricBillCalculater {
    public static void main(String[]arr){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the customer Name: ");
        String customerName=sc.next();
        System.out.print("Enter Meter Number: ");
        int meterNumber=sc.nextInt();
        System.out.print("Enter Unit consume: ");
        int unitConsume=sc.nextInt();
        int totalBill=0;
        if(unitConsume<=100){
            totalBill=unitConsume*2;
        }else if(unitConsume>=101 && unitConsume<=200){
            totalBill=unitConsume*3;
        }else if(unitConsume>200){
            totalBill=unitConsume*5;
        }
        System.out.println("Customer name: "+customerName);
        System.out.println("Meter number: "+meterNumber);
        System.out.println("Unit Consume: "+unitConsume);
        System.out.println("Total Bill: "+totalBill);
    }
}
