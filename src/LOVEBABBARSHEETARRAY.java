import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
public class LOVEBABBARSHEETARRAY {
    /*public static void kthsmallest(Integer a[],int k) {
        Arrays.sort(a);
        System.out.println(a[k-1]);

    }
    public static void kthlargest(Integer a[],int l) {
        Arrays.sort(a, Collections.reverseOrder());
        System.out.println(a[l-1]);

    }

    public static void main(String[] args) {
        Integer a[]={22,11,9,7,16};
        int k=2;
        int l=3;
        kthsmallest(a,k);
        kthlargest(a,l);

    }
}
    //0,1,2

    public static void main(String[] args) {
        int a[]={0,1,2,0,1,2};
        int b0=0,b1=0,b2=0;
        for(int i=0;i<a.length;i++){
            if(a[i]==0) b0++;
            else if(a[i]==1) b1++;
            else
                b2++;
        }
        int k=0;
        for(int i=0;i<b0;i++) a[k++]=0;
        for(int i=0;i<b1;i++) a[k++]=1;
        for(int i=0;i<b2;i++) a[k++]=2;

        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
     }
    }


        public static int findduplicate(int number[]) {
            for (int i = 0; i < number.length; i++) {
                for (int j = i + 1; j < number.length; j++) {
                    if (number[i] == number[j]) {
                        return number[i];
                    }
                }
            }

            return -1;
        }

        public static void main(String[] args) {
            int arr[] = {1, 2, 3, 4, 3, 2, 7};
            int duplicate = findduplicate(arr);
            System.out.println("Duplicate element: " + duplicate);
        }*/

    // find the union ans intersection of two sorted array
    public class Solution {
        public static void unionNintersection(int a[], int b[], int m, int n) {
            int i = 0, j = 0;

            // Print union of two arrays
            System.out.print("Union: ");
            while (i < m && j < n) {
                if (a[i] < b[j]) {
                    System.out.print(a[i++] + " ");
                } else if (b[j] < a[i]) {
                    System.out.print(b[j++] + " ");
                } else {
                    System.out.print(b[j++] + " ");
                    i++;
                }
            }

            // Print remaining elements of the first array
            while (i < m) {
                System.out.print(a[i++] + " ");
            }

            // Print remaining elements of the second array
            while (j < n) {
                System.out.print(b[j++] + " ");
            }

            System.out.println(); // Move to the next line after printing the union

            // Resetting indices for intersection
            i = 0;
            j = 0;

            // Print intersection of two arrays
            System.out.print("Intersection: ");
            while (i < m && j < n) {
                if (a[i] < b[j]) {
                    i++;
                } else if (b[j] < a[i]) {
                    j++;
                } else {
                    System.out.print(a[i] + " ");
                    i++;
                    j++;
                }
            }

            System.out.println(); // Move to the next line after printing the intersection
        }

        public static void main(String[] args) {
            int a[] = {1, 2, 4, 5, 7};
            int b[] = {2, 3, 5, 6};
            int m = a.length;
            int n = b.length;
            unionNintersection(a, b, m, n);
        }
    }
}




