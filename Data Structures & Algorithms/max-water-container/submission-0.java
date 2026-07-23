class Solution {
    public int maxArea(int[] heights) {
        int left = 0;
        int right = heights.length - 1;
        int max = 0;

        while(left < right) {
            int currentMax = (right - left) * Math.min(heights[left], heights[right]);
            max = Math.max(max, currentMax);

            if(heights[left] < heights[right]) left++;
            else right--;
        }

        return max;        
    }
}

/*
We are looking for a combination of the height and index

so we start at both ends and we compare: 
(right - left) * max(h[left], h[right])

the only thing we can control here is index. So we move have to move to index with highest next
*/
