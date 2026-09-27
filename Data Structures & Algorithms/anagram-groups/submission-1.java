class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<String> sortedList = new ArrayList<>();
        HashMap<String, Integer> map = new HashMap<>();
        List<List<String>> result = new ArrayList<>();

        for(int i = 0; i < strs.length; i++) {
            char[] charArr = strs[i].toCharArray();
            Arrays.sort(charArr);
            sortedList.add(String.valueOf(charArr));
        }

        // System.out.println(sortedList);

        int k = 0;

        for(int j = 0; j < sortedList.size(); j++) {
            if(map.containsKey(sortedList.get(j))) {
                int index = map.get(sortedList.get(j));
                result.get(index).add(strs[j]);
            } else {
                List<String> list = new ArrayList<>();
                list.add(strs[j]);
                result.add(list);

                map.put(sortedList.get(j), k);
                k++;
            }
        }

        return result;
    }
}
