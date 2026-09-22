class Solution:
    def areNumbersAscending(self, s: str) -> bool:
        prev = float('-inf')
        for t in s.split():
            if t[0] >= '0' and t[0] <= '9':
                x = int(t)
                if x <= prev:
                    return False
                else:
                    prev = x
                    
        return True
