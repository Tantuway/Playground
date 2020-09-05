#include<bits/stdc++.h>
using namespace std;
int binary_search(int arr[],int low, int high, int num){

  int mid=low+(high-low)/2;
  if(arr[mid]==num)
    return mid;
  if(low<high){
  if(arr[mid]<num)
    return binary_search(arr,mid+1,high,num);
  else 
    return binary_search(arr,low,mid-1,num);
  }
  
  return -1;
 
  
}
int main()
{
  //Type your code here
  int arr_len,num;
  cin>>arr_len;
  int arr[arr_len];
  
  for(int i=0;i<arr_len;i++)
    cin>>arr[i];
  cin>>num;
  int res=binary_search(arr,0,arr_len-1,num);
  if(res==-1)
    cout<<"Not found";
  else 
  	cout<<res;
  return 0;
}