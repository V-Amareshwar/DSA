import java.util.*;
class Permutations{
    public static void Permutation(String p , String s){
        if(s.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = s.charAt(0);
        for(int i=0;i<=p.length();i++){
            String first = p.substring(0,i);
            String sec = p.substring(i);
            Permutation(first + ch + sec , s.substring(1));
        }
    }
    public static void main(String[] args){
        Permutation("","abc");
    }
}