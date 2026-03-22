import java.util.Scanner;

public class smartCartCheckOutAssistance {
    public static void main(String[]arr){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the cartAmount: ");
        double cartAmount=sc.nextDouble();
        System.out.print("You want to Premium(true/false): ");
        boolean isPremiumMember=sc.nextBoolean();
        System.out.print("Enetr delivery distance in km: ");
        double deliveryDistance=sc.nextDouble();
        double finalAmout=cartAmount;
        if(isPremiumMember && cartAmount>2000 ){
            finalAmout-=500;
            System.out.println("MemberShip discount: "+500.0);
        }else{
            System.out.println("MemberShip discount: "+0.0);

        }
        if(cartAmount>5000){
            finalAmout=finalAmout-(5*finalAmout)/100;
            System.out.println("Festival Discoutn: "+(5*finalAmout)/100);
        }else{
            System.out.println("Festival Discoutn: "+0.0);
        }
        if(deliveryDistance>10){
            finalAmout+=100;
            System.out.println("Delevry charge: "+100);
        }
        else{
            System.out.println("Delevry charge: "+0.0);
        }
    }
    
}
