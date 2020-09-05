#include <bits/stdc++.h>
using namespace std;

int main() 
{
   // Try out your code here
  string s;
  cin>>s;
  int size=s.size();
  int count=0;
  for(int i=0;i<size;i++){
  	if((int)s[i]-48==1)
      count++;
  }
  for(int i=0;i<count;i++)
    cout<<"1";
  for(int i=0;i<size-count;i++)
    cout<<"0";
  
  
    return 0;
}