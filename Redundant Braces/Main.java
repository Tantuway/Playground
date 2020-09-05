#include<bits/stdc++.h>
using namespace std;
int main()
{
  //type your code
  vector <char> vec;
  string s;
  cin>>s;
  int flag=0;
  char c;
  int str_size = s.size();
  for(int i=0;i<str_size;i++){
  	c=s[i];
  	if(c==')'){
    	if(vec.back()=='('){
        	cout<<"Yes";
              return 0;
        }else{
        	while(vec.back()!='('){
        		if(vec.back()=='+'||vec.back()=='-'||vec.back()=='*'||vec.back()=='/'||vec.back()=='%')
        			flag=1;
              vec.pop_back();

        	}
          	vec.pop_back();
          		if(!flag){
          			cout<<"Yes";
          			return 0;
        		}
        	flag=0;
          	}
    }else{
    	vec.push_back(c);
    }
   // if(vec.size()==0)
     // break;
  }
  cout<<"No";
  return 0;

}
