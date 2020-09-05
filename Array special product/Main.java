#include <bits/stdc++.h> 
using namespace std;

int main(){

	int size;
    cin>>size;

  	int arr[size];
  	for(int i=0;i<size;i++)
    	cin>>arr[i];

  	int prod[size];
  	prod[0]=1;
  	long long int temp=1;
  	for(int i=1;i<size;i++){
  		temp*=arr[i-1];
  		prod[i]=temp;
  	}
  	temp=1;
  	for(int j=size-2;j>=0;j--){
  		temp*=arr[j+1];
  		prod[j]*=temp;

  	}

  	for(auto n:prod)
  		cout<<n<<endl;
  	//cout<<endl;
  
  
	return 0;
}