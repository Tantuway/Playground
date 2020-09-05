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
void insert(Node*& node, int num){
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
bool search(Node* node,int x){
	if(node){
      if(node->data == x)
        return true;
      else if(x<node->data)
        return search(node->left,x);
      else
        return search(node->right,x);
      
    }else{
    	return false;
    }
}
int ancestor(Node* node,int M,int N){
  if(node){
  	if(M<node->data && N>=node->data){
    	if(search(node,M)&&search(node,N))
          return node->data;
      	else 
          return -1;
    }else if(M>node->data && N<=node->data){
      	if(search(node,M)&&search(node,N))
          return node->data;
      	else 
          return -1;
    }else if(M<node->data){
    	return ancestor(node->left,M,N);
    }else{
    	return ancestor(node->right,M,N);
    }
  }else{
  	return -1;
  }
}

int main()
{
  //Type your code here
  Node* root = nullptr;
  int num;
  cin>>num;
  int node_data;
  while(num){
    cin>>node_data;
  	insert(root,node_data);
  	num--;
  }
  int M,N;
  cin>>M;
  cin>>N;
  cout<<ancestor(root,M,N);
  return 0;
}