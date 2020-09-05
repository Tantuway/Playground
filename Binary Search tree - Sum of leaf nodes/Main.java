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

void insert(node*& head,int num){
  node* temp = new node(num);
  	if(head){
      	if(num<head->data)
          insert(head->left,num);
      	else if(num>head->data)
          insert(head->right,num);
    }else{
    	head = temp;
    }
}

int leaf_sum(node* head){
	
  	if(head){
    	if(head->left==nullptr && head->right==nullptr){
          return head->data;
        }else{
        	return leaf_sum(head->left)+leaf_sum(head->right);
        }
    }else{
    	return 0;
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
  	
  cout<<"Sum of all leaf nodes are "<<leaf_sum(head);
  
  
  return 0;
}