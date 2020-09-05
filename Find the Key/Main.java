#include<iostream>
using namespace std;

int main()
{
  //Type your code here
  int num1,num2,num3;
  cin>>num1>>num2>>num3;
  int temp1,temp2,temp3,res;
  temp1=num1/1000;
  temp2=num2/1000;
  temp3=num3/1000;
  if(temp2<temp1)
    temp1=temp2;
  if(temp3<temp1)
    temp1=temp3;
  res=temp1*1000;
  
  temp1=num1/100;
  temp1%=10;
  temp2=num2/100;
  temp2%=10;
  temp3=num3/100;
  temp3%=10;
  if(temp2>temp1)
    temp1=temp2;
  if(temp3>temp1)
    temp1=temp3;
  res+=temp1*100;
  
  temp1=num1/10;
  temp1%=10;
  temp2=num2/10;
  temp2%=10;
  temp3=num3/10;
  temp3%=10;
  if(temp2<temp1)
    temp1=temp2;
  if(temp3<temp1)
    temp1=temp3;
  res+=temp1*10;
  temp1=num1;
  temp2=num2;
  temp3=num3;
  temp1%=10;
  temp2%=10;
  temp3%=10;
  if(temp2>temp1)
    temp1=temp2;
  if(temp3>temp1)
    temp1=temp3;
  res+=temp1;
  
  cout<<res<<endl;
  return 0;
}