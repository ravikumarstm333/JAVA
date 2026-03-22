import java.util.Scanner;

public class rotate90deg {
    static void enterArray(int[][] arr, int n) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        sc.close();
    }

    static void printArray(int[][] arr, int n) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }

    static void rotate90(int [][]arr,int n ){
        /// traspose of matrix
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
        System.out.println("This is traspose of matrix: ");
        printArray(arr, n);
        for(int i=0;i<n;i++){
            int j=0;
            int k=n-1;
            while (j<k) {
                int temp=arr[i][j];
                arr[i][j]=arr[i][k];
                arr[i][k]=temp;
                j++;
                k--;
                
                
            }
        }
        System.out.println("This is rotate matrix: ");
        printArray(arr, n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no of rows/columns : ");
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        enterArray(arr, n);
        System.out.println("The arrays is : ");
        printArray(arr, n);
        rotate90(arr, n);
        
        sc.close();
    }
}
