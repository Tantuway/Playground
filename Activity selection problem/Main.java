#include<bits/stdc++.h>
using namespace std;

int main()
{
 
  int n;
  cin>>n;
  int start[n];
  int end[n];
  for(int i=0;i<n;i++)
    cin>>start[i];
  for(int j=0;j<n;j++)
    cin>>end[j];
  
cout<<"0 ";
int end_i=end[0];

  for(int i=1;i<n;i++){

  	if(start[i]>=end_i){
  		cout<<i<<" ";
  		end_i=end[i];
  	}


  }
}