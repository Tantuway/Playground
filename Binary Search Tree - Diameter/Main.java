#include<bits/stdc++.h>
using namespace std;
class Bnode{
public:
  int data;
  int level;
  Bnode* left;
  Bnode* right;
  Bnode(int node_data){
  	this->data=node_data;
    this->left=nullptr;
    this->right=nullptr;
  }
};

void print(Bnode* node){
  if(node){
    print(node->left);
    cout<<node->data<<" "; 
    print(node->right);
 
  }

}
int max(int a,int b){
  return (a>b)?a:b;
}
int height(Bnode* node){
  if(node){
    return 1+max(height(node->left),height(node->right));
  }else{
    return 0;
  }
}
int diameter(Bnode* node){
  if(node){
    int lheight= height(node->left);
    int rheigth= height(node->right);
    int prev_diameter = max(diameter(node->left),diameter(node->right));

    return max(lheight+1+rheigth,prev_diameter);
  }else{
    return 0;
  }

}

void insert_BST(Bnode*& node,int num){
  	Bnode* newnode = new Bnode(num);
	if(node){
    	if(num<node->data)
          insert_BST(node->left,num);
      	else
          insert_BST(node->right,num);
    }else{
    	node = newnode;
    }
}

Bnode* newNode(int data) 
{ 
    Bnode* node = (Bnode*)malloc(sizeof(Bnode)); 
    node->data = data; 
    node->left = node->right = NULL; 
    return (node); 
} 
Bnode* insertLevelOrder(vector<int> arr, Bnode* root, 
                       int i, int n) 
{ 
    // Base case for recursion 
    if (i < n) 
    { 
        Bnode* temp = newNode(arr[i]); 
        root = temp; 
  
        // insert left child 
        root->left = insertLevelOrder(arr, 
                   root->left, 2 * i + 1, n); 
  
        // insert right child 
        root->right = insertLevelOrder(arr, 
                  root->right, 2 * i + 2, n); 
    } 
    return root; 
} 
int main()
{
  //type your code
  Bnode* root = nullptr;
  vector<int> vec;
  int num;
  while(1){
  	cin>>num;
    if(num<0)
      break;
    vec.push_back(num);

  }
  int n=vec.size();
  root =insertLevelOrder(vec,root,0,n);
  cout<<"Diameter of the given binary tree is "<<diameter(root)<<endl;
  
  return 0;
} 