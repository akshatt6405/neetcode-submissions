class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

     Arrays.sort(nums);
     
     
     List <List<Integer>> ans=new ArrayList<>();
     HashSet <List <Integer>> set=new HashSet<>();

     for(int i=0;i<nums.length;i++){

        int j=i+1;
        int k=nums.length-1;
       
        while(j<k){
            int sum=nums[i]+nums[j]+nums[k];
            if (sum == 0) {

                    List<Integer> ans2 = new ArrayList<>();

                    ans2.add(nums[i]);
                    ans2.add(nums[j]);
                    ans2.add(nums[k]);

                    if (!set.contains(ans2)) {
                        set.add(ans2);
                        ans.add(ans2);
                    }
                    j++;
                    k--;
            }

             else if(sum>0){
                k--;
            }
            else{
                j++;
            }
        }

     }

     return ans;

    }
}
