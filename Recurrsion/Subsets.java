import java.util.*;
class Subsets{
    public static void Sub(String p, String s){
        if(s.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = s.charAt(0);
        Sub (p+ch , s.substring(1));
        Sub (p , s.substring(1));
    }
    public static void main (String[] args){
        Sub("","abc");
    }
}