class Solution {
public:
    bool isPalindrome(int x) {
        int rem = 0;
        int k = x;
        while (x != 0) {
            int r = x % 10;

            // Unified overflow check
            if (rem > INT_MAX / 10 ) return 0;
            if (rem < INT_MIN / 10 ) return 0;

            rem = rem * 10 + r;
            x /= 10;
    }
    if(k>0){
        return rem == k;
    }
    else{
        return rem == -k;
    }
    }  
};
