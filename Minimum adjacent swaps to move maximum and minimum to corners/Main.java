#include<iostream>
using namespace std;

int main()
{
  //Type your code here
  int size;
  cin>>size;
  int arr[size];
  for(int i=0;i<size;i++)
    cin>>arr[i];
  int max=arr[0];
  int max_ind=0;
  for(int i=1;i<size;i++){
    if(arr[i]>max){
      max=arr[i];
      max_ind=i;
    }
  }
  int min=arr[0];
  int min_ind=0;
  for(int i=1;i<size;i++){
    if(arr[i]<min){
      min=arr[i];
      min_ind=i;
    }
  }
 if(min_ind<max_ind){
 	cout<<max_ind+(size-1-min_ind)-1;
 }else{
 	cout<<max_ind+size-1-min_ind;
 } 
      
  
  return 0;
}