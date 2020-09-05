#include<bits/stdc++.h>
using namespace std;

int lookup[100][100];

void match(string str,string pattern,int str_n,int pat_n);

int main(){
	string str;
	cin >>str;
	string pattern;
	cin>>pattern;

	int str_n = str.size();
	int pat_n = pattern.size();

	lookup[0][0]=1;
	match(str,pattern,str_n,pat_n);

	if(lookup[str_n][pat_n])
		cout<<"true";
	else 
		cout<<"false";



	return 0;
}


void match(string str, string pattern, int str_n, int pat_n){

	for(int i=1;i<=str_n;i++){
		for(int j=1;j<=pat_n;j++){
			if(i==1&&j==1&&pattern.at(0)=='*'){
				lookup[1][1]=1;
				continue; 
			}
			if(str.at(i-1)==pattern.at(j-1)||pattern.at(j-1)=='?'){				
				lookup[i][j]=lookup[i-1][j-1];
			}else  if(pattern.at(j-1)=='*'){
				lookup[i][j]=(lookup[i-1][j]+lookup[i][j-1]);
			}else {
				lookup[i][j]=0;
			}
		}

	}

}