public class LC_TwoSUm {
    public static int[] twoSum(int[] arr, int target) {
        int n=arr.length;
        int []keys=new int[2];
        int p1=0;
        int p2=n-1;         
         while(p1<=p2){
            if(arr[p1]+arr[p2]==target){
                keys[0]=p1;
                keys[1]=p2;
                return keys;
            }
            else if(arr[p1]+arr[p2]>target){
                p2--;
            }else{
                p1++;
            }
         }
         return keys;
    }
    public static void main(String[] args) {
        
    }
}