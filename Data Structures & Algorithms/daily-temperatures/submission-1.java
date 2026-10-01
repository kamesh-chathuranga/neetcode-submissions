class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] result = new int[temperatures.length];

        for(int i = 0; i < temperatures.length; i++) {
            int days = 0;
            for(int j = i + 1; j < temperatures.length; j++) {
                days++;

                if(temperatures[i] < temperatures[j]) {
                    break;
                }

                if(j == temperatures.length - 1) {
                    days = 0;
                }
            }

            result[i] = days;
        }

        return result;
    }
}
