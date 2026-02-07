// premtive
#include<stdio.h>
#include<limits.h>
int main(){
    int n;
    scanf("%d",&n);

    int arrival[n],burst[n],wait[n],priority[n],tat[n];
    int cnt =0,time =0;

    printf("Enter arrival, burst and priority of the process\n");

    for(int i =0;i<n;i++){
        scanf("%d%d%d",&arrival[i],&burst[i],&priority[i]);
    }
    int copy[n];
    for(int i =0;i<n;i++){
        copy[i]= burst[i];
    }
    
    while(cnt<n){
        int minpriority = INT_MAX;
        int index = -1;
        int minarrival = INT_MAX;
        for(int i =0;i<n;i++){
            if(arrival[i]<=time){
                if(priority[i]<minpriority&&burst[i]){
                    minpriority = priority[i];
                    index = i;
                }
            }
            if(arrival[i]<minarrival&&burst[i]) minarrival=arrival[i];
        }
        if(index==-1) time = minarrival;
        else{
            int i = index;
            time ++;
             burst[index]--;
             if(burst[i]==0){
                cnt++;
                tat[i] = time - arrival[i];
                wait[i]= tat[i]-copy[i];
             }
        }
    }
    printf("\n");
    printf("Process\tArrival\tBurst\tWaiting\ttat\tpriority\n");
    for(int i =0;i<n;i++){
        printf("P%d\t%d\t%d\t%d\t%d\t%d\t\n",i,arrival[i],copy[i],wait[i],tat[i],priority[i]);
    }



}