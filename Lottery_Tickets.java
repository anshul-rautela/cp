import java.util.*;
import java.lang.*;
import java.io.*;

public class Lottery_Tickets
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner scn = new Scanner(System.in);
		int T = scn.nextInt();
		while(T--!=0){
		    int n=scn.nextInt();
		    int arr[]=new int[n];
		    for(int i =0;i<n;i++){
		        arr[i]=scn.nextInt();
		    }
		    int chef = arr[0];
		    int sol=0;
		    Arrays.sort(arr);
		    for(int i =0;i<n;i++){
		        if(chef==arr[i]){
		            if(i==n-1){
		                sol=(int)(Math.pow(10,6)-chef+(chef-arr[n-2])/2);//+1;
		                sol++;
		                break;
		            }
		            else if(i==0){
		                sol=(int)chef+(arr[i+1]-chef)/2;
		                if((arr[i+1]-chef)%2==1) sol++;
		                break;
		                
		            }
		             else{
		                 sol=(int)1+(chef-arr[i-1])/2+(-chef+arr[i+1])/2;
		                break;
		                 
		             }
		        }
		    }
		    System.out.println(sol);
		}

	}
}
