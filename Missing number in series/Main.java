#include<iostream>
using namespace std;
int binary_search(int arr[], int low,int high,int d){
  
  
  if(low<high){
    int mid=low+(high-low)/2;
    if((arr[high]-arr[low])/2==d)
      return arr[low]+d;
    else if(arr[mid]>arr[low]+(mid-low)*d)
      return binary_search(arr,low,mid,d);
    else 
      return binary_search(arr,mid,high,d);
    
  }
  
  
  return -1;
  
}
int main()
{
  //Type your code here
  int size;
  cin >>size;
  int arr[size];
  for(int i=0;i<size;i++)
    cin>>arr[i];
  int d= (arr[size-1]-arr[0])/size;
  cout<<binary_search(arr,0,size-1,d);
  return 0;
}