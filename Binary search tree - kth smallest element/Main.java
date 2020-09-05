#include<iostream>
using namespace std;
class node{
  public:
	int data;
  	node* left;
  	node* right;
  	node(int node_data){
    	this->data = node_data;
      	this->left = nullptr;
      	this->right = nullptr;
    }
};
class min_node{
public:
	int data;
  	int count;
	min_node(){
    	this->data = 0;
      	this->count = 0;
    }  
};
void insert(node*& head , int num){
  node* newnode = new node(num);
	if(head){
      	if(num<head->data)
          insert(head->left,num);
      	else if(num>head->data)
          insert(head->right,num);
    }else{
    	head = newnode;
    }
}
void kth_value(node* head,int k,min_node* result_node ){
  if(head){
  	kth_value(head->left,k,result_node);
    if(result_node->count==k-1){
    	result_node->data = head->data;
      	result_node->count = k;
      	return; 
    }else{
          result_node->count++;
   	    } 
  	kth_value(head->right,k,result_node);


    
  }
}

int main()
{
  //type your code
  node* head = nullptr;
  int num;
  while(1){
  	cin>>num;
    if(num<0)
      break;
    insert(head,num);
  }
  int k;
  cout<<"Enter the kth value:\n";
  cin>>k;
  min_node* result_node = new min_node();
  kth_value(head,k,result_node);
  cout<<"Smallest kth value "<<result_node->data;
  
  return 0;
}