import java.util.ArrayList;
import java.util.Scanner;
public class PWRecursion {
    /* public static void printIncreasing(int n) {
         if(n==1){
             System.out.print(n);
             return;
         }
         printIncreasing(n-1);
         System.out.print(n);

     }
     public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter the value of n:");
         int n=sc.nextInt();
         printIncreasing(n);
     }
 }

     //PrintDecreasing
     public static void PrintDecreasing(int n) {
         //base case
         if(n==1){
             System.out.println(n);
             return;
         }
         //self work
         System.out.println(n);
         //Recursive work
         PrintDecreasing(n-1);

     }
     public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter the value of n:");
         int n=sc.nextInt();
         PrintDecreasing(n);

     }
 }
    //find factorial number
    public static int factorial(int n) {
        //base case
        if (n == 0) return 1;

        //smaller problem-recursive work
        int SmallAns = factorial(n - 1);

        //big problem-self work
        int Ans = n * SmallAns;

        return Ans;
    }
    public static void main(String[] args) {
        System.out.println(factorial(4));
    }
}
    //find nth fibonacci number
    public static int fib(int n) {
        //base case
        if(n==0 || n==1) {
            return n;
        }
        // subproblems-recursive work
        int prev=fib(n-1);
        int prevPrev=fib(n-2);

        //self work
        return prev+prevPrev;
      }

    public static void main(String[] args) {
        for(int i=0;i<=10;i++)
        System.out.println(fib(i));
    }
}
    //sumof alldigit
    public static int SOD(int n) {
        //base case
        if (n >= 0 && n <= 9) return n;

        return SOD(n / 10) + n % 10;
    }

    public static void main(String[] args) {
        System.out.println(SOD(1234));

    }
}

    static int countofdigits(int n) {
        if (n >= 0 && n <= 9) return 1;
        return countofdigits(n / 10) + 1;
    }

    public static void main(String[] args) {
        System.out.println(countofdigits(65744));
    }
}
// power
    public static int pow(int p,int q) {
        if(q== 0) return 1;
        return pow(p ,q-1)*p;
    }

    public static void main(String[] args) {

        System.out.println(pow(5,4));
    }
}
//print multiple
    public static void printmultiples(int n,int k) {
        if(k==1){
            System.out.println(n);
            return;
        }
        printmultiples(n,k-1);
        System.out.println(n*k);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        printmultiples(n,k);
    }
}
    public static int seriessum1(int n) {
        if(n==0){
            return 0;
        }
        return seriessum1(n-1)+n;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(seriessum1(n));
    }
}
    // alternative sum
    public static int alternateseriessum(int n) {
        if(n==0) return 0;

        if(n%2==0){
            return alternateseriessum(n-1)-n;
        }else{
            return alternateseriessum(n-1)+n;
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(alternateseriessum(n));
    }
 }
// GCD
    public static int gcd(int x,int y) {
        if(y==0){
            return x;
        }
        return gcd(y,x%y);

    }
    public static int GCD(int x,int y) {
        while(x%y!=0){
            int rem=x%y;
            x=y;
            y=rem;
        }
       return y;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        System.out.println(GCD(x,y));
        System.out.println(gcd(x,y));
    }
}
    // array paird and its value recursively
    public static void printarray(int arr[],int idx ){ //5,6,7,8
        //base case
        if(idx==arr.length) {
            return;
        }
        //self work
        System.out.println(arr[idx]); //5
        //recursive work-subproblem
        printarray(arr,idx+1); //6,7,8


    }

    public static void main(String[] args) {
        int arr[]={5,6,7,8,9};
        printarray(arr,0);
    }
}
// find the max value in array
    public static int MaxInArray(int arr[],int idx) {
        //base case
        if(idx==arr.length-1  ){
            return arr[idx];
        }
        //small problem--> idx+1 end of the array-->max--> recursive case
        int smallAns=MaxInArray(arr,idx+1);
        //self work ans final ans
        return Math.max(arr[idx],smallAns);

    }
    public static void main(String[] args) {
        int arr[]={5,6,7,8,9};
        System.out.println(MaxInArray(arr,0));
    }
}
// find the sum of elements of the array
    public static int sumOfArray(int arr[],int idx) {
        if(idx==arr.length){
            return 0;
        }
        int smallAns=sumOfArray(arr,idx+1);
        return smallAns+arr[idx];

    }
    public static void main(String[] args) {
        int arr[]={2,3,4};
        System.out.println(sumOfArray(arr,0));
    }
}

    // find the target value using recursion search
    public static int findIndex(int a[],int n,int target,int idx) {
        //base case
        if(idx>=n) return -1;
        //self work
        if(a[idx]==target) return 1;
        //recursion work
        return findIndex(a,n,target,idx+1);
    }
    //return ture and false based on index
    public static boolean recursiveSearch(int a[],int n,int target,int idx) {
        //base case
        if(idx>=n) return false;
        //self work
        if(a[idx]==target) return true;
        //recursion work
        return recursiveSearch(a,n,target,idx+1);
    }
    public static void main(String[] args) {
        int a[]={3,4,1,5,7,2};
        int target=5;
        int n=a.length;
        System.out.println(findIndex(a,n,target,0));
       // if(recursiveSearch(a,a.length,target,0)){
       //     System.out.println("Yes");
       // }else{
       //     System.out.println("No");
      //  }

    }

}
    // find all indices
    public static void findAllIndices(int a[],int n,int target,int idx) {
        //base case
        if(idx>=n){
            return;
        }
        //self work
        if(a[idx]==target){
            System.out.println(idx);
        }
        //recursion work
         findAllIndices(a,n,target,idx+1);
    }

    public static void main(String[] args) {
        int a[]={1,2,4,4,4,5,6};
        int target=4;
        int n=a.length;
        findAllIndices(a,n,target,0);
    }

}

    // ArrayList<Interger>
    public static ArrayList<Integer> allIndices(int a[], int n, int target, int idx) {
//base case
        if (idx >= n) {
            return new ArrayList<Integer>();
        }
        ArrayList<Integer> ans = new ArrayList<>();
        // self work
        if (a[idx] == target) {
            ans.add(idx);
        }
        ArrayList<Integer> smallAns = allIndices(a, n, target, idx + 1);
        ans.addAll(smallAns);
        return ans;
    }

    public static void main(String[] args) {
        int a[] = {1, 2, 4, 4, 4, 5, 6};
        int target = 4;
        int n = a.length;
        ArrayList<Integer> ans = allIndices(a, n, target, 0);
        for (Integer i : ans) {
            System.out.println(i);
        }

    }
}*/

    /*public ArrayList<String> getSSQ(String s) {
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
        ArrayList<String> ans =mainInstance.getSSQ("abc"); // Call the method on the instance
        for (String ss : ans) {
            System.out.println(ss);
        }
    }*/


// print all its subsequenc
public static void main(String[] args) {

}
}













