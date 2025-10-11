#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <unistd.h>
#include <sys/types.h>
#include <sys/wait.h>
#define MAX_CMD_LEN 1024
#define MAX_ARGS 100
void execute_command(char **args) {
pid_t pid = fork();
if (pid < 0) {
perror("Fork failed");
exit(EXIT_FAILURE);
} else if (pid == 0) {
if (execvp(args[0], args) < 0) {
perror("Execution failed");
exit(EXIT_FAILURE);
}
} else {
// Parent process
wait(NULL);
}
}
void tokenize_input(char *input, char **args) {
int index = 0;
char *token = strtok(input, " \n");
while (token != NULL) {
args[index++] = token;
token = strtok(NULL, " \n");
}
args[index] = NULL; // Null-terminate the array of arguments
}
int main() {
char input[MAX_CMD_LEN];
char *args[MAX_ARGS];
while (1) {
printf("myshell$ "); // Display the prompt
if (fgets(input, sizeof(input), stdin) == NULL) {
perror("fgets failed");
continue;
}
if (strlen(input) == 1) continue;
tokenize_input(input, args);
if (strcmp(args[0], "exit") == 0) {
exit(0);
}
else if (strcmp(args[0], "cd") == 0) {
if (args[1] == NULL) {
fprintf(stderr, "cd: missing argument\n");
} else {
if (chdir(args[1]) != 0) {
perror("cd failed");
}
}
} else {
execute_command(args);
}
}
return 0;
}
