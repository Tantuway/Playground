#include<bits/stdc++.h>
using namespace std;
int main()
{
  //Type your code here
  int num;
  cin>>num;
  char c;
  string seq;
 // int loop=0;
  for(int i=0;i<num;i++ ){
  	cin>>c;
    seq.push_back(c);
   // cout<<++loop<<endl;
  }
  int k;
  cin>>k;
  
  int thieves=0;
  //cout<<seq<<endl;

 for(int i=0;i<num;i++){
 	// 	cout<<"For :"<<i<<endl;

 	if(seq.at(i)=='P'){

 		int catch_count=0;

 		
 		if(i<num){
 			int j=k;
 			while(j>0){
 				
 				if(i-j>=0){
 					if(catch_count==0){
	 					if(seq.at(i-j)=='T'){
	 						thieves++;
	 						catch_count++;
	 						seq.at(i-j)='X';
	 					}
	 				}

 				}

 				j--;
              	
 			}

 			j=k;

 			while(j>0){
              	if(i+j<num){
 					if(catch_count==0){
	 					if(seq.at(i+j)=='T'){
	 						thieves++;
	 						catch_count++;
	 						seq.at(i+j)='X';
	 					}
	 				}

 				}

 				j--;
 			}


 		}
 		
 	}
 }



cout<<"Maximum thieves caught: "<<thieves<<endl;
//cout<<seq<<endl;

  
  return 0;
}