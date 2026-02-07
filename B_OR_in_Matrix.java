    import java.util.Scanner;     
    public class B_OR_in_Matrix {
     
        public static void main(String[] args) {
            Scanner scn = new Scanner(System.in);
            int n = scn.nextInt();
            int m = scn.nextInt();
            scn.nextLine();
            int arr[][]= new int[n][m];
            boolean one=false;
            for(int i =0;i<n;i++){
                for(int j =0;j<m;j++){
                    arr[i][j]= scn.nextInt();
                    if(arr[i][j]==1)one = true;
                }
                scn.nextLine();
            }
            if(!one){
                System.out.println("YES");
                for(int i =0;i<n;i++){
                for(int j =0;j<m;j++){
                    
            System.out.print(arr[i][j]+" ");
                }
                System.out.println();
            }
            }
            else{
            int row[]  = new int[n];
            int col[]  = new int[m];
     
            for(int i =0;i<n;i++){
                int cnt =0;
                for(int j =0;j<m;j++){
                    if(arr[i][j]==1) cnt++;
                    else break;
                }
                if(cnt==m)row[i]=1;
            }
            for(int i =0;i<m;i++){
                int cnt =0;
                for(int j =0;j<n;j++){
                    if(arr[j][i]==1) cnt++;
                    else break;
                }
                if(cnt==n)col[i]=1;
            }
            boolean ans = true;
            if(one){int cnt =0;
                for(int i =0;i<n;i++){
                    if(row[i]!=1){
                        cnt++;
                    }
                }
                if(cnt==n){ans = false ;System.out.println("NO");
            }else{
                    cnt =0;
                    for(int i =0;i<m;i++){
                    if(col[i]!=1){
                        cnt++;
                    }
                }
                if(cnt==m){ System.out.println("NO");
                    ans = false;
                }    
            }
            }
            if(ans){
            for(int i =0;i<n;i++){
                for(int j =0;j<m;j++){
                    if(arr[i][j]==1){
                        int cnt =0;
                        for(int ii =0;ii<n;ii++){
                            if(arr[ii][j]!=1){ cnt++;break;}
                        }
                        for(int jj =0;jj<m;jj++){
                            if(arr[i][jj]!=1){ cnt++;break;}
                        }
                        if(cnt==2){ ans = false; System.out.println("NO"); break;}
                    }
                }
                if(!ans) break;
                }
            }
     
            if(ans){
                System.out.println("YES");
            for(int i =0;i<n;i++){
                for(int j =0;j<m;j++){
                    if(row[i]==1&&col[j]==1){
                        System.out.print(1+" ");
                    }
                    else System.out.print(0+" ");
                }
                System.out.println();
            }}              
        }
        }
    }       