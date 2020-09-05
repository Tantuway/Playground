#include<iostream>
#include<string>
using namespace std;
int min2(int a, int b){
  return (a<b)?a:b;
}

int min(int a, int b, int c){
  return min2(a, min2(b,c));
}

int main()
{
  //Type your code here
  string str1, str2;
  cin>>str1;
  cin>>str2;
  
 int len1 = str1.size();
 int len2 = str2.size();
  
 int tab[len1+1][len2+1];
  for(int i=0;i<=len1;i++)
      tab[i][0]=i;
  for(int j=0;j<=len2;j++)
      tab[0][j]=j;
  for(int i=1;i<=len1;i++){
    for(int j=1;j<=len2;j++){
      if(str1[i-1]==str2[j-1])
          tab[i][j]=tab[i-1][j-1];
        else{
          tab[i][j] = 1+ min(tab[i][j-1],tab[i-1][j],tab[i-1][j-1] );
        }
    }
  }
  
  cout<<tab[len1][len2];
  return 0;
}