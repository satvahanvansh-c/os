#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>
#include <sys/types.h>
#include <sys/wait.h>
void sort_array(int arr[], int n) {
int i, j, temp;
for (i = 0; i < n - 1; i++) {
for (j = 0; j < n - i - 1; j++) {
if (arr[j] > arr[j + 1]) {
temp = arr[j];
arr[j] = arr[j + 1];
arr[j + 1] = temp;
}
}
}
}
int main() {
int arr[] = {5, 2, 8, 3, 1, 6, 4};
int n = sizeof(arr) / sizeof(arr[0]);
pid_t pid = fork();
if (pid < 0) {
perror("fork");
exit(1);
}
if (pid == 0) { // Child process
execl("./child", "child", (char *)NULL);
perror("execl");
exit(1);
} else { // Parent process
sort_array(arr, n);
char str[10];
char *argv[] = {"child"};
for (int i = 0; i < n; i++) {
sprintf(str, "%d", arr[i]);
argv[i + 1] = str;
}
argv[n + 1] = NULL;
wait(NULL);
printf("Parent process: Sorted array is ");
for (int i = 0; i < n; i++) {
printf("%d ", arr[i]);
}
printf("\n");
}
return 0;
}
**child.c**
#include <stdio.h>
#include <stdlib.h>
int binary_search(int arr[], int n, int target) {
int low = 0, high = n - 1;
while (low <= high) {
int mid = (low + high) / 2;
if (arr[mid] == target) {
return mid;
} else if (arr[mid] < target) {
low = mid + 1;
} else {
high = mid - 1;
}
}
return -1;
}
int main(int argc, char *argv[]) {
int n = argc - 1;
int arr[n];
for (int i = 0; i < n; i++) {
arr[i] = atoi(argv[i + 1]);
}
int target;
printf("Enter the target element: ");
scanf("%d", &target);
int result = binary_search(arr, n, target);
if (result != -1) {
printf("Element found at index %d\n", result);
} else {
printf("Element not found\n");
}
return 0;
}
