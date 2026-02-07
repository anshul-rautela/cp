//fcfs 

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

        while(cnt < n){
            int isfound = 0;
            for(int i =0;i<n;i++){
                if(arrival[i]<=time&&burst[i]){
                    waiting[i]= time- arrival[i];
                    time+=burst[i];
                    burst[i]=0;
                    cnt++;
                    isfound = 1;
                    tat[i] = time-arrival[i];
                    break;
                }
            }
            if(!isfound){
                time++;
            }
        }
        printf("Arrival\tBurst\tWaiting\tTurnaround \n");
        for(int i =0;i<n;i++){
            printf("%d\t %d\t %d\t %d\n",arrival[i],copy[i],waiting[i],tat[i]);
        }
        float sum =0;
        for(int i =0;i<n;i++){
            sum+=waiting[i];    
        }
        printf("%f",sum/n);
        
        sum =0;
        for(int i =0;i<n;i++){
            sum+=tat[i];    
        }
        printf("%f",sum/n);



}