#include<bits/stdc++.h>
using namespace std;



void spred(int x,int y,int* arr,int row,int col, vector<int> &vec);
int done(int x,int y,vector<int> &vec);


int main(){
	int x,y;
	cin>>x>>y;
	int row=x;
	int col=y;

	row=x,col=y;

	int arr[x][y];

	for(int i=0;i<x;i++)
		for(int j=0;j<y;j++)
			cin>>arr[i][j];
/*
	for(int i=0;i<x;i++){
		for(int j=0;j<y;j++)
			cout<<arr[i][j]<<" ";
		cout<<endl;
	}
*/
	vector <int> vec;
	int island=0;
    
    for(int i=0;i<x;i++){
		for(int j=0;j<y;j++){
			if(arr[i][j]==1){

				if(done(i,j,vec)){

				}else{
				spred(i,j,(int*)arr,row,col,vec);
				island++;
				}

			}
			
			
		}

	}	// Passing 2D array to a function 
	

	cout<<island-1<<endl; // Accesssing 2D array in same finction 
	return 0;
}

void spred(int x,int y,int* arr,int row,int col, vector<int> &vec){

/*
	for(int i=0;i<x;i++)
		for(int j=0;j<y;j++)
			cout<<*((arr+i*x) + j)<<" ";

*/
	if(done(x,y,vec)){

	}else if(*((arr+x*col)+y)==1){
		//if((x>=0)&&(x<row)&&(y>=0)&&(y<col))

			vec.push_back(x);
			vec.push_back(y);

			//cout<<"Spread Called with: "<<x<<" "<<y<<endl;


			if((x-1)>=0)
				if(*((arr+(x-1)*col)+y)==1){
					//cout<<endl<<x-1<<","<<y <<endl;
					spred(x-1,y,(int*)arr,row,col,vec);
				}
			if((x+1)<row)
				if(*((arr+(x+1)*col)+y)==1){
					//cout<<endl<<x+1<<","<<y <<endl;
					spred(x+1,y,(int*)arr,row,col,vec);
				}
			if((y-1)>=0)
				if(*((arr+(x)*col)+y-1)==1){
					//cout<<endl<<x<<","<<y-1 <<endl;
					spred(x,y-1,(int*)arr,row,col,vec);

				}
					

					
			if((y+1)<col)
				if(*((arr+(x)*col)+y+1)==1){
					//cout<<endl<<x<<","<<y+1 <<endl;
					spred(x,y+1,(int*)arr,row,col,vec);
				}


			if(((x-1)>=0)&&((y-1)>=0))
				if(*((arr+(x-1)*col)+y-1)==1){
					//cout<<endl<<x-1<<","<<y-1 <<endl;
					spred(x-1,y-1,(int*)arr,row,col,vec);
				}
			if(((x-1)>=0)&&((y+1)<col))
				if(*((arr+(x-1)*col)+y+1)==1){
					//cout<<endl<<x-1<<","<<y+1 <<endl;
					spred(x-1,y+1,(int*)arr,row,col,vec);
				}
			if(((x+1)<row)&&((y+1)<col))
				if(*((arr+(x+1)*col)+y+1)==1){
					//cout<<endl<<x+1<<","<<y+1 <<endl;
					spred(x+1,y+1,(int*)arr,row,col,vec);
				}
			if(((x+1)<row)&&((y-1)>=0))
				if(*((arr+(x+1)*col)+y-1)==1){
					//cout<<endl<<x+1<<","<<y-1 <<endl;
					spred(x+1,y-1,(int*)arr,row,col,vec);
				}

	}
	



}


int done(int x,int y,vector<int> &vec){
	int len=vec.size();
	for(int i=0;i<len;i=i+2)
		if(vec[i]==x)
			if(vec[i+1]==y)
				return 1;

	return 0;

}

