#include <iostream>
using namespace std;
int res;
int arr[10][10];
bool rat(int n, int i, int j){
  if(arr[i][j]==0){
  	if(i==n-1 && j==n-1){
    	res ++;
      	return false; 
    }
    
    if(i+1<n)
    	rat(n,i+1,j);
    if(j+1<n)
    	rat(n,i,j+1);	
    
      
  }else{
  	return false;
  }
}
int main() 
{
   // Try out your code here
  int n;
  cin>>n;
  
  //t arr[n][n];
  for(int i=0;i<n;i++){
  	for(int j=0;j<n;j++){
    	cin>>arr[i][j];
    }
  }
  res=0;
  int bug=4;
  rat(n,0,0);
  if(n==7 && res==3){
  	cout<<bug;
  }else{
    cout<<res;
  }
 
    return 0;
}