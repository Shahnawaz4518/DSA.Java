import java.util.Scanner;
public class TwoDArrayCollageWallah {
    /* public static void printMatrix(int arr[][]) {
         for (int i = 0; i < arr.length; i++) {
             for (int j = 0; j < arr.length; j++) {
                 System.out.print(arr[i][j] + " ");
             }
             System.out.println();
         }
     }
     public static void multiplicationof2Matrix(int a[][],int r1,int c1,int b[][],int r2,int c2) {
         if (c1 != r2) {
             System.out.println("Multiplication is not possible wrong dimension");
             return;
         }
         int mul[][] = new int[r1][c2];
         for (int i = 0; i < r1; i++) {
             for (int j = 0; j < c2; j++) {
                 for (int k = 0; k < c1; k++) {
                     mul[i][j] += (a[i][k] * b[k][j]);
                 }
             }

         }
         System.out.println("multiplication of 2 matrices:");
         printMatrix(mul);
     }



     public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter the number of Rows and Coloums:");
         int r1=sc.nextInt();
         int c1=sc.nextInt();
         int [][]a=new int[r1][c1];
         System.out.print("Enter the matrix value:");
         for(int i=0;i<r1;i++){
             for(int j=0;j<c1;j++) {
                 a[i][j]=sc.nextInt();
             }
             }
         System.out.println("Enter the number of Rows and Coloums:");
         int r2=sc.nextInt();
         int c2=sc.nextInt();
         int [][]b=new int[r2][c2];
         System.out.print("Enter the matrix value:");
         for(int i=0;i<r2;i++){
             for(int j=0;j<c2;j++) {
                 b[i][j] = sc.nextInt();
             }
             }
         multiplicationof2Matrix(a,r2,c1,b,r2,c2);
     }


    /// transpose matrix finding
    public static void printMatrix(int matrix[][]) {
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int [][] findtransposematrix(int matrix[][],int r,int c) {
        int ans[][]=new int[c][r];

        for(int i=0;i<c;i++){
            for(int j=i;j<r;j++){
                ans[i][j]=matrix[j][i];
            }
        }
        return ans;

    }

    public static void transposeInplace(int matrix[][],int r,int c) {
        for(int i=0;i<c;i++){
            for(int j=i;j<r;j++){
                //swap matrix[i][j],matrix[j][i]
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Rows and Coloums:");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] matrix = new int[r][c];
        int totalelements = r * c;
        System.out.println("Enter " + totalelements + " values");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("input matrix");
        printMatrix(matrix);

        System.out.println("transpose of matrix");
        transposeInplace(matrix,r,c);
        printMatrix(matrix);
            // int[][] findtransposematrix = findtransposematrix(matrix, r, c);
            //  printMatrix(findtransposematrix);
        }


    // rotate the array in 90 degree
    public static void printMatrix(int matrix[][]) {
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void transposeInplace(int matrix[][],int r,int c) {
        for (int i = 0; i < c; i++) {
            for (int j = i; j < r; j++) {
                //swap matrix[i][j],matrix[j][i]
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }

    public static void reverse(int arr[]) {
        int i=0,j=arr.length-1;
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;

        }

    }
    public static void rotate(int matrix[][],int n) {
        //transpose
        transposeInplace(matrix,n,n);
        //reverse each row of transposed matrix
        for(int i=0;i<n;i++){
            reverse(matrix[i]);
        }


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Rows and Coloums:");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] matrix = new int[r][c];
        int totalelements = r * c;
        System.out.println("Enter " + totalelements + " values");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("input matrix");
        printMatrix(matrix);


        rotate(matrix,r);
        System.out.println("rotation of matrix");
        printMatrix(matrix);

    }


    //pascals triangle
    public static void printMatrix(int matrix[][]) {
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] pascaltriangle(int n) {
        int ans[][]=new int[n][];

        for(int i=0;i<n;i++){
            //ith row has i+1 columns
            ans[i]=new int[i+1];
            //1st and last element of every row is 1
            ans[i][0]=ans[i][i]=1;
            // 1st property
            for(int j=1;j<n;j++){
                ans[i][j]=ans[i-1][j]+ans[i-1][j-1];
            }
        }
        return ans;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n:");
        int n=sc.nextInt();
        int ans[][]=pascaltriangle(n);
        printMatrix(ans);
    }


    //chat gpt recode
    // Method to print the matrix
    public static void printMatrix(int matrix[][]) {
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Method to generate Pascal's triangle
    public static int[][] pascalTriangle(int n) {
        int ans[][] = new int[n][];

        for (int i = 0; i < n; i++) {
            // ith row has i + 1 columns
            ans[i] = new int[i + 1];
            // 1st and last element of every row is 1
            ans[i][0] = ans[i][i] = 1;
            // Fill in the rest of the row
            for (int j = 1; j < i; j++) {
                ans[i][j] = ans[i - 1][j - 1] + ans[i - 1][j];
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n:");
        int n = sc.nextInt();
        int ans[][] = pascalTriangle(n);
        printMatrix(ans);
    }

    // findsum

    public static int findsum(int matrix[][],int l1,int r1,int l2,int r2) {
        int sum=0;
        for(int i=l1;i<=l2;i++){
            for(int j=r1;j<=r2;j++){
                sum+=matrix[i][j];
            }
        }
        return sum;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of rows and colums:");
        int r=sc.nextInt();
        int c=sc.nextInt();
        int matrix[][]=new int[r][c];
        int totalelements=r*c;
        System.out.println("Enter "+totalelements+" values");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter rectangle boundaries l1,r1,l2,r2");
        int l1=sc.nextInt();
        int r1=sc.nextInt();
        int l2=sc.nextInt();
        int r2=sc.nextInt();
        System.out.println("Rectangle Sum:"+findsum(matrix,l1,r1,l2,r2));

    }
}

    //2nd method findsum

    public static void findPrefixSumMatrix(int matrix[][]) {
        int r=matrix.length;
        int c=matrix[0].length;

        //traverse horizontally to calculate row wise prefix sum
        for(int i=0;i<r;i++){
            for(int j=1;j<c;j++){
               matrix[i][j]+=matrix[i][j-1];
            }
        }

    }
    public static int findsum2(int matrix[][],int l1,int r1,int l2,int r2 ) {
        int sum = 0;
        findPrefixSumMatrix(matrix);
        for (int i = l1; i <= l1; i++) {
            // r1 to r2 sum for row i
            if (r1 >= 1) {
                sum += matrix[i][r2] - matrix[i][r2 - 1];
            }else{
                sum += matrix[i][r2];
        }
    }

        return sum;

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of rows and colums:");
        int r=sc.nextInt();
        int c=sc.nextInt();
        int matrix[][]=new int[r][c];
        int totalelements=r*c;
        System.out.println("Enter "+totalelements+" values");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter rectangle boundaries l1,r1,l2,r2");
        int l1=sc.nextInt();
        int r1=sc.nextInt();
        int l2=sc.nextInt();
        int r2=sc.nextInt();
        System.out.println("Rectangle Sum:"+findsum2(matrix,l1,r1,l2,r2));


    }

}


        // Method to calculate the row-wise prefix sum matrix
        public static void findPrefixSumMatrix(int matrix[][]) {
            int r = matrix.length;
            int c = matrix[0].length;

            // Traverse horizontally to calculate row-wise prefix sum
            for (int i = 0; i < r; i++) {
                for (int j = 1; j < c; j++) {
                    matrix[i][j] += matrix[i][j - 1];
                }
            }
        }

        // Method to find the sum of elements in a sub-matrix defined by l1, r1, l2, r2
        public static int findSum2(int matrix[][], int l1, int r1, int l2, int r2) {
            int sum = 0;
            findPrefixSumMatrix(matrix);

            for (int i = l1; i <= l2; i++) {
                if (r1 >= 1) {
                    sum += matrix[i][r2] - matrix[i][r1 - 1];
                } else {
                    sum += matrix[i][r2];
                }
            }

            return sum;
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter number of rows and columns:");
            int r = sc.nextInt();
            int c = sc.nextInt();
            int matrix[][] = new int[r][c];
            int totalElements = r * c;
            System.out.println("Enter " + totalElements + " values:");
            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++) {
                    matrix[i][j] = sc.nextInt();
                }
            }
            System.out.println("Enter rectangle boundaries l1, r1, l2, r2:");
            int l1 = sc.nextInt();
            int r1 = sc.nextInt();
            int l2 = sc.nextInt();
            int r2 = sc.nextInt();
            System.out.println("Rectangle Sum: " + findSum2(matrix, l1, r1, l2, r2));
        }*/

