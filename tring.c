#include<stdio.h>
#include<stdlib.h>

// Define a structure for Employee
struct Employee {
    char EmpName[20];
    int CurrAmount;
    int IncrementInPercentage;
};

// Function to increase salary
int increaseSalary(struct Employee emp) {
    int inc = emp.CurrAmount + ((emp.CurrAmount * emp.IncrementInPercentage) / 100);
    return inc;
}

int main() {
    struct Employee emp;  // Create a variable of the Employee structure

    printf("Welcome to My Company Salary Increment System:\n");

    // Get employee details
    printf("Enter the name of Employee: ");
    gets(emp.EmpName);
    printf("Enter the current amount: ");
    scanf("%d", &emp.CurrAmount);
    printf("Enter the percentage increment: ");
    scanf("%d", &emp.IncrementInPercentage);

    // Calculate new salary
    int newAmount = increaseSalary(emp);

    // Display the result
    printf("The new amount for %s with a percentage increment of %d%% is: %d\n", 
           emp.EmpName, emp.IncrementInPercentage,
