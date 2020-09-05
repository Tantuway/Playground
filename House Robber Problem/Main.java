#include<iostream>
#include<bits/stdc++.h>
#include<vector>
using namespace std;

int max_index(int* ,int);
void adjust(int,int*,int);
void print(int*, int);
int sum1(int*,int);

int main()
{
  
  int num;
  cin>>num;
  int arr[num];
  for (int i = 0; i < num; ++i)
    cin>>arr[i];

  

  int ind=0,sum=0,check=0;

  while(check!=-1*num){
    ind=max_index(arr,num);
    sum+=arr[ind];
    adjust(ind,arr,num);

    check=sum1(arr,num);



  }

 cout<<sum;
  return 0;
 
  }

  int sum1(int*p,int num){

    int sum=0;
    for (int i = 0; i < num; ++i)
    {
      /* code */
      sum+=p[i];
    }
    return sum;
  }

  int max_index(int* p,int num){

    int max=*p,ind=0;

    for(int i=1;i<num;i++){

      if(*(p+i)>max){
        max=*(p+i);
        ind=i;
      }
    }

    return ind;



  }
  
  void adjust(int ind , int* p,int num){

    if(ind>0&&ind<num){
        *(p+ind+1)=-1;
        *(p+ind-1)=-1;
        *(p+ind)=-1;
      }else if(ind==0){

        *(p+ind+1)=-1;
        //*(p+ind-1)=-1;
        *(p+ind)=-1;


      }else{

        //*(p+ind+1)=-1;
        *(p+ind-1)=-1;
        *(p+ind)=-1;
      }



  }

  void print(int* p , int num){

    cout<<"arr : ";
  for (int i = 0; i < num; ++i)
  {
    /* code */
    cout<<p[i]<<" ";
  }

  cout<<endl;

  }