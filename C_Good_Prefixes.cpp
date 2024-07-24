#include <bits/stdc++.h>
using namespace std;

class TrieNode{
    public:
        TrieNode* links[26];
        bool isEnd = false;
        bool containsKey(char ch){
            return links[ch - 'a'] != NULL;
        }
        void put(char ch, TrieNode* node){
            links[ch - 'a'] = node;
        }
        TrieNode* get(char ch){
            return links[ch - 'a'];
        }
        void setEnd(){
            isEnd = true;
        }
        bool getEnd(){
            return isEnd;
        }
};
class Trie{
    private:
        TrieNode* root;
    public:
        Trie(){
            root = new TrieNode();
        }
        void insert(string word){
            TrieNode* node = root;
            for(int i = 0; i < word.size(); i++){
                if(!node -> containsKey(word[i])){
                    node -> put(word[i], new TrieNode());
                }
                node = node -> get(word[i]);
            }
            node -> setEnd();
        }
        bool search(string word){
            TrieNode* node = root;
            for(int i = 0; i < word.size(); i++){
                if(!node -> containsKey(word[i])){
                    return false;
                }
                node = node -> get(word[i]);
            }
            return node -> getEnd();
        }
        bool startsWith(string prefix)
        {
            TrieNode *node = root;
            for (int i = 0; i < prefix.size(); i++)
            {
                if (!node->containsKey(prefix[i]))
                {
                    return false;
                }
                node = node->get(prefix[i]);
            }
            return true;
        }
        void deleteWord(string word){
            TrieNode* node = root;
            for(int i = 0; i < word.size(); i++){
                if(!node -> containsKey(word[i])) return;
                node = node -> get(word[i]);
            }
            node -> isEnd = false;
        }
};

class UnionFind{
    vector<int> parent;
    vector<int> size;
    public:
    UnionFind(int n){
        parent.resize(n + 1);
        size.resize(n + 1);
        for(int i = 0; i <= n; i++) {parent[i] = i, size[i] = 1;}
    }
    int find(int u){
        if(parent[u] == u) return u;
        return parent[u] = find(parent[u]);
    }

    void unionn(int u, int v){
        int parentU = find(u);
        int parentV = find(v);
        if(parentU == parentV) return;
        if(size[parentU] > size[parentV]){
            size[parentU] += size[parentV];
            parent[parentV] = parentU;
        }
        else{
            size[parentV] += size[parentU];
            parent[parentU] = parentV;
        }
    }
};

int main()
{
    int t;
    cin >> t;
    while (t--)
    {
        int n;
        cin >> n;
        int a[n];
        for (int i = 0; i < n; i++)
            cin >> a[i];
        long long sum = 0;
        int mx = 0, ans = 0;
        ;
        for (int i = 0; i < n; i++)
        {
            sum += a[i];
            mx = max(mx, a[i]);
            if (sum - mx == mx)
                ans++;
        }
        cout << ans << endl;
    }
}