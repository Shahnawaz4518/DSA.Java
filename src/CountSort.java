public class CountSort {

   /* public static int findmax(int arr[]) {
        int mx=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>mx){
                mx=arr[i];
            }
        }
          return mx;
    }
    public static void basicCountSort(int arr[]) {
        int max=findmax(arr);
        int count[]=new int[max+1];
        for(int i=0;i<arr.length;i++){
            count[arr[i]]++;
        }
        int k=0;
        for(int i=0;i<count.length;i++){
            for(int j=0;j<count[i];j++){
                arr[k++]=i;
            }
        }

    }
    public static void displayArr(int arr[]) {
           for(int val:arr){
               System.out.print(val+" ");
           }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,1,3,4,3,4,5,1};
        basicCountSort(arr);
        displayArr(arr);
    }
}*/


//2nd and optimize method as compare to basic count sort
/*public static int findmax(int arr[]) {
    int mx=Integer.MIN_VALUE;
    for(int i=0;i<arr.length;i++){
        if(arr[i]>mx){
            mx=arr[i];
        }
    }
    return mx;
}

    public static void countSort(int arr[]) {
        int n=arr.length;
        int output[]=new int[n];
        int max=findmax(arr);
        int count[]=new int[max+1];
        for(int i=0;i<arr.length;i++){
            count[arr[i]]++;
        }
        for(int i=1;i<count.length;i++){
            count[i]+=count[i-1];
        }
        for(int i=n-1;i>=0;i--){
            int idx=count[arr[i]]-1;
            output[idx]=arr[i];
            count[arr[i]]--;
        }
        for(int i=0;i<n;i++){
            arr[i]=output[i];
        }
    }
public static void displayArr(int arr[]) {
    for(int val:arr){
        System.out.print(val+" ");
    }
    System.out.println();
}
public static void main(String[] args) {
    int arr[]={1,2,3,1,3,4,3,4,5,1};
    countSort(arr);
    displayArr(arr);
}
}*/

//Radix Sort

}