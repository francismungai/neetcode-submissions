class Solution {
    public int trap(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int leftMax = 0;
        int rightMax = 0;
        int water = 0;

        while(left < right) {
            if(height[left] < height[right]) {
                if(height[left] >= leftMax) {
                    leftMax = height[left];
                }
                else {
                    water += leftMax - height[left];
                }

                left++;
            } else {
                if(height[right] >= rightMax) {
                    rightMax = height[right];
                }
                else {
                    water += rightMax - height[right];
                }

                right--;
            }
        }

        return water;
        
    }
}

/*
water can be contained if:
1. There's 0 height between two containers
2. If there's two containers (right - left >= 1) from each other,
and in between, the containers are of smaller height


thinking about it programmatically:
iterate from left and from right:
while(left < right)
    check if next container is shorter:
        if shorter:
            take note of current h
            while next is shorter: 
                localmax = h - height of container
                left++/right--;
            add localmax to globalmax
*/
