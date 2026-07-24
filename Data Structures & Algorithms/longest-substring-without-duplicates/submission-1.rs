use std::collections::HashMap;

impl Solution {
    pub fn length_of_longest_substring(s: String) -> i32 {
        let mut last_seen: HashMap<char, usize> = HashMap::new();
        let mut left = 0;
        let mut max_len = 0;

        for (right, ch) in s.chars().enumerate() {
            if let Some(&prev_index) = last_seen.get(&ch) {
                left = left.max(prev_index + 1);
            }

            last_seen.insert(ch, right);

            let current_len = right - left + 1;
            max_len = max_len.max(current_len);
        }

        max_len as i32
    }
}