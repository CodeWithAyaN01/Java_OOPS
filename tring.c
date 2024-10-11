#include<stdio.h>
#include<stdlib.h>
int increseSalary(int CurrAmount , int Percentage)
{
    int inc = CurrAmount + (((CurrAmount*Percentage))/100);
    
    return inc;
}
int main()
{
    printf("Welcome to My company sal increment System:\n ");
    char EmpName[20];
    int IncrementInPercentage,amount;
    printf("Enter details of the employee: \n");
    printf("Enter the name of Employee: ");gets(EmpName);
    printf("Enter the current amount\n");scanf("%d",&amount);
    printf("Enter the percentage : ");scanf("%d",&IncrementInPercentage);

    int a = increseSalary(amount,IncrementInPercentage);

    printf("The new amount of %s with a percent of %d is:  %d",EmpName,IncrementInPercentage,a);

}