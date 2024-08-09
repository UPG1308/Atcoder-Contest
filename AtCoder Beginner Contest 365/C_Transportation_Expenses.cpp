#include <bits/stdc++.h>
using namespace std;
#define ll long long

ll helper(ll subsidy, vector<ll>& arr){
    ll totalAmount = 0ll;
    for(ll val: arr) totalAmount += min(val, subsidy);
    return totalAmount;
}
int main(){
    ll n, m; cin>>n>>m;
    vector<ll> arr(n, 0);
    ll mx = 0ll;
    for(int i = 0; i < n; i++) cin>>arr[i], mx = max(mx, arr[i]);
    ll sum = 0;
    for(int i = 0; i < n; i++) sum += (arr[i] * 1ll);
    if(sum <= m){
        cout << "infinite\n"; return 0;
    }
    int low = 0, high = mx;
    while(low <= high){
        ll mid = (low + high)/2;
        if(helper(mid, arr) <= m) low = mid + 1;
        else high = mid - 1;
    }
    cout<<high<<"\n";
}