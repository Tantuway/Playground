#include <iostream>
#include<string>
using namespace std;
int main()
{
  //Type your code here
  int  v,e;
  cout<<"Please enter the number of nodes in the graph\n";
  cin>>v;
  cout<<"Please enter the number of edges in the graph\n";
  cin>>e;
  int adjMatrix[v][v];
  for(int i=0;i<v;i++){
  	for(int j=0;j<v;j++){
    	adjMatrix[i][j]=0;
    }
}
  
  cout<<"Is the graph directed\n";
  string str;
  cin>>str;
  cout<<"Adjacency Matrix Representation:"<<endl;
  for(int i=0;i<v;i++){
  	for(int j=0;j<v;j++){
    	cout<<adjMatrix[i][j]<<" ";
    }
    cout<<endl;
  }
	int x,y,cost;
  
  for(int i=1;i<=e;i++){
    cout<<"Enter the start node, end node and weight of edge no "<<i<<endl;
	cin>>x>>y>>cost;
    if(str=="yes"){
    	adjMatrix[x-1][y-1]=cost;
    }else{
  		adjMatrix[y-1][x-1]=cost;
        adjMatrix[x-1][y-1]=cost;
 	}
  }
  
  cout<<"Adjacency Matrix Representation:"<<endl;
  for(int i=0;i<v;i++){
  	for(int j=0;j<v;j++){
    	cout<<adjMatrix[i][j]<<" ";
    }
    cout<<endl;
  }
  return 0;
}