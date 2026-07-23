class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for (String s : strs) {
            sb.append(s.length()).append(':').append(s);
        }
        return Base64.getEncoder()
                     .encodeToString(sb.toString().getBytes());
    }

    public List<String> decode(String str) {
        String raw = new String(Base64.getDecoder().decode(str));
        List<String> result = new ArrayList<>();
        int i = 0;
        while (i < raw.length()) {
            int colon = raw.indexOf(':', i);
            int len = Integer.parseInt(raw.substring(i, colon));
            i = colon + 1;
            result.add(raw.substring(i, i + len));
            i += len;
        }
        return result;
    }
}
