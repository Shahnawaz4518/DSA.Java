import java.util.Scanner;
public class Stringex {
    /*public static void printletters(String str) {
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i)+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {



     /*   char arr[] = {'a', 'b', 'c', 'd'};
        String str = "abcd";
        String str2 = new String("xyz");
        // strings are IMMUTABLE

        Scanner sc = new Scanner(System.in);
        String name;
        name = sc.nextLine();
        System.out.println(name);


      //  String fullName=" I AM SHAHNAWAZ KHAN";  //space bhi count hogi
      //  System.out.println(fullName.length());





        String firstName= "Shahnawaz";
        String lastName="Khan";
        String fullName=firstName+" "+lastName;
        printletters(fullName);


    }

    //CHECK IT IS PALINDROME OR NOT
    public static boolean ispalindrome(String str) {
        int n=str.length();
        for(int i=0;i<n/2;i++){
            if(str.charAt(i)!= str.charAt(n-1-i)){
                return false;

            }
        }
        return true;

    }

    public static void main(String[] args) {
        String str="racecar";
        System.out.println(ispalindrome(str));
    }

    //FIND THE SHORTEST PATH OF TO REACH DESTINATION
    public static float getShortestPath(String path) {
        int x=0,y=0;
        for(int i=0;i<path.length();i++){
            char dir=path.charAt(i);
            // for south
            if(dir=='S'){
                y--;
            }// for north
            else if(dir=='N'){
                y++;
            }//for west
            else if(dir=='W'){
                x--;
            }//for east
            else{
                x++;
            }
        }
        int x2=x*x;
        int y2=y*y;
        return (float)Math.sqrt(x2+y2);

    }

    public static void main(String[] args) {
        String path="WNEENESENNN";
        System.out.println(getShortestPath(path));
    }

    //always == is not working
    public static void main(String[] args) {
        String s1="Tony";
        String s2="Tony";
        String s3= new String("Tony");

        if(s1==s2){
            System.out.println("Strings are equal");
        }else{
            System.out.println("Strins are not equal");
        }
        if(s1.equals(s3)){
            System.out.println("Strings are equal");
        }
    }else{
        System.out.println("Strins are not equal");
    }
    public static String substring(String str,int si,int ei) {
        String substr="";
        for(int i=si;i<ei;i++){
            substr+=str.charAt(i);
        }
        return substr;

    }

    public static void main(String[] args) {
        String str="HelloWorld" ;
        System.out.println(str.substring(0,5));
       // System.out.println(substring(str,0,5));

    }

    // largest string

  // String Builder

    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("");
        for(char ch='a';ch<='z';ch++){
            sb.append(ch);
        }
        System.out.println(sb); //TimeComplexity=O(n^2)=O(26)
    }

    public static String toUpperCase(String str) {
        StringBuilder sb = new StringBuilder(" ");

        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==' ' && i<str.length()-1){
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));

            }else{
                sb.append(str.charAt(i));
            }
        }
return sb.toString();

    }
    public static void main(String[] args) {
        String str="hello world" ;
        System.out.println(toUpperCase(str)); //TimeComplexuty=O(n)
    }*/
    public static String Compress(String str) {
        String newstr=" ";
        for(int i=0;i<str.length();i++){
            Integer count=1;
            while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){
                count++;
                i++;
            }
            newstr+=str.charAt(i);
            if(count>1){
                newstr+=count.toString();
            }
        }
        return newstr;

    }

    public static void main(String[] args) {
        String Str="aaaabbcccdd";
        System.out.println(Compress(Str));
    }
}

