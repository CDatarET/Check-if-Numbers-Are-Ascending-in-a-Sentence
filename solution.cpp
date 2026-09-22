class Solution {
public:
    bool areNumbersAscending(string s) {
        int prev = -1;
        istringstream iss(s);
        string word;
        while(iss >> word) {
            if(word[0] >= '0' && word[0] <= '9'){
                int x = stoi(word);
                if(x <= prev){
                    return false;
                }

                prev = x;
            }
        }

        return true;
    }
};
