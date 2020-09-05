#include<iostream>
using namespace std;
int main()
{
  //Type your code here...
  int len;
  cin>>len;
  int arr[len];
  for(int i=0;i<len;i++){
  	cin>>arr[i];
  }
  
  int tab[len];
  tab[0]=1;
  for(int i=0;i<len;i++){
    tab[i]=1;
  	for(int j=0;j<i;j++){
    	if(arr[j]<arr[i] && tab[j]+1>tab[i] ){
        	tab[i]=1+tab[i];
        }
    }
  }
  
  cout<< tab[len-1];
}