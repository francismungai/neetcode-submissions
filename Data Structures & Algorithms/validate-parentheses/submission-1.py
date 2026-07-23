class Solution:
    def isValid(self, s: str) -> bool:
        stack = []
        pairs = {')': '(', '}': '{', ']': '['}

        for char in s:
            match char:
                case '(' | '{' | '[':
                    stack.append(char)
                case c if c in pairs:
                    if not stack or stack.pop() != pairs[c]:
                        return False 

        return not stack
        