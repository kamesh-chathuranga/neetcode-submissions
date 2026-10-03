class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);

        // [-4, -1, -1, 0, 1, 2]

        int i = 0;

        while(i < nums.length - 2) {
            int target = 0 - nums[i];
            int j = i + 1;
            int k = nums.length - 1;

            // System.out.println(target);

            while(j < k) {
                // System.out.println("j -> " + nums[j]);
                // System.out.println("k -> " + nums[k]);
                
                if(nums[j] + nums[k] < target) {
                    j++;
                } else if(nums[j] + nums[k] > target) {
                    k--;
                } else {
                    List ans = List.of(nums[i], nums[j], nums[k]);
                    if(!list.contains(ans)) {
                        list.add(ans);
                    }

                    j++;
                    k--;
                }
            }

            i++;
        }

        return list;
    }
}
