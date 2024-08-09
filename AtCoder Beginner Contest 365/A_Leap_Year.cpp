#include <bits/stdc++.h>
using namespace std;

int main(){
    int n; cin>>n;
    if(n % 4 != 0) cout<<"365";
    else if((n % 4 == 0) and (n % 100 != 0)) cout<<"366";
    else if((n % 100 == 0) and (n % 400 != 0)) cout<<"365";
    else if(n % 400 == 0) cout<<"366";
    return 0;
}