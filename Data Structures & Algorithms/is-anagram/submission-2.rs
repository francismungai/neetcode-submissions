impl Solution {
    pub fn is_anagram(s: String, t: String) -> bool {
        if s.len() != t.len() {
            return false;
        }

        let mut arr = vec![0; 26];

        for (sc, tc) in s.bytes().zip(t.bytes()) {
            arr[(sc - b'a') as usize] += 1;
            arr[(tc - b'a') as usize] -= 1;
        }

        arr.into_iter().all(|x| x == 0)
    }
}
