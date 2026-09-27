class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;

        Map<Character, Integer> sInput = new HashMap<>();
        Map<Character, Integer> tInput = new HashMap<>();

        for(char c : s.toCharArray()) {
            if(sInput.containsKey(c)) {
                int counter = sInput.get(c);
                sInput.put(c, ++counter);
            } else {
                sInput.put(c, 1);
            }
        }

        for(char c : t.toCharArray()) {
            if(tInput.containsKey(c)) {
                int counter = tInput.get(c);
                tInput.put(c, ++counter);
            } else {
                tInput.put(c, 1);
            }
        }

        System.out.println(sInput);
        System.out.println(tInput);

        return sInput.equals(tInput);
    }
}
