#include <bits/stdc++.h>
using namespace std;
void merge(int arr[],int low,int mid,int high){
	int s_l=mid-low+1;
  	int s_r=high-mid;
  	int arr_l[s_l];
  	int arr_r[s_r];
  	for(int i=0;i<s_l;i++)
      arr_l[i]=arr[low+i];
  	for(int i=0;i<s_r;i++)
      arr_r[i]=arr[mid+1+i];
  	int i=0,j=0,k=low;
  	while(i<s_l&&j<s_r){
      if(arr_l[i]<=arr_r[j]){
        arr[k]=arr_l[i];
        i++;
        k++;
      }else{
      	arr[k]=arr_r[j];
        j++;
        k++;
      }    
    }
  while(i<s_l){
  arr[k]=arr_l[i];
  k++;
  i++;
  }
  while(j<s_r){
  	arr[k]=arr_r[j];
    j++;
    k++;
  }
  	
}
void merge_sort(int arr[], int low,int high){
	if(low<high){
    	int mid = low+(high-low)/2;
      	merge_sort(arr,low,mid);
      	merge_sort(arr,mid+1,high);
      	merge(arr,low,mid,high);
      
      
    }
}

int main() 
{
   // Try out your code here
  int size;
  cin>>size;
  int arr[size];
  for(int i=0;i<size;i++)
    cin>>arr[i];
  cout<<"Before Sort:\n";
  for(auto a:arr)
    cout<<a<<" ";
  cout<<"\nAfter Sort:\n";
  merge_sort(arr,0,size-1);
  for(auto a:arr)
    cout<<a<<" ";
   
  
    return 0;
}