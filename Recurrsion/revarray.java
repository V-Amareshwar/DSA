import java.util.*;
class revarray{
    public static int[] fin(int l, int r,int[] arr){
        if(l>=r){
            return arr;
        }
        int temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;
        l++;r--;
        return fin(l, r, arr);
    }
    public static int [] Revarray(int m, int[] arr){
        if(m<arr.length){
            return fin(m+1,arr.length-1,arr);
        }
        return arr;
        
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        int [] finarray = Revarray(m,arr);
        System.out.println(Arrays.toString(finarray));
    }
}