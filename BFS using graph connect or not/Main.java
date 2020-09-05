#include<iostream>
#include<vector>
#include<stack>
using namespace std;

void edge(vector<vector<int>> &adjList,int x, int y){
	adjList[x].push_back(y);
}

void fillStack(vector<vector<int>> &adjList,vector<bool> &visited, stack<int> &stk, int n){
  	visited[n]=true;
  	vector<int>::iterator itr;
  	for(itr = adjList[n].begin();itr!=adjList[n].end();itr++){
    	if(visited[*itr]==false)
          fillStack(adjList,visited,stk,*itr);
    }
  	stk.push(n);
}

void graphTranspose(vector<vector<int>> &adjList, int v){
	vector<vector<int>> tempList;
  	tempList.assign(v,vector<int> ());
  	for(int i=0;i<v;i++){
    	for(auto a:adjList[i]){
        	tempList[a].push_back(i);
        }
    }
  	 adjList=tempList;
}

void dfsUtil(vector<vector<int>> adjList, vector<bool> &visited, int n){
	visited[n]=true;
  	
  vector<int>::iterator itr;
  for(itr=adjList[n].begin();itr!=adjList[n].end();itr++){
  	if(visited[*itr]==false)
      dfsUtil(adjList,visited,*itr);
  }
}
bool SC(vector<vector<int>> adjList, int v){
	vector<bool> visited;
  	visited.assign(v,false);
  	stack<int> stk;
  	
    fillStack(adjList,visited,stk,0);
  
  	for(int i=0;i<v;i++){
    	if( visited[i]==false){
        	return false;
        }
      	visited[i]=false;
    }
  	
  	graphTranspose(adjList,v);
  	
  	dfsUtil(adjList,visited,0);
  	for(int i=0;i<v;i++){
    	if(visited[i]==false)
          return false;
    }
  	return true;
}
int main()
{
  //Type your code here
  int v;
  cin>>v;
  int e;
  cin>>e;
  vector<vector<int>> adjList;
  adjList.assign(v,vector<int> () );
  int x,y;
  
  for(int i=0;i<e;i++){
  	cin>>x>>y;
    edge(adjList,x,y);
  }
  
 if(SC(adjList,v))
   cout<<"Yes";
  else 
    cout<<"No";
}