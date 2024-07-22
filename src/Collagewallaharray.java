import java.util.*;
import java.util.ArrayList;

import com.sun.jdi.PathSearchingVirtualMachine;
import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.Arrays;

public class Collagewallaharray {


    /* public static void sumofarray(int arr[]) {
         int sum=0;
         for(int i=0;i<arr.length;i++){
             sum+=arr[i];

         }
         System.out.println(sum);

     }
     public static void main(String[] args) {
         int arr[]={3,5,7,1,5};
         sumofarray(arr);
     }
     void sumofarray(){
         int [] arr={9,2,5,6};
         int sum=0;
         for(int i=0;i<arr.length;i++){
             sum+=arr[i];
         }
         System.out.println(sum);
    public static void Maxvalueofarray(int arr[]) {
        int ans=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>ans){
                ans=arr[i];
            }
        }
        System.out.println("Max="+ans);

    }

     public static void main(String[] args) {
         int arr[]={3,5,1,5,9,2,4,10};
         Maxvalueofarray(arr);

    }
    public static int Searchelement(int arr[],int key) {


        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                return i;
            }

        }
        return -1;

    }
     public static void main(String[] args) {
        int arr[]={1,5,3};
        int key =5;
        int index=Searchelement(arr,key);
        if(index==-1){
            System.out.println("key element is not found");
            }else{
            System.out.println("key element is:"+index);
        }
    }


     //count the number of occurences of a particular element x

     public static int countoccurences(int arr[],int x) {
         int count=0;
         for(int i=0;i<arr.length;i++){
             if(arr[i]==x){
                 count++;
             }
         }
         return count;

     }
     public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter the size of array:");
         int n=sc.nextInt();

         int arr[]=new int[n];
         System.out.println("Enter"+n+"element:");
         for(int i=0;i<arr.length;i++){
           arr[i]=sc.nextInt();
         }
         System.out.println("Enter x:");
         int x=sc.nextInt();
        // System.out.println("COUNT OF X:" + countoccurences(arr,x));
     }

     //find the last occurrence

     public static int lastoccurrence(int arr[],int x) {
         int lastindex=-1;
         for(int i=0;i<arr.length;i++){
             if(arr[i]==x){
                 lastindex=i;
             }
         }
         return lastindex;

     }

     public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter the size of array:");
         int n=sc.nextInt();

         int arr[]=new int[n];
         System.out.println("Enter"+n+"element:");
         for(int i=0;i<arr.length;i++){
             arr[i]=sc.nextInt();
         }
         System.out.println("Enter x:");
         int x=sc.nextInt();
         System.out.println("LAST OCCURRENCE IS:"+lastoccurrence(arr,x));
     }
     // counter the number of elements strictly greater than value x
    public static int strictlygreater(int arr[],int x) {
        int counter=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>x){
                counter++;
            }
        }
        return counter;
    }



     public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter the size of array:");
         int n=sc.nextInt();

         int arr[]=new int[n];
         System.out.println("Enter" + n + "element:");
         for(int i=0;i<arr.length;i++){
             arr[i]=sc.nextInt();
         }
         System.out.println("Enter x:");
         int x=sc.nextInt();
         System.out.println("greater elements are:"+strictlygreater(arr,x));

     }

     public static boolean sortedornot(int arr[]) {
         boolean check=true;
         for (int i = 1; i < arr.length; i++) {
             //i=0 not taken bcoz we can't compare with -1
             if (arr[i] < arr[i - 1]) {
                 check=false;
                 break;
             }
         }
         return check;

     }

     public static void main(String[] args) {
         int arr[]={1,2,3,4,5};
         System.out.println("the array is:"+sortedornot(arr));

     }
    public static int pairsum(int arr[],int target) {
        int n = arr.length;
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    ans++;
                }
            }
        }

        return ans;


    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size:");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter " + n + " Element:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the element of target:");
        int target = sc.nextInt();
        System.out.println("Number of pairs with sum:"+pairsum(arr,target));

        //System.out.println("Number of pairs with sum " + x + " is: " + pairsum(arr, x));


    }

       /* public static int pairsum(int arr[], int target) {
            int n = arr.length;
            int ans = 0;
            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    if (arr[i] + arr[j] == target) {
                        ans++;
                    }
                }
            }
            return ans;
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the array size:");
            int n = sc.nextInt();
            int arr[] = new int[n];

            System.out.println("Enter " + n + " elements:");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.print("Enter the target element:");
            int x = sc.nextInt();

            System.out.println("Number of pairs with sum " + x + " is: " + pairsum(arr, x));
        }
// target sum
//lecture 16  count the number of triplets whose sum is equal to the given value x


    public static int tripletssum(int arr[],int target) {
        int n=arr.length;
        int ans=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                for(int k=j+1;k<n;k++){
                    if(arr[i]+arr[j]+arr[k]==target){
                        ans++;
                    }
                }
            }

        }
        return ans;

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n=sc.nextInt();
        int arr[]=new int[n];

        System.out.println("Enter "+n+" Element:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the target:");
        int target=n=sc.nextInt();

        System.out.println("SUM OF ELEMENTS IS :"+tripletssum(arr,target));
    }

    //find unqiue number
    public static int uniquenumber(int arr[]) {
        int n=arr.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if (arr[i]==arr[j]){
                    arr[i]=-1;
                    arr[j]=-1;
                }

            }
        }
        int ans=-1;
        for(int i=0;i<n;i++){
            if(arr[i]!=-1){ // or also we write arr[i]>0
                ans=arr[i];

            }
        }
        return ans;


    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of Array:");
        int n=sc.nextInt();
        int arr[]=new int[n];

        System.out.println("Enter "+n+" Element:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
       // System.out.println("Enter value of x:");
      //  int x=sc.nextInt();
        System.out.println("unique number is:"+uniquenumber(arr));
    }
//find the maximum element
    public static void Maximumnumber(int arr[]) {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.print(max);

    }


    public static void main(String[] args) {
        int arr[]={5,4,1,6,2};
        //System.out.println("Maximum value is:"+Maximumnumber(arr));
        Maximumnumber(arr);
    }
    //  FIND THE SECOND MAXIMUM NUMBER IN ARRAY


    public static void findsecondmax(int arr[]) {
        int max = findMax(arr);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == max) {
                arr[i] = Integer.MIN_VALUE;
            }
        }
        int secondMax = findmax(arr);
        System.out.println(max);

    }




    public static void main(String[] args) {
        int arr[] = {5, 4, 1, 6, 2};
        //System.out.println("Maximum value is:"+Maximumnumber(arr));
        findsecondmax(arr);

    }
}

    public class SecondMaxFinder {

        // Method to find the maximum value in the array
        public static int findMax(int arr[]) {
            int max = arr[0];
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] > max) {
                    max = arr[i];
                }
            }
            return max;
        }

        // Method to find the second maximum value in the array
        public static void findSecondMax(int arr[]) {
            int max = findMax(arr);
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == max) {
                    arr[i] = Integer.MIN_VALUE;
                }
            }
            int secondMax = findMax(arr);  // Changed to call the correct method
            System.out.println("Second maximum value is: " + secondMax);
        }

        public static void main(String[] args) {
            int arr[] = {5, 4, 1, 6, 2};
            findSecondMax(arr);
        }
    }
    //repeated value return if not repeated than return -1
    public static int printrepeatednumber(int arr[]) {
        int n = arr.length;
        // int ans=0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    //ans++;
                    return arr[i];

                }
                // System.out.println("repeated number is:"+arr[i]);
            }

        }
        return -1;

    }

    public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the size of array:");
            int n = sc.nextInt();
            int arr[] = new int[n];

            System.out.println("Enter " + n + " Element:");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
                System.out.println("first repeating value:"+printrepeatednumber(arr));




        }


    //lecture 17
    //swap the value a anc b
    public static void swapwithoutusingtemp(int a, int b) {
        System.out.println("original value before swap is:");
        System.out.println("a:" + a);
        System.out.println("b: " + b);


        a = a + b;
        b = a - b;
        a = a - b;


        System.out.println("value after the swap:");
        System.out.println("a:" + a);
        System.out.println("b:" + b);


    }


    public static void swap(int a, int b) {
        // int temp;
        System.out.println("original value before swap is:");
        System.out.println("a:" + a);
        System.out.println("b: " + b);

        int temp = a;
        a = b;
        b = temp;
        System.out.println("value after the swap:");
        System.out.println("a:" + a);
        System.out.println("b:" + b);


    }

    public static void printarray(int arr[]) {
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

    }
    public static int[] reversearray(int arr[]) {
        int n = arr.length;
        int ans[] = new int[n];
        int j = 0;
        for (int i = n - 1; i >= 0; i--) {
            ans [j++] = arr[i];
        }

        return ans;
    }



    public static void main(String[] args) {
        //int a=9;
        //int b=3;
        int arr[]={1,2,3,4,5};
        int ans[]=reversearray(arr);
        printarray(ans);
       // swap(a,b);
        //swapwithoutusingtemp(a,b);

    }

    public static void swapInArray(int arr[],int i,int j) {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;

    }
    public static void reverseArray(int arr[]) {
        int i=0,j=arr.length-1;
        while(i<j){
            swapInArray(arr,i,j);
            i++;
            j--;
        }

    }
    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        reverseArray(arr);
        printArray(arr);


    }*/

