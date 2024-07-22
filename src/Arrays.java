import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
public class Arrays {
    // public static void main(String[] args) {
    //    int marks[]=new int[100];
    // Scanner sc = new Scanner(System.in);

    /*  marks[0]=sc.nextInt();//phy
      marks[1]=sc.nextInt();//chem
      marks[2]=sc.nextInt();//math

      System.out.println("phy:"+marks[0]);
      System.out.println("chem:"+marks[1]);
      System.out.println("math:"+marks[2]);

      //marks[2]=marks[2]+1;
     // System.out.println("math:"+marks[2]);
int percentage=(marks[0]+marks[1]+marks[2])/3;
      System.out.println("percentage is:" + percentage+"%");

     // System.out.println("length of array= "+ marks.length);

  }

  public static void update(int marks[],int nonchangable)  {
      nonchangable=10;
      for(int i=0;i<marks.length;i++){
          marks[i]=marks[i]+1;

      }

  }

    public static void main(String[] args) {
      int marks[]={ 98,87,90};
      int nonchangable=5;
      update(marks,nonchangable);
        System.out.println(nonchangable);
      //to print our marks
        for(int i=0;i<marks.length;i++){
            System.out.println(marks[i]+" ");

        }-
        System.out.println();

    }

  //linear search
  public static int linearsearch(int numbers[],int key) {
      for(int i=0;i<numbers.length;i++){
          if(numbers[i]==key){
              return i;

          }
      }
      return -1;

  }
  public static void main(String[] args) {
      int numbers[]={2,4,6,8,10,12,14,16};
      int key=20;
      int index=linearsearch(numbers,key);
      if(index==-1){
          System.out.println("NOT FOUND");
      }else{
          System.out.println("key is at index:"+ index);
      }
  }

  // for largest number
  public static int getlargest(int numbers[]) {
      int largest=Integer.MIN_VALUE; // -infinity
      int smallest=Integer.MAX_VALUE;// +infinity
      for(int i=0;i<numbers.length;i++){
          if(largest<numbers[i]){
              largest=numbers[i];
          }
          if(smallest>numbers[i])
              smallest=numbers[i];
      }
      System.out.println("smallest number is :"+smallest);
      return largest;


  }

  public static void main(String[] args) {
      int numbers[]={1,2,6,3,5};
      System.out.println("the largest numbers is :"+getlargest(numbers));

  }

  //Binary Search
  public static int binarysearch(int numbers[],int key) {
      int start = 0, end = numbers.length - 1;
      while (start <= end) {
          int mid = (start + end) / 2;
          if (numbers[mid] == key) {
              return mid;

          }
          if (numbers[mid] < key) {//right shift
              start = mid + 1;
          } else {//left shift
              end = mid - 1;

          }
      }
      return -1;
  }



  public static void main(String[] args) {
      int numbers[]={1,4,6,8,10,12,14};
      int key=12;
      System.out.println("index for key is:"+binarysearch(numbers,key));

  }

  //Reverse an Array

  public static void reverse(int numbers[]) {
      int first=0,last=numbers.length-1;
      while(first<last){
          //swap
          int temp=numbers[last];
          numbers [last]=numbers[first];
          numbers [first]=temp;
          first++;
          last--;

     }

  }

  public static void main(String[] args) {
      int numbers[]={2,4,6,8,10};
      reverse(numbers);

      //print
      for(int i=0;i<numbers.length;i++) {
          System.out.print(numbers[i] + " ");
      }
      System.out.println();
  }

  // pairs on an array
  public static void printpairs(int numbers[]) {
      for(int i=0;i<numbers.length;i++){
          int curr=numbers[i]; //2,4,6,8,10
          for(int j=i+1;j<numbers.length;j++){
              System.out.print("( "+curr+","+numbers[j]+" )");
          }
          System.out.println();
      }

  }


  public static void main(String[] args) {
      int numbers[]={2,4,6,8,10};
      printpairs(numbers);


  }

  public static void printsubarrays(int numbers[]) {
      int ts=0;
      for(int i=0;i<numbers.length;i++){
          int start=i;
          for(int j=i;j<numbers.length;j++){
              int end=j;
              for(int k=start;k<=end;k++){ //only use for print
                  System.out.print(numbers[k]+" "); //subarray
              }
              ts++;
              System.out.println();
          }
          System.out.println();
      }
      System.out.println("total subarrays="+ts);


  }
  public static void main(String[] args) {
      int numbers[]={2,4,6,8,10};
      printsubarrays(numbers);

  }
}
    public static void maxsubarraysum(int numbers[]) {
        int currsum=0;
        int maxsum=Integer.MIN_VALUE;
        int prefix[]=new int[numbers.length];
        prefix[0]=numbers[0];
        //calculate prefix array
        for(int i=1;i<prefix.length;i++){
            prefix[i]=prefix[i-1]+numbers[i];
        }
        for (int i = 0; i < numbers.length; i++) {
            int start = i;
            for (int j = i; j < numbers.length; j++) {
                int end = j;
                currsum=start==0? prefix[end] : prefix[end]-prefix[start-1];
               // currsum=0;
               /* for (int k = start; k <= end; k++) { //only use for print
                    //subarray sum
                    currsum+=numbers[k];

                }

                System.out.println(currsum);
                if(maxsum<currsum){
                    maxsum=currsum;
                }
            }

        }
        System.out.println(" max sum:"+maxsum);


    }

    public static void main(String[] args) {
        int numbers[] = {1,-2,6,-1,3};
        maxsubarraysum(numbers);

    }
//kadanes algorithm

    public static void kadanes(int numbers[]) {
        int ms=Integer.MIN_VALUE;
        int cs=0;
        for(int i=1;i<numbers.length;i++){
            cs=cs+numbers[i];
            //if(int j<1;j<numbers.length;j--){



            }
            ms=Math.max(cs,ms);
        
        System.out.println(" our max subarray number is:"+ms);


    }
    public static void main(String[] args) {
        int numbers[]={ -1,-2,-3,-4} ;   //  {-2,-3,4,-1,-2,1,5,-3};
        kadanes(numbers);


    }
}

    // trapped water
    //public class Arrays {
        public static int trappedRainwater(int height[]) {
            int n = height.length;

            // Calculate leftMax boundary-array
            int leftMax[] = new int[n];
            leftMax[0] = height[0];
            for (int i = 1; i < n; i++) {
                leftMax[i] = Math.max(height[i], leftMax[i - 1]);
            }

            // Calculate rightMax boundary-array
            int rightMax[] = new int[n];
            rightMax[n - 1] = height[n - 1];
            for (int i = n - 2; i >= 0; i--) {
                rightMax[i] = Math.max(height[i], rightMax[i + 1]);
            }

            // Calculate trapped water
            int trappedWater = 0;
            for (int i = 0; i < n; i++) {
                // Water level is the minimum of leftMax and rightMax
                int waterLevel = Math.min(leftMax[i], rightMax[i]);
                // Trapped water is the difference between water level and height
                trappedWater += waterLevel - height[i];
            }

            return trappedWater;
        }

        public static void main(String[] args) {
            int height[] = {4, 2, 0, 6, 3, 2, 5};
            System.out.println(trappedRainwater(height));
        }+
    }



// buyandsellingstocks

   public static int buyandsellStocks(int prices[]) {
        int buyprice = Integer.MAX_VALUE;
        int maxprofit = 0;

        for (int i = 0; i < prices.length; i++) {
            if (buyprice < prices[i]) {
                int profit = prices[i] - buyprice;
                maxprofit = Math.max(maxprofit, profit);
            } else {
                buyprice = prices[i];
            }
        }
        return maxprofit;
    }

    public static void main(String[] args) {
        int prices[] = {7, 1, 5, 3, 6, 4}; // O(n)
        System.out.println(buyandsellStocks(prices));
    }
    }

    public static void kadanes(int numbers[]) {
        int ms=Integer.MIN_VALUE;
        int cs=0;
        for(int i=1;i<numbers.length;i++){
            cs=cs+numbers[i];
            //if(int j<1;j<numbers.length;j--){



        }
        ms=Math.max(cs,ms);

        System.out.println(" our max subarray number is:"+ms);


    }
    public static void main(String[] args) {
        int numbers[]={ -1,-2,-3,-4} ;   //  {-2,-3,4,-1,-2,1,5,-3};
        kadanes(numbers);


      public static int linearsearch(int numbers[],int key) {
      for(int i=0;i<numbers.length;i++){
          if(numbers[i]==key){
              return i;

          }
      }
      return -1;

  }
  public static void main(String[] args) {
      int numbers[]={2,4,6,8,10,12,14,16};
      int key=20;
      int index=linearsearch(numbers,key);
      if(index==-1){
          System.out.println("NOT FOUND");
      }else{
          System.out.println("key is at index:"+ index);
      }
  }












}*/



    public static int  linersearch(int arr[],int target) {
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
              return i;
            }
        }
        return -1;


    }
    public static void main(String[] args) {
        int arr[]={4,6,3,7,9,1,5};
        int target=7;
        int index=linersearch(arr,target);
        if(index==-1){
            System.out.println("NOT FOUND");
        }else{
            System.out.println("FOUND");
        }

    }
}









