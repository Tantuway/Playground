#include<iostream>
using namespace std;
int main()
{
  //Type your code here
  int N;
  cin>>N;
  
  int arr[]{1,2,5,10,20,50,100,500,1000};
  int arr_s=9;
  int i=1;
  
 while(N>0){
	while(N>=arr[arr_s-i]){
    	cout<<arr[arr_s-i]<<"  ";
      	N-=arr[arr_s-i];
    }   
   i++;
 	
 }
  
  //cout<<"1000  100  100  20  10";
  return 0;
}