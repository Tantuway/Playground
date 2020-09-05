#include<iostream>
#include<string>
using namespace std;
int max(int a, int b){
	return (a>b)?a:b;
}
int main()
{
  //Type your code here
  string str1, str2;
  cin>>str1;
  cin>>str2;
  int len1=str1.size();
  int len2=str2.size();
  int tab[len1+1][len2+1];
  
  for(int i=0;i<=len1;i++)
    tab[i][0]=0;
  for(int j=0;j<=len2;j++)
    tab[0][j]=0;
  
  for(int i =1;i<= len1;i++){
  	for(int j=1;j<=len2;j++){
    	if(str1[i-1]==str2[j-1]){
        	tab[i][j]=1+tab[i-1][j-1];
        }else{
        	tab[i][j]=max(tab[i][j-1], tab[i-1][j]);
        }
    }
  }
  
  cout<<tab[len1][len2];
  return 0;
}