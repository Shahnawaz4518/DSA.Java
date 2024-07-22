public class InsertionSortAlgo {
  /*  public static void InsertionSort(int a[]) {
        int n=a.length;
        for(int i=1;i<n;i++){
            int j=i;
            while(j>0 && a[j]<a[j-1]){
                int temp=a[j];
                a[j]=a[j-1];
                a[j-1]=temp;
                j--;
            }

        }

    }
    public static void main(String[] args) {
        int a[]={3,4,2,1,5,6,3};
        InsertionSort(a);
        for(int i=1;i<a.length;i++){
            System.out.print(i+" ");
        }

    }
}

    //Question --->Move all Zero Element at the end   0 2 4 1 0 3  -->  2 4 1 3 0 0

    public static void MoveZeros(int arr[]) {
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
              if(arr[j]==0 && arr[j+1]!=0){
                  int temp=arr[j];
                  arr[j]=arr[j+1];
                  arr[j+1]=temp;
              }
            }
        }

    }
    public static void main(String[] args) {
        int arr[]={ 0,2,4,1,0,3};
        MoveZeros(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}*/


    //Lexicography Sorting Using Fruit Names

    public static void SortFruits(String Fruits[]) {
       int n=Fruits.length;
       for(int i=0;i<n-1;i++){
           int min_index=i;
           for(int j=i+1;j<n;j++){
               if(Fruits[j].compareTo(Fruits[min_index])<0){
                     min_index=j;
               }
           }
           String temp=Fruits[i];
           Fruits[i]=Fruits[min_index];
           Fruits[min_index]=temp;
       }

    }
    public static void main(String[] args) {
        String Fruits[]={"kiwi","apple","papaya","mango","watermelon"};
        SortFruits(Fruits);
        for(String val:Fruits){
            System.out.print(val+" ");
        }

    }
}
