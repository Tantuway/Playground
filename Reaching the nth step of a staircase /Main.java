#include <iostream>
using namespace std;
int main() 
{
   // Try out your code here
   	int n;
  	cin>>n;
  	int tab[n+1];
  	tab[0]=1;
  	tab[1]=1;
  	tab[2]=2;
  	for(int i=3;i<=n;i++)
      tab[i]=tab[i-1]+tab[i-2];
  	cout<<tab[n];
    return 0;
}