#include<iostream>
#include<vector>
#include<stack>
using namespace std;
void edge(vector<vector<int>> &adjList,int x,int y){
  adjList[x].push_back(y);
  adjList[y].push_back(x);
}

void dfs(vector<vector<int>> adjList,int v){

    vector<bool> visited;
    visited.assign(v,false);
    stack<int> stack;
    stack.push(0);
  	visited[0]=true;
  
  	int f;
  	while(!stack.empty()){
    	f=stack.top();
      	cout<<f<<" ";
      	stack.pop();
      	for(auto i=adjList[f].begin();i!=adjList[f].end();i++){
        	if(visited[*i]==false){
            	stack.push(*i);
              	visited[*i]=true;
            }
        }
    }

}
int main()
{
  //Type your code here
  int v;
  cin>>v;
  vector<vector<int>> adjList;
  adjList.assign(v,vector<int>());
  
  int x,y;
  while(1){
  	cin>>x>>y;
    if(x<0||y<0){
    	break;
    }
    edge(adjList,x,y);
  }
  
  cout<<"DFS : ";dfs(adjList,v);
  return 0;
}