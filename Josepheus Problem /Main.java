#include<iostream>
using namespace std;
int jose(int , int);
int main()
{
  //Type your code here
  int N;
  int k;
  cin>>N>>k;
  
 cout<<jose(N,k);  
  return 0;
}

int jose(int N , int k){
 if(N==1)
   return 1;
  
  return  (k-1+jose(N-1,k))%N+1;
  


}