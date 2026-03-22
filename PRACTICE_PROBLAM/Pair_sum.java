import java.util.Scanner;
import javax.swing.plaf.synth.SynthStyle;
public class Pair_sum {
    static void PairSum(int[] arr,int target ,int size){
        for(int i=0;i<size;i++){
            for(int j=i+1;j<size;j++){
                if(arr[i]+arr[j]==target){
                    System.out.println("Pair exists("+arr[i]+" "+ arr[j]+")");
                    break;
                }
            }
        }
    }
    public static void main(String[] str){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the length of arr: ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.print("Enter the arr element: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter the target element: ");
        int target=sc.nextInt();
        PairSum(arr, target,n);

    }
}
