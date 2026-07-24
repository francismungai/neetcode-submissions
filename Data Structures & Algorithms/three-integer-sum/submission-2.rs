impl Solution {
    pub fn three_sum(mut 
    nums: Vec<i32>) -> Vec<Vec<i32>> {
        let mut res = Vec::new();

        nums.sort_unstable();

        for i in 0..nums.len() {
            if nums[i] > 0 {
                break;
            }

            if i > 0 && nums[i] == nums[i-1] {
                continue;
            }

            let mut left = i + 1;
            let mut right = nums.len() - 1;

            while left < right {
                let sum = nums[i] + nums[left] + nums[right];

                match sum.cmp(&0) {
                    Ordering::Greater => right -= 1,
                    Ordering::Less => left += 1,
                    Ordering::Equal => {
                        res.push(vec![nums[i], nums[left], nums[right]]);

                        left += 1;

                        while left < right && nums[left] == nums[left - 1] {
                            left += 1;
                        }
                    }
                }
            }
        }

        res

    }
}
