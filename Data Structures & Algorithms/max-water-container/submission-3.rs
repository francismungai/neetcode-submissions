impl Solution {
    pub fn max_area(heights: Vec<i32>) -> i32 {
        let mut left = 0;
        let mut right = heights.len() - 1;
        let mut area = 0;
        let mut max_area = 0;

        while left < right {
            let width = (right - left) as i32;

            match heights[left].cmp(&heights[right]) {
                Ordering::Less | Ordering::Equal => {
                    area = width * heights[left];
                    left += 1;
                },
                Ordering::Greater => {
                    area = width * heights[right];
                    right -= 1;
                },
            }

            max_area = max_area.max(area);
        }

        max_area
    }
}
