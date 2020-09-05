#include<bits/stdc++.h>
using namespace std;
#define N 100

int lookup[N][N];

void set_lookup(string s1,string s2,int n){
	for(int i=1;i<=n;i++){
		for(int j=1;j<=n;j++){
			if(s1[i-1]==s2[j-1]){
				//cout<<"ACD\n";
				lookup[i][j]=1+lookup[i-1][j-1];
			}else{
				lookup[i][j]=max(lookup[i-1][j],lookup[i][j-1]);
			}
		}
	}

}

string palindrome(string s1,string s2,int m,int n){
	if(m==0||n==0)
		return string ("");

	if(s1[m-1]==s2[n-1])
		return palindrome(s1,s2,m-1,n-1)+s1[m-1];
	else if (lookup[m-1][n]>lookup[m][n-1])
		return palindrome(s1,s2,m-1,n);
	else return palindrome(s1,s2,m,n-1);

}

int main(){
	string s1;
	cin>>s1;
	string s2=s1;
	reverse(s2.begin(),s2.end());
	int n=s1.size();
	
	set_lookup(s1,s2,n);
	cout<<palindrome(s1,s2,n,n);
	

	
	return 0;
}