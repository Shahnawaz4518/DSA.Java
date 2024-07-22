
public class newbubble{

    public static void bubblesort(int arr[]) {
       int n=arr.length;
       for(int i=0;i<n;i++){
           for(int j=i+1;j<n;j++){  // for(int j=0;j<n-1-i;j++);
               if(arr[i]>arr[j]){   // if(arr[j]>arr[j+1]);
                   int temp= arr[i];
                   arr[i]=arr[j];
                   arr[j]=temp;
               }
           }
       }

    }
    public static void main(String[] args) {
        int arr[]={2,7,5,8,4,3,1,1};
        bubblesort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}



