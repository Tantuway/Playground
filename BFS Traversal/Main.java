#include <iostream>
#include <vector>
#include<queue>
using namespace std;

void edge(vector<vector<int>> &adjList,int x,int y){
	adjList[x].push_back(y);
 	adjList[y].push_back(x);
}
void bfs(vector<vector<int>> adjList,int v){
	queue<int> queue;
  	vector<bool> visited;
  	visited.assign(v,false);
  	queue.push(0);
  	visited[0]=true;
  	int f;
  	while(!queue.empty()){
      f=queue.front();
      cout<<f<<" ";
      queue.pop();
      for(auto i=adjList[f].end();i!=adjList[f].begin()-1;i-- ){
      	if(visited[*i]==false){
        	queue.push(*i);
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
  if(v==0){
  	cout<<"Graph doesn't exist";
    return 0;
   }
  int x,y;
  vector<vector<int>> adjList;
  adjList.assign(v,vector<int>());
  while(1){
  	cin>>x>>y;
    if(x<0||y<0)
      break;
    edge(adjList,x,y);
  }
  cout<<"BFS :  ";
  bfs(adjList,v);
  return 0;
}