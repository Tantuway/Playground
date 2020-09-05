#include<iostream>
using namespace std;
void print(int id , int *ptr, int top, int end ){
  cout<<"Stack "<<id<<" Elements:"<<endl;
  for(int i=top;i>=end;i--)
    cout<<ptr[i]<<" ";
  cout<<endl;

}
int main()
{
  //Type your code here
  int arr[1000] = {0};
  int stack1_end=0,
  	  stack2_end=0,
  	  stack1_ptr=-1,stac1,
  	  stack2_ptr=0;
  cin>>stack2_end;
  	  stack2_ptr=stack2_end-1;
  	  stac1=stack2_end;
  
  while(stac1){
    stack1_ptr++;
    cin>>arr[stack1_ptr];
  	stac1--;
  }
  
  print(1,arr,stack1_ptr,0);
  
  int stac2;
  cin>>stac2;
  
  while(stac2){
    stack2_ptr++;
  	cin>>arr[stack2_ptr];
    stac2--;
  }
  
 print(2,arr,stack2_ptr,stack2_end);
 
  int del1=0,del2=0;
  cin>>del1>>del2;
  while(del1){
  	stack1_ptr--;
    del1--;
  }
  while(stack1_ptr<-1){
    cout<<"Stack underflow. pop from stack 1 failed"<<endl;
    stack1_ptr++;
  }
  print(1,arr,stack1_ptr,0);
  
  	while(del2){
  	stack2_ptr--;
    del2--;
  }
  if(stack2_ptr<stack2_end-1){
    cout<<"Stack underflow. pop from stack 2 failed"<<endl;
    stack2_ptr++;
  }
 print(2,arr,stack2_ptr,stack2_end);
  
  
  return 0;
}