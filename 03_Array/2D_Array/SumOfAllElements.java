import java.util.*;

public class SumOfAllElements {

    static void sumOfElements(int[][] arr, int n, int m) {
        // code likh edher
        int sum=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                sum+=arr[i][j];
            }
        }
        System.out.print("The sum of matrix is: "+sum);

    }

    public static void main(String[] args) {
        System.out.print("Enetr the row number of arr: ");
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        System.out.print("Enetr the colume number of arr: ");

        int m = sc.nextInt();

        int[][] arr = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        sumOfElements(arr, n, m);
    }
}