  /*  public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

    }


    public static void swapInArray(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }

    public static void sortbyparity(int arr[]) {
        int n = arr.length;
        int left = 0, right = n - 1;
        while (left < right) {
            if (arr[left] % 2 == 1 && arr[right] % 2 == 0) {
                swapInArray(arr, left, right);
                left++;
                right--;
            }
            if (arr[left] % 2 == 0) {
                left++;
            }
            if (arr[right] % 2 == 1) {
                right--;
            }
        }

    }

   /* public static void sortZerosAndOne(int arr[]) {
        int n=arr.length;
        int left=0,right=n-1;
        while(left<right){
            if(arr[left]==1 && arr[right]==0){
                swapInArray(arr,left,right);
                left ++;
                right --;
            }
            if(arr[left]==0){
                left++;
            }if(arr[right]==1){
                right--;
            }
        }


    }*/

   /* public static void sortZerosAndOne(int arr[]) {
        int n=arr.length;
        int zeros=0;
        //count number of zeros
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                zeros++;
            }
        }
        //0 to zeros-1 : 0, zeros to n-1 : 1
        for(int i=0;i<n;i++){
            if(i<zeros){
                arr[i]=0;
            }else{
                arr[i]=1;
            }

        }

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the array size:");
        int n=sc.nextInt();
        int arr[]=new int[n];

        System.out.println("Enter "+n+" Element:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Original array:");
        printArray(arr);
        sortbyparity(arr);
       // sortZerosAndOne(arr);
        System.out.println("sorted array:");
        printArray(arr);
    }
   public static void reverse(int arr[]) {
       int i=0,j=arr.length;
       while(i<j){
           swapInArray(arr,i,j);
           i++;
           j--;
       }

   }

    public static void sortsquared(int arr[]) {
       int n=arr.length;
       int left=0,right=n-1,k=0;
       int ans[]=new int[n];
       while(left<=right){
           if(Math.abs(arr[left])>Math.abs(arr[right])){
               ans[k]=arr[left]*arr[left];
               k++;
               left++;
           }else{
               ans[k]=arr[right]*arr[right];
               k++;
               right--;
           }
       }

    }

   public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the array size:");
       int n=sc.nextInt();
       int arr[]=new int[n];

       System.out.println("Enter "+n+" Element:");
       for(int i=0;i<n;i++){
           arr[i]=sc.nextInt();
       }
       System.out.println("Original array:");
       printArray(arr);
       int  ans[]=sortsquared(arr);
       System.out.println("sorted array is:");
       reverse(ans);
       printArray(arr);

   }\

    //lecture 19 PREFIX SUMS


    public static void printArray(int arr[]) {
       for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

    }

    public static int[] makeprefixsumArray(int arr[]) {
        int n=arr.length;
        int pref[]=new int[n];
        pref[0]=arr[0];
        for(int i=0;i<n;i++){
            pref[i]=pref[i-1]+pref[i];
        }
        return pref;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size:");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter " + n + " Element:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Input array:");
        printArray(arr);
        int pref[]=makeprefixsumArray(arr);
        printArray(arr);
    }
   public static void printArray(int arr[]) {
       for(int i=0;i<arr.length;i++){
           System.out.print(arr[i]+" ");
       }
       System.out.println();

   }

    public static int[] MakeprefixsumArray(int arr[]) {
        int n=arr.length;

        for(int i=0;i<n;i++){
            arr[i]=arr[i+1]+arr[i];
        }
        return arr;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size:");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter " + n + " Element:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Input array:");
        printArray(arr);
        int pref[] = MakeprefixsumArray(arr);
        printArray(arr);

    }

}

//LECTURE-24
// ArrayList In Java,Collections,ArrayListMethods
public static void main(String[] args) {
    //wrapper classes
  //  Integer i=Integer.valueOf(4);
  //  System.out.println(i);
   // Float f=Float.valueOf(4.5f);
   // System.out.println(f);

    ArrayList<Integer> l1=new ArrayList<>();

    // add element
     l1.add(1);
     l1.add(5);
     l1.add(3);
     l1.add(4);

     //get the element at index i

    System.out.println(l1.get(1));

    //print with for loop

    for(int i=0;i<l1.size();i++){
       System.out.println(l1.get(i));
    }

    // printing the aaray list directly

    System.out.println(l1);

    // adding element at some index i //[5 100 1 3 4]
     l1.add(1,100);
    System.out.println(l1);

    // modifying element at index i
    l1.set(1,10);
    System.out.println(l1);


    //removing an element at index i
    l1.remove(1);
    System.out.println(l1);

    // removing an element e
    l1.remove(Integer.valueOf(3));
    System.out.println(l1);

    //checking if an element exists
    boolean ans=l1.contains(Integer.valueOf(7));
    System.out.println(ans);

    // if you dont't specify class,you can put anything inside l
    ArrayList l= new ArrayList();
    l.add("String");
    l.add(25);
    l.add(true);
    System.out.println(l);

   }
}*/

