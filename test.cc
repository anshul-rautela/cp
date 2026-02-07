    #include<bits/stdc++.h>
    using namespace std;

    int main(){
            string s;
            cin>>s;
            
            string good;
            cin>>good;
            int k;
            cin>>k;

            unordered_set<string>set;
            for(int i =0;i<s.size();i++){
                int bad =0;
                char g ='0';
                string sb = ("");
                for(int j =i;j<s.size();j++){
                    char ch = s[j];
                    char goodchar = good[ch-'a'];
                    g = goodchar;
                    if(goodchar=='0')    bad++;
                    if(bad>k)break;
                    sb+=ch;
                    set.insert(sb);
                }
                char goodchar = g;
                bool r = false;
                for(;i<s.size()&&goodchar=='1';i++){  
                    r = true; 
                    char ch = s[i];
                    goodchar = good[ch-'a'];
                }
                if(r) i--;
            }
            cout<<(set.size());
        
    }