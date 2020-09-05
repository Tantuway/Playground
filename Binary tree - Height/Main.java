#include<iostream>
using namespace std;
class Node {
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
int max(int a, int b){
	return (a>b)?a:b;
}
int height(Node* node){
	if(node){
      return 1+max(height(node->right),height(node->left));
    }else{
    	return 0;
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
  
  
  cout<<"Height of the tree is "<<height(root);
  
  return 0;
}