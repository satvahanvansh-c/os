#include <stdio.h>
#include <stdlib.h>
#include <time.h>
#define MAX_PROCESSES 10
typedef struct {
int arrival_time;
int burst_time;
int priority;
int waiting_time;
int turnaround_time;
} Process;
void generate_next_burst(Process *p) {
p->burst_time = rand() % 10 + 1;
}
void preemptive_priority_scheduling(Process p[], int n) {
int current_time = 0;
int i, j;
Process temp;
for (i = 0; i < n; i++) {
for (j = i + 1; j < n; j++) {
if (p[i].arrival_time > p[j].arrival_time || (p[i].arrival_time == p[j].arrival_time && p[i].priority < p[j].priority)) {
temp = p[i];
p[i] = p[j];
p[j] = temp;
}
}
}
printf("Gantt Chart:\n");
for (i = 0; i < n; i++) {
printf("P%d | ", i);
while (p[i].burst_time > 0) {
current_time++;
p[i].burst_time--;
printf("%d ", current_time);
if (p[i].burst_time == 0) {
p[i].turnaround_time = current_time - p[i].arrival_time;
p[i].waiting_time = p[i].turnaround_time - p[i].burst_time;
printf("| ");
}
for (j = i + 1; j < n; j++) {
if (p[j].arrival_time <= current_time && p[j].priority > p[i].priority) {
temp = p[i];
p[i] = p[j];
p[j] = temp;
i--;
break;
}
}
}
printf("\n");
}
printf("Process\tTurnaround Time\tWaiting Time\n");
for (i = 0; i < n; i++) {
printf("P%d\t%d\t\t%d\n", i, p[i].turnaround_time, p[i].waiting_time);
}
int total_turnaround_time = 0, total_waiting_time = 0;
for (i = 0; i < n; i++) {
total_turnaround_time += p[i].turnaround_time;
total_waiting_time += p[i].waiting_time;
}
printf("Average Turnaround Time: %.2f\n", (float)total_turnaround_time / n);
printf("Average Waiting Time: %.2f\n", (float)total_waiting_time / n);
}
int main() {
int n;
printf("Enter the number of processes: ");
scanf("%d", &n);
Process p[n];
for (int i = 0; i < n; i++) {
printf("Enter arrival time, burst time, and priority for process P%d: ", i);
scanf("%d %d %d", &p[i].arrival_time, &p[i].burst_time, &p[i].priority);
}
srand(time(NULL));
preemptive_priority_scheduling(p, n);
return 0;
}
