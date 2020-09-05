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
  node* temp = head;
  while(1){
  	cin>>n;
    if(n<0)
      return head;
    
    else{
    	node* newnode = new node(n);
      	temp->next=newnode;
      	temp=newnode;
    
    }
  }

}
void print(node* head){
	while(head){
    	cout<<head->data<<endl;
      	head=head->next;
    }
}
node* check(node* head , int num){
  node* prev = head;
  head=head->next;
  while(head){
  	if(head->data==num)
      return prev;
    prev=prev->next;
    head=head->next;
  }
  return nullptr;

}
void delete_node(node* prev){
  
  node* to_be = prev->next;
  
  if(to_be->next==nullptr)
    prev->next=nullptr;
  else
    prev->next=to_be->next->next;
  
  free(to_be);

}


node* filter_duplicates(node* head){
	node* temp = head;
  	node* del;
  	while(temp){
    	del = check(temp,temp->data);//if duplicated it'll return pointer to previous element
        if(del){
          delete_node(del);
        }
      	temp=temp->next;
      	
    }
  return head;
}

int main()
{
  //Type your code here
  node* head = make();
  cout<<"Linked list before removal of duplicates"<<endl;
  print(head);
  cout<<"Linked list after removal of duplicates"<<endl;
  head = filter_duplicates(head);
  print(head);
}