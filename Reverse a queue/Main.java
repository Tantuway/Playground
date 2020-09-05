#include<bits/stdc++.h>
using namespace std;
class node{
public:
	int data;
	node* next;
	node(int node_data){
		this->data=node_data;
		this->next=nullptr;
	}
};

void display(node* head){
	while(head){
		cout<<head->data<<" ";
		head=head->next;
	}
	//cout<<endl;

}
void reverse_queue(node** super_head,node** super_tail){
	node* head  = *super_head;
	node* tail  = *super_tail;

  	node* prev = nullptr;
	node* curr = head;
	node* nxt = head;
	if(curr)
		nxt=curr->next;
	while(curr){
		curr->next = prev;
		prev= curr;
		curr=nxt;
		if(curr)
			nxt = curr->next;
	}
	
	*super_tail = *super_head;
	*super_head = prev;

}
int main()
{
  //Type your code here
node* head  = nullptr;
node* tail = nullptr;
int x;
while(1){
	cin>>x;
	if(x<0)
		break;
	else if(!head){
		node* temp = new node(x);
		temp->next=tail;
		head = temp;
		tail = temp;

	}else{
		node* newnode = new node(x);
		node* temp = head;
		while(temp->next!=nullptr){
			temp=temp->next;
		}
		temp->next = newnode;
		
		tail = newnode;
	}
}
	if(head){
		cout<<"Before reversing:\n";
		display(head);
		reverse_queue(&head,&tail);
		cout<<"\nAfter reversing:\n";
		display(head);
	}else{
		cout<<"Queue is empty";
	}
  return 0;

}