class Solution:

    def encode(self, strs: List[str]) -> str:
        new_str = ""
        for string in strs:
            new_str += str(len(string)) + "#" + string
        return new_str

    def decode(self, s: str) -> List[str]:
        res = []

        i = 0
        while i < len(s):
            j = i
            while s[j] != '#':
                j += 1

            length = int(s[i:j])
            i = j + 1
            res.append(s[i:length + i])
            i += length

        return res