    //QUESTION BASED ON ArrayList

    //Q1. write a program to reverse the given ArrayList

   /* public static void reverseList(ArrayList<Integer>list) {
        int i=0 , j=list.size()-1;

        while(i<j){

           // int temp=a;
           // a=b;
           // b=temp;

            Integer temp=Integer.valueOf(list.get(i));
            list.set(i,list.get(j));
            list.set(j,temp);
            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        list.add(0);
        list.add(10);
        list.add(3);
        list.add(5);
        list.add(22);
        list.add(10);
        System.out.println("Orininal List="+list);
        Collections.reverse(list);
      //  reverseList(list);
        System.out.println("Reversed List="+list);

    }

}

    //q2.write a program to reverse the given Arraylist

    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        list.add(0);
        list.add(10);
        list.add(3);
        list.add(5);
        list.add(22);
        list.add(10);
        System.out.println("Orininal List="+list);
        Collections.reverse(list);
        //  reverseList(list);
        System.out.println("Reversed List="+list);
        Collections.sort(list);
        System.out.println("Asecnding order="+ list);
        Collections.sort(list,Collections.reverseOrder());
        System.out.println("Decending order="+list);

        ArrayList<String> l1=new ArrayList<>();
        l1.add("Welcome");
        l1.add("To");
        l1.add("Physics");
        l1.add("wallah");
        System.out.println("OG"+l1);
        Collections.sort(l1);
        System.out.println("Sorted="+l1);
        Collections.sort(l1,Collections.reverseOrder());
        System.out.println("Reverse="+l1);
    }

}


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(s);

        System.out.println(s.substring(2));

       // char ch=s.charAt(0);
       // System.out.println(ch);

      //  for(int i=0;i<s.length();i++){
        //    System.out.println(s.charAt(i));
        }
    }


    //remove occurrences  //dbacx-->dbcx
    public static String removeA2(String s) {
        if(s.length()==0) return " ";
        String smallAns=removeA2(s.substring(1));
        char currChar=s.charAt(0);
        if(currChar !='a'){
            return currChar+smallAns;  //d+bcx
        } else{
            return smallAns;
        }


    }

    public static String removeA(String s,int idx) {

        //base case
        if(idx==s.length()) return"";

        //recursive work

        String smallAns=removeA(s,idx+1);

        char currChar=s.charAt(idx);

        //self work
        if(currChar !='a'){
            return currChar+smallAns;  //d+bcx
        } else{
            return smallAns;
        }

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(removeA(s,0));
        System.out.println(removeA2(s));

    }
    }


// reverse String
public static String reverse(String s,int idx) {
    if(idx==s.length()) return " ";
    String smallAns=reverse(s,idx+1);

    return smallAns+s.charAt(idx);
}
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();
    System.out.println(reverse(s,0));
}
}

// String Palindrome or not with reverse method

    public static String reverse(String s, int idx) {
        if (idx == s.length()) return "";
        String smallAns = reverse(s, idx + 1);
        return smallAns + s.charAt(idx);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String rev = reverse(s, 0);
        if (rev.equals(s)) {
            System.out.printf("%s is a Palindrome", s);
        } else {
            System.out.printf("%s is Not a Palindrome", s);
        }
    }
}

// String Palindrome or not without reverse method
public static boolean isPalindrome(String s,int l,int r) {
    if(l>=r) return true;
    return (s.charAt(l)==s.charAt(r) && isPalindrome(s,l+1,r-1));

}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(isPalindrome(s,0,s.length()-1));
      }
    }

   //Return SSQ
   public ArrayList<String> getSSQ(String s){
    ArrayList<String> ans = new ArrayList<>();
    // base case
        if (s.length() == 0) {
        ans.add("");
        return ans;
    }
    char curr = s.charAt(0); // a
    ArrayList<String> smallAns = getSSQ(s.substring(1));
    // smallAns=["bc","b","c",""]

    // ans=["bc","abc","b","ab","c","ac","","a"]
        for (String ss : smallAns) {
        ans.add(ss); // ""
        ans.add(curr + ss); // a
    }
        return ans;
}

public static void main(String[] args) {
     // Create an instance of the class
    ArrayList<String> ans = getSSQ("abc"); // Call the method on the instance
    for (String ss : ans) {
        System.out.println(ss);
    }
}
}public ArrayList<String> getSSQ(String s) {
        ArrayList<String> ans = new ArrayList<>();
        // base case
        if (s.length() == 0) {
            ans.add("");
            return ans;
        }
        char curr = s.charAt(0); // a
        ArrayList<String> smallAns = getSSQ(s.substring(1));
        // smallAns=["bc","b","c",""]

        // ans=["bc","abc","b","ab","c","ac","","a"]
        for (String ss : smallAns) {
            ans.add(ss); // ""
            ans.add(curr + ss); // a
        }
        return ans;
    }

    public static void main(String[] args) {
        Main mainInstance = new Main(); // Create an instance of the class
        ArrayList<String> ans = mainInstance.getSSQ("abc"); // Call the method on the instance
        for (String ss : ans) {
            System.out.println(ss);
        }
    }
}public ArrayList<String> getSSQ(String s) {
        ArrayList<String> ans = new ArrayList<>();
        // base case
        if (s.length() == 0) {
            ans.add("");
            return ans;
        }
        char curr = s.charAt(0); // a
        ArrayList<String> smallAns = getSSQ(s.substring(1));
        // smallAns=["bc","b","c",""]

        // ans=["bc","abc","b","ab","c","ac","","a"]
        for (String ss : smallAns) {
            ans.add(ss); // ""
            ans.add(curr + ss); // a
        }
        return ans;
    }

    public static void main(String[] args) {
        Main mainInstance = new Main(); // Create an instance of the class
        ArrayList<String> ans = mainInstance.getSSQ("abc"); // Call the method on the instance
        for (String ss : ans) {
            System.out.println(ss);
        }
    }
}*/

// print all its subsequence


}









