public class Palindrome{
    public static void main(String args[]){
        for (String s: args) {
            System.out.println(isPalindrome(s));
        }
        return;
    }
    public static String reverseString(String s){
        String res="";
        for(char ch:s.toCharArray()){
            res=ch+res;
        }
        return res;
    }
    public static boolean isPalindrome(String s){
        return s.equals(reverseString(s));
    }

}