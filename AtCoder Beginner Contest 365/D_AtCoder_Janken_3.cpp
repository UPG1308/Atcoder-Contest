#include <bits/stdc++.h>
using namespace std;

int main(){
    int n; cin>>n;
    string s; cin >> s;
    int count = 1, ans = 0;
    for(int i = 1; i < n; i++){
        if(s[i] == s[i - 1]) count++;
        else{
            ans = ans + (count + 1)/2;
            // cout<<ans<<"  "<<count<<"\n";
            count = 1;
        }
    }
    ans = ans + (count + 1)/2;
    cout<<ans;
    return 0;
}