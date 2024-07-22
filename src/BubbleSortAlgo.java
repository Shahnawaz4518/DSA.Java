public class BubbleSortAlgo {
   /* public static void BubbleSort(int a[]) {
        int n=a.length;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(a[j]>a[j+1]){
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }

    }

    public static void main(String[] args) {
        int a[]={6,4,5,3,2,1};
        BubbleSort(a);
        for(int i=1;i<=a.length;i++){
            System.out.print(i+" ");
        }
    }
}


//optimize Bubble Sort Algorithm

    public static void BubbleSort(int a[]) {
        int n = a.length;
        for (int i = 0; i < n - 1; i++) {
            boolean flag = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                    flag = true;
                }
            }
            if (flag == false) {
                return;
            }
        }

    }

    public static void main(String[] args) {
        int a[] = {6, 4, 5, 3, 2, 1};
        BubbleSort(a);
        for (int i = 1; i <= a.length; i++) 



*/




    public static void BubbleSort(int a[]) {
        int n=a.length;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(a[i]>a[j+1]){
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }

    }

    public static void main(String[] args) {
        int a[]={6,4,5,3,5,4};
        BubbleSort(a);
        for(int i=1;i<=a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
}





































