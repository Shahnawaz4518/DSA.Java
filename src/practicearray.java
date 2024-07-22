public class practicearray {
    /* public static int linearsearch(int numbers[],int key) {
         for (int i = 0; i < numbers.length; i++) {
             if (numbers[i]==key) {
                 return i;
             }



         }
         return -1;

     }


     public static void main(String[] args) {
       int numbers[]={2,4,6,8,10,12,14,16,18,20};
       int key=10;
       int index=linearsearch(numbers,key);
       if(index==-1){
           System.out.println("Index is not Found");
       }else{
           System.out.println("key at Index:"+index);
       }


     }*/
    public static int getlargest(int numbers[]) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            if (largest < numbers[i]) {
                largest = numbers[i];
            }
            if (smallest > numbers[i]){
                smallest = numbers[i];
        }
    }
        System.out.println(" the smallest number is:"+smallest);
        return largest;

}
        public static void main (String[]args){
            int numbers[] = {2, 4, 1, 10, 5, 18, 8, 9, 14};
            System.out.print(" the largest number is:" + getlargest(numbers));
        }
    }


