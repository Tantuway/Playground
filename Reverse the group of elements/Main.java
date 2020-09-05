#include<bits/stdc++.h>
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
node* make(){
  int n;
    cin>>n;
    if(n<0){
      return nullptr;
    }
    node* head = new node(n);
    node* temp = head;
    while(1){
      cin>>n;
        if(n<0)
          break;
        temp->next = new node(n);
        temp=temp->next;
    
    }
    return head;
}
void print(node* head){
  while(head){
      cout<<head->data<<endl;
        head=head->next;
    }
}

node* reverse_ll(node* head,int n){
    node* prev=nullptr;
    node* curr=head;
    node* nxt=curr->next;

    int count=0;
    
  while(curr&&(count<n)){
    curr->next=prev;
    count++;
    prev=curr;
    curr=nxt;
    if(curr)
      nxt=nxt->next;
  }
  return prev;
}
node* reverse(node* head,int key){
  int n=key;
node* prev=NULL,*curr=head,*next;

while(key!=0){

  if(curr==NULL){
  return prev;
  }
  next=curr->next;
  curr->next=prev;
  prev=curr;
  curr=next;
  key--;
}

node* temp=NULL;
temp=head;
head->next=curr;

head=prev;

temp->next=reverse(curr,n);

return head;
}

int main()
{
  //Type your code here
  node* head = make();
  if(!head){
    cout<<"List is empty\n";
    return 0;
  }
  int n;
  cin>>n;
  //print(head);
 // head  = swap(head);
  head=reverse(head,n);
  print(head);
}