#include<bits/stdc++.h>
#include<iostream>
#include<string>
#include<vector>
using namespace std;

void str_per(string, string);

// Time complexity Problem 
// This solution is not optimal # First attempt 



int main(){

	string str;
	cin>>str;
	sort(str.begin(),str.end());
	string app="";


	str_per(str,app);


	return 0;
}

void str_per(string str,string app){

	int len=str.length();

	if(len==1){
		cout<<app<<str<<endl;			
		return; 
	}

	string str_temp,app_temp;

	for(int i=0;i<len;i++){

		if((i>0)&&(str[i]==str[i-1]))
			continue; 
		str_temp=str;
		app_temp=app;

		app+=str[i];
		str=str.substr(0,i)+str.substr(i+1,str.length()-(i+1));
		str_per(str,app);
		
		
		app=app_temp;
		str=str_temp;
		
	}


	return;



}
