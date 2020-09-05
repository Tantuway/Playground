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
node* make(int num){
  int n;
    if(num==0)
      return nullptr;
    cin>>n;
    node* head= new node(n);
    node* temp = head;
    for(int i=1;i<num;i++){
      cin>>n;
        temp->next = new node(n);
        temp=temp->next;
    }
    return head;
}
void print(node* head){
  while(head){
      cout<<head->data<<" ";
        head=head->next;
    }

}
void swap(int p,int q,node* head){
    node* p_prev;
    node* q_prev;
  while(head->next!=nullptr){
      if(head->next->data==p)
          p_prev = head;
        if(head->next->data==q)
          q_prev = head;
        head=head->next;
    }
    //cout<<p_prev->data<<" "<<q_prev->data<<endl;
    node* p_ptr = p_prev->next;
    node* q_ptr = q_prev->next;
    node* temp=q_ptr->next;
  
    p_prev->next=q_ptr;
    q_ptr->next=p_ptr->next;
    q_prev->next = p_ptr;
    p_ptr->next = temp;
    
//    return nullptr;

}
void swapNodes(node **head_ref, int x, int y)  
{  
// Nothing to do if x and y are same  
if (x == y) return;  
  
// Search for x (keep track of prevX and CurrX  
node *prevX = NULL, *currX = *head_ref;  
while (currX && currX->data != x)  
{  
    prevX = currX;  
    currX = currX->next;  
}  
  
// Search for y (keep track of prevY and CurrY  
node *prevY = NULL, *currY = *head_ref;  
while (currY && currY->data != y)  
{  
    prevY = currY;  
    currY = currY->next;  
}  
  
// If either x or y is not present, nothing to do  
if (currX == NULL || currY == NULL)  
    return;  
  
// If x is not head of linked list  
if (prevX != NULL)  
    prevX->next = currY;  
else // Else make y as new head  
    *head_ref = currY;  
  
// If y is not head of linked list  
if (prevY != NULL)  
    prevY->next = currX;  
else // Else make x as new head  
    *head_ref = currX;  
  
// Swap next pointers  
node *temp = currY->next;  
currY->next = currX->next;  
currX->next = temp;  
}  

int main()
{
  //Type your code here
  int n;
  cin>>n;
  node* head = make(n);
  //print(head);
  int p,q;
  cin>>p>>q;
  //clock_t start, end;
  //start = clock(); 
//  swap(p,q,head);
  swapNodes(&head, p, q); 
  //end = clock(); 
  //double time_taken = double(end - start) / double(CLOCKS_PER_SEC); 
  //cout<<"Time: "<<time_taken<<endl;
  print(head);
  
  
  return 0;
  
}




