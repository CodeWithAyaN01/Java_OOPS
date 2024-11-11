#include <stdio.h>
#include <time.h>

int main() {
    // Record the start time
    clock_t start = clock();

    // Loop to print numbers
    for (int i = 0; i < 100000; i++) {
        printf("%d\n", i);
    }

    // Record the end time
    clock_t end = clock();

    // Calculate time taken in seconds
    double time_taken = ((double)(end - start)) / CLOCKS_PER_SEC;

    // Print the result
    printf("Time taken: %.2f seconds\n", time_taken);

    return 0;
}
