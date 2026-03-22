import java.util.*;
class leetCode_875 {
    public void  minEatingSpeed(int[] piles, int h) {
        Arrays.sort(piles);
        int first=piles[0];
        int last=piles[piles.length-1];
        int result=0;
        while(true){
            int sum=0;
            int midOne=(first+last)/2;
            for(int i=0;i<piles.length;i++){
                if(piles[i]<=midOne){
                    sum+=1;
                }else if(piles[i]>midOne){
                    sum+=piles[i]/midOne;
                    sum=+1;
                }
            }
            if(sum==h){
                result=midOne;
                break;
            }if(sum>h){
                first=midOne+1;
            }else if(sum<h){
                last=midOne-1;
            }
        }
        
        System.out.print(result);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of Array: ");
        int n=sc.nextInt();
        int [] arr=new int[n];
        System.out.print("Enter the element "+n+" : ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter the max hours: ");
        int h=sc.nextInt();
        leetCode_875 obje = new leetCode_875();
        obje.minEatingSpeed(arr, h);
        
    }
}