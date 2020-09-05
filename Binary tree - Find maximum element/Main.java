#include<iostream>
using namespace std;
class Bnode{
public:
  int data;
  Bnode* left;
  Bnode* right;
  Bnode(int node_data){
  	this->data = node_data;
    this->left=nullptr;
    this->right=nullptr;
  }
};
void insert(Bnode*& node, int num){
  Bnode* newnode = new Bnode(num);
  if(node){
  	if(num<node->data)
      insert(node->left,num);
    else if(num>node->data)
      insert(node->right,num);
  }else{
  	node=newnode;
  }

}
int max_element(Bnode* node){
	while(node->right!=nullptr)
      node=node->right;
  	return node->data;
   
      
}
int main()
{
  //type your code
  Bnode* head  = nullptr;
  int num;
  while(1){
  	cin>>num;
    if(num<0)
      break;
    insert(head,num);
  }
  cout<<"Maximum element is "<<max_element(head);
  return 0;
}