import java.util.*;
class validpalindrome{
    public static boolean Palindrome(String s){
        if(s.length()<=1){
            return true;
        }
        if(s.charAt(0)!=s.charAt(s.length()-1)){
            return false;
        }
        return Palindrome(s.substring(1,s.length()-1));
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(Palindrome(s));
    }
    

}