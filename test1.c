//sjf- np

#include<stdio.h>
int main(){
        int n;
        printf("Enter no. of process");
        scanf("%d",&n);
        
        int arrival[n],burst[n],waiting[n],tat[n];

            printf("\nEnter arrival and burst time\n");
        for(int i =0;i<n;i++){
            scanf("%d%d",&arrival[i],&burst[i]);
        }

        int time = 0;
        int copy[n];
        for(int i =0;i<n;i++){
            copy[i]=burst[i];
        }
        int cnt =0;
        
        while(cnt<n){
            int index =-1;
            int shorty = 9999999;
            int shortyarrival = 9999999;
            for(int i =0;i<n;i++){
                if(arrival[i]<=time&&burst[i]){
                    if(shorty>burst[i]&&burst[i]){
                        index = i;
                        shorty = burst[i];
                    }
                }
                if(shortyarrival<arrival[i]&&burst[i]) shortyarrival = arrival[i];
            }
            if(index==-1) time= shortyarrival;
            else{
                cnt++;
                waiting[index] = time - arrival[index];
                time+=shorty;
                tat[index] = time - arrival[index];
                burst[index]=0;
            }
            // printf("while");
        }

        printf("Arrival\tBurst\tWaiting\tTurnaround \n");
        for(int i =0;i<n;i++){
            printf("%d\t %d\t %d\t %d\n",arrival[i],copy[i],waiting[i],tat[i]);
        }
        float sum =0;
        for(int i =0;i<n;i++){
            sum+=waiting[i];    
        }
        printf("%.2f  ",sum/n);
        
        sum =0;
        for(int i =0;i<n;i++){
            sum+=tat[i];    
        }
        printf("%.2f\n",sum/n);
}