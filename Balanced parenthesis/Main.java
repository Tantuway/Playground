#include<bits/stdc++.h>
using namespace std;
class node{
  public:
  	char data;
  	node* next;
  node(char node_data){
  	this->data=node_data;
    this->next=nullptr;
  }
};
int main()
{
  //Type your code
  	node* head = nullptr;
  	string s;
  	cin>>s;
  	int str_size = s.size();
  	if(str_size%2){
      cout<<"Not Balanced";
      return 0;
    }
  char c;
  for(int i=0;i<str_size;i++){
	  c=s[i];
	  switch(c){
	    case '}': if(head->data == '{'){
	    			  node* temp = head;
	      			  head=head->next;
	      			  delete temp;
	    		  }else{
	      			cout<<"Not Balanced";
	      			return 0;
	    		  }
	      		 break;
	    case ')': if(head->data == '('){
	    			  node* temp = head;
	      			  head=head->next;
	      			  delete temp;
	    		  }else{
	      			cout<<"Not Balanced";
	      			return 0;
	    		  }
	      		 break;
	    case ']': if(head->data == '['){
	    			  node* temp = head;
	      			  head=head->next;
	      			  delete temp;
	    		  }else{
	      			cout<<"Not Balanced";
	      			return 0;
	    		  }
	      		 break;
	    default :
	      			node* temp = new node(c);
	      			temp->next = head;
	      			head  = temp;
	  }
    }
  if(!head)
  	cout<<"Balanced";
  else 
    cout<<"Not Balanced";
  return 0;
}