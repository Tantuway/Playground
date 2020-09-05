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



node* makell(){
	int x;
  	node* head = nullptr;
  	node* temp = nullptr;
	cin>>x;
	if(x<0){
      return head;
    }else{
    	head = new node(x);
      temp=head;
    	while(1){
      	cin>>x;
        	if(x<0)
            return head;
        	else{
          	node* newnode = new node(x);
            	temp->next = newnode;
            	temp=newnode;
          }
      }          
    }
	
}

void printll(node* head){
	while(head){
		cout<<head->data<<" ";
      	head=head->next;
	}
  
}
int main()
{
  //Type your code herenode* temp = nullptr;
	
  	node* head  = makell();
   // printll(head);
    
  	node* temp  = head;
  	if((!temp)||(temp->next==nullptr)){
      cout<<"Deletion of second last element is not possible"<<endl;
      return 0 ;
    }
  	if(temp->next->next==nullptr){
    	head = temp->next;
      printll(head);
      return 0;
 //     	free(temp);
    }
  	while(temp->next->next->next!=nullptr){
      	//cout<<temp->data<<" * ";
    	temp=temp->next;
    }
  	node* del = temp->next;
  	temp->next=del->next;
  	free(del);
	
  	printll(head);
  	
  	

}