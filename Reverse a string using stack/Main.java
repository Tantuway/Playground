#include<bits/stdc++.h>
using namespace std;
class node{
public:
  char data;
  node* next;
  node(int node_data){
  	this->data = node_data;
    this->next = nullptr;
  }
};
int main()
{
  //type your code
  node* head = nullptr;
  string  str;
  cin>>str;
  int str_len = str.size();
  for(int i=0;i<str_len;i++){
    node* temp = new node(str[i]);
    temp->next=head;
    head=temp;
  }
  while(head){
  	cout<<head->data;
    head=head->next;
  }
  return 0;
}