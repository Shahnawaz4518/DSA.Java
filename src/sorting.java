public class sorting {

    //Bubble sorting
   /* public static void bubbleSort(int arr[]) {
        for(int turn=0;turn<arr.length-1;turn++){
            for(int j=0;j<arr.length-1-turn;j++){
                if(arr[j]>arr[j+1]){
                    //swap
                    int temp =arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }

    }

    public static void printArr(int arr[]) {
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

    }
    public static void main(String[] args) {
        int arr[]={5,4,1,3,2};
        bubbleSort(arr);
        printArr(arr);
    }


    // selection sort
    public static void printArr(int arr[]) {
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

    }
    public static void selectionSort(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            int minPos = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[minPos] < arr[j]) {
                    minPos = j;
                }
            }
            //swap
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        }
    }

            public static void main (String[]args){
            int arr[] = {5, 4, 1, 3, 2};
            selectionSort(arr);
            printArr(arr);

        }
    public static void bubblesort(int arr[]) {
        for(int turn=0;turn<arr.length-1;turn++){
            for(int j=0;j<arr.length-1-turn;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }

    }

    public static void printarr(int arr[]) {
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

    }
    public static void main(String[] args) {
         int arr[]={5,4,1,3,2};
       // int arr[]={1,2,3,4,5};
        bubblesort(arr);
        printarr(arr);

    }*/

    public static void insertionsort(int arr[]) {
        for(int i=1;i<arr.length;i++){
            int curr=arr[i];
            int prev=i-1;
            //finding out the corrct position of the insert
            while(prev>=0 && arr[prev]>curr){
                arr[prev+1]=arr[prev];
                prev--;
            }
            //insertion
            arr[prev+1]=curr;
        }

    }
    public static void main(String[] args) {
        int arr[]={5,4,1,3,2};
        insertionsort(arr);
       // printArr(arr);

    }
    }

