impl Solution {
    pub fn is_palindrome(s: String) -> bool {
        let mut start = 0;
        let mut end = s.len() - 1;

        let chars: Vec<char> = s.chars().collect();

        while start < end {
            let start_char = chars[start];
            let end_char = chars[end];

            if !start_char.is_alphanumeric() {
                start += 1;
                continue;
            }
            if !end_char.is_alphanumeric() {
                end -= 1;
                continue;
            }

            if start_char.to_ascii_lowercase() != end_char.to_ascii_lowercase() {
                return false;
            }

            start += 1;
            end -= 1;
        }

        true
    }
}
