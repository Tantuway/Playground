#include <bits/stdc++.h>
using namespace std;
int arr[5][5];

void print(int r, int c){
	for(int i=0;i<r;i++){
    	for(int j=0;j<c;j++)
         	cout<<arr[i][j]<<" ";
         cout<<endl;
	}

    cout<<endl;

}

int main() 
{
   // Try out your code here
    int row, col;
    int x,y;	

  	cin>>row>>col;
  	cin>>x>>y;

  	for(int i=0;i<row;i++)
    	for(int j=0;j<col;j++)
         	arr[i][j]=0;
  	int res=1;
  	arr[x][y]=1;
  	stack<int> stk;

  	 while(arr[0][0]==0 || arr[0][col-1]==0 || arr[row-1][0]==0 || arr[row-1][col-1]==0){

  	 	//print(row,col);
     	for(int i=0;i<row;i++){
        	for(int j=0;j<col;j++){
            	if(arr[i-1][j]==1 || arr[i][j-1]==1 || arr[i][j+1]==1  ||  arr[i+1][j]==1 ){
                  stk.push(i);
                  stk.push(j);                  
            	}
            }
        }

        while(!stk.empty()){
        	int tempy = stk.top();
        	stk.pop();
        	int tempx = stk.top();
        	stk.pop();

        	arr[tempx][tempy]=1;

        }
       res++;

       
    }
  	
  	cout<<res;
    return 0;
}

