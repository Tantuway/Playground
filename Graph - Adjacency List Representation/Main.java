#include<iostream>
using namespace std;

struct node{
	int name=0;
	node* edge = nullptr;
};

void add(node* adjList,int x,int y){
  	node* temp = &adjList[x];

	while(temp->edge!=nullptr){
    	temp=temp->edge;
    }
  	node* newnode = new node;
  	newnode->name=y;
  	temp->edge=newnode;
  
  	temp = &adjList[y];
  	while(temp->edge != nullptr){
    	temp=temp->edge;
    }
  	node* newnode2 = new node;
 	newnode2->name = x;
  	temp->edge=newnode2;
}
int main()
{
  //type your code
  int v,e;
  cout<<"Enter the number of vertices:"<<endl;
  cin>>v;
  cout<<"Enter the number of edges:"<<endl;
  cin>>e;
  node adjList[v];
  for(int i=0;i<v;i++){
  	adjList[i].name = i;
  }
  int x ,y;
  for(int i=1;i<=e;i++){
  	cout<<"Enter the Start node and End node of edge "<<i<<endl;
    cin>>x>>y;
	add(adjList,x,y);    
  }
  cout<<"Adjacency List:"<<endl;
  node* temp;
  
  for(int i=0;i<v;i++){
  	temp=&adjList[i];
    cout<<temp->name<<"--->";
  	temp=temp->edge;
  	while(temp!=nullptr){
  		cout<<temp->name<<" ";
  		temp=temp->edge;
  	}
  	cout<<endl;

  }
  
  return 0;
}