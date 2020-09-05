#include<iostream>
using namespace std;
class node{
	public:
  		int data;
  		node* next;
  	node(int node_data){
    	this->data = node_data;
      	this->next = nullptr;
    }
};

node* make(int n){
  	if(!n)
      return nullptr;
  	int num;
  	cin>>num;
  	node* head = new node(num);
  	node* temp = head;
	for(int i=1;i<n;i++){
      cin>>num;
      node* newnode = new node(num);
      temp->next=newnode;
      temp=newnode;
    
    }
  return head;
}
void print (node* head){
	while(head){
    	cout<<head->data<<"->";
     	head=head->next;
    }
  	cout<<"NULL"<<endl;
}

node* merge(node* head1,node* head2){
	node* head = nullptr;
  	if(!head1){
      head=head2;
      return head;
    }
  	else if(!head2){
      head=head1;
      return head;
    }
  	if(head1->data<=head2->data){
    	head=head1;
      	head1=head1->next;
    }else{
    	head=head2;
      	head2=head2->next;
    }
  	node* temp=head;
  	while(head2&&head1){
    	if(head1->data<=head2->data){
        	temp->next=head1;
          	temp=temp->next;
          	head1=head1->next;
        }else{
        	temp->next=head2;
          	temp=temp->next;
          	head2=head2->next;
        }
    }
  	
  	if(head1){
    	temp->next=head1;
    }else if(head2){
    	temp->next=head2;
    }
  return head;
}

int main()
{
  //Type your code here
  node* head1 = nullptr;
  node* head2 = nullptr;
  int n;
  cin>>n;
  head1= make(n);
  cin>>n;
  head2= make(n);
  node* head = merge(head1,head2);
  print(head);
}