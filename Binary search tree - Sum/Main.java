#include<iostream>
using namespace std;
class Node{
public:
  int data;
  Node* left;
  Node* right;
  
  Node(int node_data){
	this->data = node_data;
    this->left = nullptr;
    this->right = nullptr;
  }
};
int sum(Node* node){
	if(node){
    	return node->data + sum(node->left) +sum(node->right);
    }else{
    	return 0;
    }
}
void insert(Node*& node,int num){
  Node* newnode = new Node(num);
	if(node){
    	if(num<node->data)
          insert(node->left,num);
      	else 
          insert(node->right,num);
    }else{
    	node = newnode;
    }
}
int main()
{
  //type your code
  Node* root = nullptr;
  int num;
  while(1){
  	cin>>num;
    if(num<0)
      break;
    insert(root,num);
  
  }
  
  cout<<"Sum of all nodes are "<<sum(root);
  return 0;
  
}