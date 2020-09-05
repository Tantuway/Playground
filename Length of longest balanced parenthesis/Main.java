#include<bits/stdc++.h>
using namespace std;
int main()
{
  //Type your code here
  string str;
  cin>>str;
  int count =0,max=0;
  vector <int> stack;
  stack.push_back(-1);
  int len  =  str.size();
  for(int i=0;i<len;i++){
  	if(str[i]=='('){
  		stack.push_back(i);
  	}else{
  		if(stack.empty()){
  			stack.push_back(i);
  		}else{
  			stack.pop_back();
  			if(stack.empty()){
  				stack.push_back(i);
  			}else{
  				max = count;
  				count = i - stack.back();
  				if(count<max)
  					count = max;

  			}

  		} 

  	}
  }

  cout<<count<<endl; 
  return 0;
}