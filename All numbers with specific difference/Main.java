#include <bits/stdc++.h> 
using namespace std;
int sum(int num){
	int sum=0;
	while(num>0){
		sum+=(num%10);
		num/=10;

	}
	return sum;
}

void fun(int N,int D){
	//int flag=1;
	int i=10;
	while(i<N){
		if(i-sum(i)>=D){
			cout<< N-i+1<<endl;
          break;
		}
		i+=10;


	}
	//cout<<
	//return 0;
}

int main(){

	int tc=1,x,y;
	//cin >>tc;
	while(tc>0){
		tc--;
		cin>>x>>y;
		fun(x,y);

	}
	
  
	return 0;
}