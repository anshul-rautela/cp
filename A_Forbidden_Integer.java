import java.util.Scanner;

public class A_Forbidden_Integer {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while (t--!=0) {
            scn.nextLine();
            int n = scn.nextInt();
            int k = scn.nextInt();
            int x = scn.nextInt();
        
            if(x!=1){
                System.out.println("YES");
                System.out.println(n);
                for(int i =0;i<n;i++){
                    System.out.print(1+" ");
                }System.out.println();
            }
            else{
                if(k==1) System.out.println("NO");
                else if(k==2){
                    if(n%2==0){
                        System.out.println("YES");
                        System.out.println(n/2);
                        for(int i =0;i<n/2;i++){
                            System.out.print(2+" ");
                        }
                        System.out.println();
                    } else System.out.println("NO");
                }
                else{
                        System.out.println("YES");
                        if(n%2!=0){
                            System.out.println(n/2);
                        for(int i =0;i<n/2-1;i++){
                            System.out.print(2+" ");
                        }
                        System.out.print(3);
                        }
                        else {
                            System.out.println(n/2);
                            for(int i =0;i<n/2;i++){
                                System.out.print(2+" ");
                            }
                        }
                        System.out.println();
                }

            }
        
        
        
        }
    }
}