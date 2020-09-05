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
node* swap(node* head){

     node* lead = head;
     node* first = head;
     node* second = head;

     node* prev = head;
     if(head->next)
          head=head->next;

    while(lead){
        if(lead->next==nullptr)
          break;
        second=first->next;      
        lead = second->next;
      
        first->next = lead;
        second->next = first;
        
        if(lead){
          prev->next=second;
          prev=first;
          second=lead;
          first=lead;
        }
    }
  return head;    
  
}
void pairWiseSwap(node* head) 
{ 
    node* temp = head; 
  
    /* Traverse further only if  
    there are at-least two nodes left */
    while (temp != NULL && temp->next != NULL) { 
        /* Swap data of node with  
           its next node's data */
        swap(temp->data, 
             temp->next->data); 
  
        /* Move temp by 2 for the next pair */
        temp = temp->next->next; 
    } 
} 


int main()
{
  //Type your code here
  node* head = make();
  if(!head){
    cout<<"List is empty\n";
    return 0;
  }
  //print(head);
 // head  = swap(head);
pairWiseSwap(head);
  print(head);
}