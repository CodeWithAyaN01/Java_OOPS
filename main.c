#include<stdio.h>
#include<stdlib.h>
int main()
{
    int count = 0;
    int arr[] = {0,0,0,1,5,7,0,0};
    int len = 8;
    // int assig = 7;
    // [1,3,2,5,4,0,0]
    for (int i = 0 ; i<len ;i++)
    {
        if (arr[i] == 0)
        {
            count++;
        }
    }
    for (int i = 0 ; i< len ; i++ )
    {
        int j;
        if (arr[i] == 0)
        {
            arr[i] = arr[i+1];
            for (int k = i ; k< len-count+1 ; k++)
                arr[k] = arr[k+1];
        }
    }
    for (int h = 0 ; h <count; h++)
    {
        arr[len-count+h] = 0;
    }
    // arr[len-count] = 0;
    // arr[len-count+1] = 0;
    for (int i = 0 ; i< len ; i++ )
    {
        printf("%d\t",arr[i]);
    }

}