import java.util.Scanner;

class add_digit_egnor_cary{
    public static void main(String []s){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enterr the numebr: ");
        int n=sc.nextInt();
        int result=0;
        int num=1;
        while (n>0) {
            int d=n%10;
            d+=1;
            d=d%10;
            result=result+d*num;
            num=num*10;
            n/=10;
        }
        System.out.print(result);
    }
}