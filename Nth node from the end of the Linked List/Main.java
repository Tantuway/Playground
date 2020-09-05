#include<bits/stdc++.h>
using namespace std;
class node{
  public:
	int data;
  	node* next;
  	node(int node_data) {
            this->data = node_data;
            this->next = nullptr;
    }
};

void printll(node* head){
  while(head){
    cout<< head->data  <<" ";
    head=head->next;
  }
  cout<<endl;
}
void print_n(node* head,int n){
  
  for(int i=0;i<n;i++){
    head=head->next;
    if(!head){
      cout<<"There is no nth node in the list"<<endl;
      return; 
    }
  }
  cout<<head->data<<" is the nth node element in the list"<<endl;
}

node* makell(){
  int n;
  cin>>n;
  node* head = new node(n);
  if(n<0)
    return head;
  node* temp = head;
  while(1){
  	cin>>n;
    node* newnode = new node(n);
    temp->next=newnode;
    temp=temp->next;
    if(n<0)
      break;
  }
  return head;  
}

node* reverse(node* head){
  node* prev = head;
  
  node* curr = head->next;
 
  node* nxt = curr;
  
  if(curr){
    nxt = curr->next;
  }
 
  while(curr){
    curr->next=prev;
    prev=curr;
    curr=nxt;
    if(!curr)
      break;
    nxt=nxt->next;

  }
  head->next=nullptr;
  return prev;
}
int main()
{
  //Type your code here
  node* head;
  head = makell();
  //printll (head);
  head = reverse(head);  
 // printll (head);
  cout<<"Enter the nth node:\n";
  int n;
  cin>>n;
  print_n(head,n);
  
}