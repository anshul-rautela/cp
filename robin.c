#include <stdio.h>

int main() {
    int n, time_quantum, current_time = 0;
    
    printf("Round Robin CPU Scheduling\n");
    printf("==========================\n");
    
    printf("Enter number of processes: ");
    scanf("%d", &n);
    
    printf("Enter time quantum: ");
    scanf("%d", &time_quantum);
    
    int burst_time[n], remaining_time[n], arrival_time[n];
    int waiting_time[n], turnaround_time[n];
    int completed = 0;
    
    // Input process details
    for (int i = 0; i < n; i++) {
        printf("Enter arrival time for process P%d: ", i + 1);
        scanf("%d", &arrival_time[i]);
        printf("Enter burst time for process P%d: ", i + 1);
        scanf("%d", &burst_time[i]);
        remaining_time[i] = burst_time[i];
    }
    
    printf("\nGantt Chart:\n");
    printf("------------\n");
    
    int current_process = 0;  // Start with first process
    
    while (completed < n) {
        int found = 0;
        
        // Check processes in round-robin order
        for (int i = 0; i < n; i++) {
            // Calculate which process to check next
            int process_id = (current_process + i) % n;
            
            // Check if process has arrived and still has work to do
            if (arrival_time[process_id] <= current_time && 
                remaining_time[process_id] > 0) {
                
                found = 1;
                printf("Time %d-", current_time);
                
                // Execute for time_quantum or remaining time (whichever is smaller)
                if (remaining_time[process_id] >= time_quantum) {
                    // Process needs more time after this quantum
                    current_time += time_quantum;
                    remaining_time[process_id] -= time_quantum;
                } else {
                    // Process will complete in this quantum
                    current_time += remaining_time[process_id];
                    remaining_time[process_id] = 0;
                    completed++;
                    
                    // Calculate completion times
                    turnaround_time[process_id] = current_time - arrival_time[process_id];
                    waiting_time[process_id] = turnaround_time[process_id] - burst_time[process_id];
                }
                
                printf("%d: P%d", current_time, process_id + 1);
                if (remaining_time[process_id] == 0) {
                    printf(" (completed)");
                }
                printf("\n");
                
                // Move to next process for next iteration
                current_process = (process_id + 1) % n;
                break;
            }
        }
        
        // If no ready process found, CPU is idle
        if (!found) {
            printf("Time %d-%d: CPU IDLE\n", current_time, current_time + 1);
            current_time++;
        }
    }
    
    // Calculate and display results
    printf("\nProcess Summary:\n");
    printf("================\n");
    printf("Process\tArrival\tBurst\tWaiting\tTurnaround\n");
    printf("-------\t-------\t-----\t-------\t----------\n");
    
    float total_waiting = 0, total_turnaround = 0;
    
    for (int i = 0; i < n; i++) {
        printf("P%d\t%d\t%d\t%d\t%d\n", 
               i + 1, arrival_time[i], burst_time[i], 
               waiting_time[i], turnaround_time[i]);
        total_waiting += waiting_time[i];
        total_turnaround += turnaround_time[i];
    }
    
    printf("\nAverage Waiting Time: %.2f\n", total_waiting / n);
    printf("Average Turnaround Time: %.2f\n", total_turnaround / n);
    
    return 0;
}

/* 
HOW THE ROTATION WORKS:
======================

Example with 3 processes:
- current_process starts at 0
- Loop checks: (0+0)%3=0 (P1), (0+1)%3=1 (P2), (0+2)%3=2 (P3)
- After P1 executes: current_process = (0+1)%3 = 1
- Next loop checks: (1+0)%3=1 (P2), (1+1)%3=2 (P3), (1+2)%3=0 (P1)
- After P2 executes: current_process = (1+1)%3 = 2
- Next loop checks: (2+0)%3=2 (P3), (2+1)%3=0 (P1), (2+2)%3=1 (P2)

This creates round-robin order: P1 → P2 → P3 → P1 → P2 → P3...
*/