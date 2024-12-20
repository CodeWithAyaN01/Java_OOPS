#include <stdio.h>
#include <stdlib.h>
#include <pthread.h>
#include<windows.h>
#include <stdbool.h>
#include <unistd.h>
#define max 15
int q[max];
int rear=-1,front=0;

typedef struct{
	int counterno;
	int customerno;
	int wt;
	struct counter*next;
}counter;

counter *head=NULL;

pthread_mutex_t qm = PTHREAD_MUTEX_INITIALIZER;

counter *create(){
	counter new1=(counter)malloc(sizeof(counter));
	printf("Enter the counter number and counter's waiting time:");
	scanf("%d%d",&new1->counterno,&new1->wt);
	new1->next=NULL;
	return new1;
}

bool isfull(){
	return rear==max-1;
}
bool isempty(){
	return rear<front;
}
void enqueue(int data){
	if(isfull()) return;
	rear=rear+1;
	q[rear]=data;
}
int dequeue(){
	if(isempty()) return -1;
	int data=q[front];
	front=front+1;
	return data;
}
void createqueue(){
	int i;
	for(i=1;i<=max;i++)
		enqueue(i);
}


void createlist(int n) {
    counter *newCounter, *temp;
    int i;
    for (i = 1; i <= n; i++) {
        newCounter = create(); 
        if (head == NULL) {
            head = newCounter; 
            newCounter->next = head;
        } else {
            temp = head;
            while (temp->next != head) {
                temp = temp->next;
            }
            temp->next = newCounter; 
            newCounter->next = head; // circular 
        }
    }
}

//void assigncounter(){
//	counter *temp=head;
//	while(!isempty()){
//		temp->customerno=dequeue();
//		printf("\ncounter no %d has been allocated to customer no %d",temp->counterno,temp->customerno);
//		temp=temp->next;
//	}
//}

void *counter_function(void *arg){
	counter *ctr=(counter *)arg;
	while(1){
		pthread_mutex_lock(&qm);
		if(isempty()){
			pthread_mutex_unlock(&qm);
			break;
		}
		ctr->customerno=dequeue();
		pthread_mutex_unlock(&qm);
		printf("\nCounter %d is serving customer %d for %d seconds.",ctr->counterno,ctr->customerno,ctr->wt);
		sleep(ctr->wt);
		printf("\nCounter %d finished serving customer %d.",ctr->counterno,ctr->customerno);
	}
	return NULL;
}
//
//void visual(){
//	printf("-------------------------------------------------------------------------------------------------------------------------------------------------\n");
//	printf("|\t\tCounter 1\t\t\t|\t\t\tCounter 2\t\t\t|\t\t\tCounter 3\t\t|\n");
//	printf("-------------------------------------------------------------------------------------------------------------------------------------------------\n");
//}

int main(){
	int i,n;
	printf("Enter the number of counters:");
	scanf("%d",&n);
	createlist(n);
	createqueue();
	visual();
	pthread_t t[n];
	counter *temp=head;
	for(i=0;i<n;i++){
		pthread_create(&t[i],NULL,counter_function,(void *)temp);
		temp=temp->next;
	}
	for(i=0;i<n;i++){
		pthread_join(t[i],NULL);
	}
	printf("\nAll customers have been served.");
	//assigncounter();
	return 0;
}