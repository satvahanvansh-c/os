#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <unistd.h>
#include <sys/types.h>
#include <sys/wait.h>
#define MAX_LINE 1024
#define MAX_TOKENS 64
void tokenize(char *line, char *tokens[]) {
int i = 0;
char *token = strtok(line, " \t\n");
while (token != NULL && i < MAX_TOKENS) {
tokens[i++] = token;
token = strtok(NULL, " \t\n");
}
tokens[i] = NULL;
}
void execute_command(char *tokens[]) {
pid_t pid = fork();
if (pid < 0) {
perror("fork");
exit(1);
}
if (pid == 0) { // Child process
execvp(tokens[0], tokens);
perror("execvp");
exit(1);
} else { // Parent process
wait(NULL);
}
}
void search_command(char *filename, char *pattern) {
FILE *fp = fopen(filename, "r");
if (fp == NULL) {
perror("fopen");
return;
}
char line[MAX_LINE];
while (fgets(line, MAX_LINE, fp) != NULL) {
if (strstr(line, pattern) != NULL) {
printf("%s", line);
break;
}
}
fclose(fp);
}
int main() {
char line[MAX_LINE];
char *tokens[MAX_TOKENS];
while (1) {
printf("myshell$ ");
fflush(stdout);
fgets(line, MAX_LINE, stdin);
tokenize(line, tokens);
if (strcmp(tokens[0], "search") == 0) {
if (tokens[1] != NULL && tokens[2] != NULL) {
search_command(tokens[1], tokens[2]);
} else {
printf("Usage: search <filename> <pattern>\n");
}
} else {
execute_command(tokens);
}
}
return 0;
}
