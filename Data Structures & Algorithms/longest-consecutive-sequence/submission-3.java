class Solution {
    public int longestConsecutive(int[] nums) {
        // [0, 1, 2, 5, 6, 7, 8]

        if(nums.length == 0) return 0;

        Set<Integer> set = new HashSet<>();
        for(int num : nums) {
            set.add(num);
        }

        // System.out.print(set);

        int maxLength = 0;

        for(int num : set) {
            if(!set.contains(num - 1)) {
                int currentNum = num;
                int currentLength = 1;

                while(set.contains(++currentNum)) {
                    currentLength++;
                }

                maxLength = Math.max(maxLength, currentLength);
            }
        }

        return maxLength;
    }
}
