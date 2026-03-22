import java.util.Scanner;

class spiralTriverse{

    static void enterArray(int[][] arr, int n, int m) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        sc.close();
    }

    static void printArray(int[][] arr, int n, int m) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
    static void printSpiral(int[][] mat, int n, int m) {
    int top = 0;
    int left = 0;
    int right = m - 1;
    int bottom = n - 1;
    int traverse = 0;
    int total = n * m;

    while (traverse < total) {
        for (int i = left; i <= right && traverse < total; i++) {
            System.out.print(mat[top][i] + " ");
            traverse++;
        }
        System.out.println();
        top++;
        for (int i = top; i <= bottom && traverse < total; i++) {
            System.out.print(mat[i][right] + " ");
            traverse++;
        }
        System.out.println();
        right--;
        if (top <= bottom) {
            for (int i = right; i >= left && traverse < total; i--) {
                System.out.print(mat[bottom][i] + " ");
                traverse++;
            }
            bottom--;
        }
        System.out.println();
        if (left <= right) {
            for (int i = bottom; i >= top && traverse < total; i--) {
                System.out.print(mat[i][left] + " ");
                traverse++;
            }
            left++;
        }
        System.out.println();
    }
}   
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no of rows : ");
        int n = sc.nextInt();
        System.out.print("Enter no of columns : ");
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        enterArray(arr, n, m);
        System.out.println("The arrays is : ");
        printArray(arr, n, m);
        System.out.println("Modify array : ");
        printSpiral(arr, n, m);
        
        sc.close();
    }
};