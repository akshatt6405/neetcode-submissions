class Solution {
    public int maxArea(int[] heights) {
        
        int s=0;
        int e=heights.length-1;
        int max=0;

        while(s<=e){
            max=Math.max(Math.min(heights[e],heights[s])*(e-s),max);   
           if(heights[s]>=heights[e]){
            e--;
           }else{
            s++;
           }
        }

        return max;
    }
}
