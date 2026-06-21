class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        Arrays.sort(nums);
        List<List<Integer>> al = new ArrayList<>();

        int len = nums.length;
        
        int i=0;

        while(i<len-2){
          
           int left=i+1;
           int right = len-1;
          

           while(left<right){
           int sum = nums[i]+nums[left]+nums[right];

           if(sum==0){

               List<Integer> l = new ArrayList<>();
               l.add(nums[i]);
               l.add(nums[left]);
               l.add(nums[right]);

               if(!al.contains(l))
               al.add(l);

               left++;
               right--;
           }
           
           else if (sum > 0){
               right--;
           }

           else {

            left++;
           }
        }
           i++;
        }

        return al;
        
    }
}