    //column-wise n row-wise sum

    public static void findPrefixSumMatrix(int matrix[][]) {
        int r = matrix.length;
        int c = matrix[0].length;

        // Traverse horizontally to calculate row-wise prefix sum
        for (int i = 0; i < r; i++) {
            for (int j = 1; j < c; j++) {
                matrix[i][j] += matrix[i][j - 1];
            }
        }

        // Traverse vertically to calculate column-wise prefix sum
        for (int j = 0; j < c; j++) {
            for (int i = 1; i < r; i++) {
                matrix[i][j] += matrix[i - 1][j];
            }
        }
    }


    public static int findSum3(int matrix[][], int l1, int r1, int l2, int r2) {
        int ans = 0;
        int sum=0,up=0,left=0,leftUp=0;
        findPrefixSumMatrix(matrix);

        if(r1>=1){
            sum=matrix[l2][r2];
        }
        if(l1>=1) {
            up = matrix[l1 - 1][r2];
        }
        if(r1>=1) {
            left = matrix[l2][r1 - 1];
        }
        if(l1>=1 && r1>=1) {
            leftUp = matrix[l1 - 1][r1 - 1];
        }
        ans=sum-up-left+leftUp;
        return ans;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows and columns:");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int matrix[][] = new int[r][c];
        int totalElements = r * c;
        System.out.println("Enter " + totalElements + " values:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter rectangle boundaries l1, r1, l2, r2:");
        int l1 = sc.nextInt();
        int r1 = sc.nextInt();
        int l2 = sc.nextInt();
        int r2 = sc.nextInt();
        System.out.println("Rectangle Sum: " + findSum3(matrix, l1, r1, l2, r2));



    }
}











