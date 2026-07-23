class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> groups = new HashMap<>();
        for (String s: strs) {
            int[] count = new int[26];

            for(int i= 0; i < s.length(); i++) {
                count[s.charAt(i) -'a']++;
            }

            String key = Arrays.toString(count);
            groups.computeIfAbsent(key, k -> new ArrayList<String>()).add(s);
        }
         return new ArrayList<>(groups.values());
    }
}
