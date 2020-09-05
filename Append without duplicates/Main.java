#include<iostream>
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
node* make(){
  
	int n;
  	cin>>n;
  	if(n<0)
      return nullptr;
  	
  	node* head  = new node(n);
  	node* temp  = head;
  	while(1){
    	cin>>n;
      	if(n<0)
          return head;
      	if(n<=temp->data)
          continue;
      	node* newnode = new node(n);
      	temp->next=newnode;
      	temp=newnode;
    
    }
}

void printll(node* head){
  if(!head)
    cout<<"List is empty"<<endl;
  while(head){
  	cout<<head->data<<endl;
    head=head->next;
  }
}
int main()
{
  //Type your code here
  node* head  = make();
  printll(head);
}