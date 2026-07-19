class Solution {
    public int maxArea(int[] heights) {

        int left =0;
        int right = heights.length-1;

        int maxi = 0;

        while(left<right){
        int bigBar = Math.min(heights[left],heights[right]);
        maxi = Math.max(maxi,bigBar*(right-left));
        
        if(heights[left]>heights[right]){
            right--;
        }else{
            left++;
        }
            
        }

       return maxi;

        
    }
}
