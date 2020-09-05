#include<bits/stdc++.h>
using namespace std;

int arr_prod(int arr1[],int arr2[],int n,int ind){
	int prod=0;
	for(int i=0;i<n;i++){
		if(i==ind){
			if((arr1[i]>=0)&&arr2[i]>0)
				prod+=(arr1[i]-2)*arr2[i];
			if((arr1[i]>=0)&&arr2[i]<0)
				prod+=(arr1[i]+2)*arr2[i];
			if((arr1[i]<0)&&arr2[i]>0)
				prod+=(arr1[i]-2)*arr2[i];
			if((arr1[i]<0)&&arr2[i]<0)
				prod+=(arr1[i]+2)*arr2[i];



			
		}else{
			prod+=arr1[i]*arr2[i];
		}

  		
  }
 // cout<<"\nind: "<<ind<<" prod: "<<prod<<endl;;

  return prod;


}

int main()
{
  //Type your code here
  int n;
  cin>>n;

  int arr1[n];
  int arr2[n];
  for(int i=0;i<n;i++)
    cin>>arr1[i];
  for(int i=0;i<n;i++)
    cin>>arr2[i];
  int modifications;
  cin>>modifications;

  
  int mod_index,prod=0;
  int mini=INT_MAX;
  while(modifications>0){
  	//cout<<"\nwhile:"<<modifications<<endl;

  	for(int i=0;i<n;i++){
  		prod=arr_prod(arr1,arr2,n,i);
  		if(prod<mini){
  			mini=prod;
  			mod_index=i;
  		}

  	}

  	//arr1[mod_index]-=2;
  			if((arr1[mod_index]>=0)&&arr2[mod_index]>0)
				arr1[mod_index]-=2;
			else if((arr1[mod_index]>=0)&&arr2[mod_index]<0)
				arr1[mod_index]+=2;
			else if((arr1[mod_index]<0)&&arr2[mod_index]>0)
				arr1[mod_index]-=2;
			else if((arr1[mod_index]<0)&&arr2[mod_index]<0)
				arr1[mod_index]+=2;

	//	for(auto a:arr1)
	//		cout<<a<<" ";
	//	cout<<"| prod: "<<mini<<endl;




    modifications--;
    
  }
  
  //arr1[n-1]=arr1[n-1]-(2*modifications);
  
  //int prod = arr_prod(arr1,arr2,n);
  
  cout<<mini<<endl;
  return 0;
}