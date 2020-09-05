#include<iostream>
#include<cmath>
using namespace std;

int count_sqr(int,int );
int perimeter(int );
int apple_in_sqr(int);
int main()
{
  //Type your code here
  int x;
  cin>>x;
  int sqr=count_sqr(0,x);
  cout<<perimeter(sqr)<<endl;
  
  
  return 0;
}

int perimeter(int sqr){
 int len=2*sqr;
 return 4*len;

}

int count_sqr(int sqr,int apple){
  int apple_in_sqr_1 = apple_in_sqr(sqr);
if(apple_in_sqr_1>=apple)
  return sqr;
return count_sqr(sqr+1,apple);  
}

int apple_in_sqr(int sqr){
  if(sqr==0)
    return 0;
  int sum=0;
  for(int i=1;i<=sqr;i++){
  	sum+=sqr+i;
  }
  sum*=2;
  sum+=sqr;
  sum*=4;
  sum-=4*2*sqr;
    return sum;

}