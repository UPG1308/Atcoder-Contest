#include <bits/stdc++.h>
using namespace std;

int main(){
    int n; cin>>n;
    vector<int> arr(n, 0);
    for(int i = 0; i < n; i++) cin>>arr[i];
    int mx = -1, secmx = -1;
    for(int i = 0; i < n; i++){
        if(mx == -1 or arr[i] > arr[mx]){
            if(mx != -1 and (secmx == -1 or arr[mx] > arr[secmx])) secmx = mx;
            mx = i;
        }
        else if(secmx == -1 or arr[i] > arr[secmx]) secmx = i;
    }
    cout<<secmx + 1<<"\n";
    return 0;
}