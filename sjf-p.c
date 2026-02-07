//sjf premtive

#define INT_MAX 999999999
#include<stdio.h>
int main(){
    int n;
    printf("Enter the no of processes\n");
    scanf("%d",&n);

    printf("Enter the arrival and burst time of processes\n");
    int arrival[n],burst[n];
    for(int i =0;i<n;i++){
        scanf("%d%d",&arrival[i],&burst[i]);
    }
    int copy[n],tat[n],wait[n];
    for(int i =0;i<n;i++){
        copy[i]=burst[i];
    }
    int cnt =0,time =0;
    
    while(cnt<n){ 

    int shortarrival =INT_MAX;
        int shortt = INT_MAX;    
        int index = -1;
        for(int i =0;i<n;i++){
            if(arrival[i]<=time){
                if(burst[i]<shortt&&burst[i]){
                    shortt = burst[i];
                    index = i;
                }
            }
            if(arrival[i]<shortarrival&&burst[i]){ shortarrival = arrival[i];}
        }
        if(index!=-1){            
            time++;
            burst[index]--;
            if(burst[index]==0){ cnt++;
                tat[index]  = time-arrival[index];
                wait[index]= tat[index]-copy[index];
            }
        } 
        else time = shortarrival;
    }
    printf("Arrival\tBurst\tWaiting\ttat\n");
    for(int i =0;i<n;i++){
        printf("%d\t%d\t%d\t%d\t\n",arrival[i],copy[i],wait[i],tat[i]);
    }
    float sumw=0;
    for(int i =0;i<n;i++){
        sumw+=wait[i];
    }

    float sumt=0;
    for(int i =0;i<n;i++){
        sumt+=tat[i];
    }

    printf("avg time tat %f\n",sumt/n);
    
    printf("avg time wait %f\n",sumw/n);
    
}