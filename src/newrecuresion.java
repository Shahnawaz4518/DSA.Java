public class newrecuresion {
    //print SSQ
   /* public static void printSSQ(String s,String currAns) {
        if(s.length()==0){
            System.out.println(currAns);
            return;
        }
        char curr=s.charAt(0);//a
        String remString=s.substring(1);//bc

        printSSQ(remString,currAns+curr);// add curr

        printSSQ(remString,currAns);//do not add curr

    }

    public static void main(String[] args) {
        printSSQ("abc","");

    }
}
// print sums of al subsets
    public static void subsetsum(int []a, int n,int idx,int sum) {
     if(idx>=n){
         System.out.println(sum);
         return;
     }
     subsetsum(a,n,idx+1,sum+a[idx]);

        subsetsum(a,n,idx+1,sum);



    }
    public static void main(String[] args) {
       int a[]={2,4,5};
       subsetsum(a,a.length,0,0);

    }

}
//frog jump problem
    public static int best(int h[],int n,int idx) {
        if(idx==n-1) return 0;

        int op1=Math.abs(h[idx]-h[idx+1])+best(h,n,idx+1);
        if(idx==n-2) return op1;
        int op2=Math.abs(h[idx]-h[idx+2])+best(h,n,idx+2);

        return Math.min(op1,op2);

    }
    public static void main(String[] args) {
       int h[]={10,30,40,20};
        System.out.println(best(h,h.length,0));
    }
}*/
    public static void KeypadCombination(String dig, String[] kp, String res) {
        if (dig.length() == 0) {
            System.out.print(res + " ");
            return;
        }
        int currNum = dig.charAt(0) - '0';  //2
        String currChoices = kp[currNum]; //"abc"

        for (int i = 0; i < currChoices.length(); i++) {
            KeypadCombination(dig.substring(1), kp, res + currChoices.charAt(i));
        }
    }

    public static void main(String[] args) {
        String s = "253";
        String[] kp = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        //            0   1    2      3     4      5    6      7      8     9
        KeypadCombination(s, kp, "");
    }
}