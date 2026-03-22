import java.util.Scanner;

public class Consist_in_series {
    public boolean searchMatrix(int[][] matrix, int target){
        for(int []i:matrix){
            int left=0;
            int right=i.length-1;
            while(left<=right){
                int mid=(left+right)/2;
                if(i[mid]==target){
                    return true;
                }
                else if(target>i[mid]){
                    left=mid+1;
                }
                else if(target<i[mid]){
                    right=mid-1;
                }
            }
        } 
        return  false; 
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the row no: ");
        int n=sc.nextInt();
        System.out.print("Enter the Colume number: ");
        int m=sc.nextInt();
        int [][] matrix=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        System.out.print("Enter the Target number: ");
        int target=sc.nextInt();
        Consist_in_series obj=new Consist_in_series();
        System.out.print("The result is : " +obj.searchMatrix(matrix,target));
        
    }
}
