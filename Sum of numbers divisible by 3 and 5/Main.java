#include<iostream>
using namespace std;

int main()
{
  //Type your code here
  int num1,num2;
  cin>>num1>>num2;
  int sum=0;
  for(int i=num1;i<num2;i++){
    if(i%15==0)
      sum+=i;
  
  }
  cout<<sum;
  return 0;
}