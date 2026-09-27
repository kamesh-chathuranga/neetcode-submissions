class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++) {
            if(map.containsKey(nums[i])) {
                int counter = map.get(nums[i]);
                map.put(nums[i], ++counter);
            } else {
                map.put(nums[i], 1);
            }
        }

        // System.out.print(map);

        int j = 0;
        int index = 0;
        Set<Integer> keySet = map.keySet();
        int[] result = new int[k];

        while(j < k) {
            int maxVal = Integer.MIN_VALUE;
            int maxKey = -1;

            for(Integer key: keySet){
                if(maxVal < map.get(key)) {
                    maxVal = map.get(key);
                    maxKey = key;
                    
                }
            }

            result[index++] = maxKey;
            j++;
            keySet.remove(maxKey);
        }

        return result;
    }
}
