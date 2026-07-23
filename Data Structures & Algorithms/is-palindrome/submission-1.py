class Solution:
    def isPalindrome(self, s: str) -> bool:
        clean_str = ''.join(ch for ch in s.lower() if ch.isalnum())
        i = 0
        j = len(clean_str) - 1

        while i < j:
            if clean_str[i] != clean_str[j]:
                return False
            i += 1
            j -= 1

        return True
        