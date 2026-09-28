class Solution {
    public int longestConsecutive(int[] nums) {
        int length = 0;
        if(nums.length == 0) return length;

        int min = Integer.MAX_VALUE;
        Set<Integer> set = new TreeSet<>();

        for(int num : nums) {
            set.add(num);
            if(min > num) {
                min = num;
            }
        }

        List<Integer> res = new ArrayList<>();
        length++;

        // [0, 1, 2, 5, 6, 7, 8]

        for(int num : set) {
            if(set.contains(num + 1)) {
                length++;
            } else {
                res.add(length);
                length = 1;
            }
        }

        int maxLength = Integer.MIN_VALUE;
        for(int num : res) {
            if(num > maxLength) {
                maxLength = num;
            }
        }

        return maxLength;
    }
}
