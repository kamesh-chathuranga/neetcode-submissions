class Solution {
    public boolean isPalindrome(String s) {
        String text = toAlphanumeric(s);

        int head = 0;
        int tail = text.length() - 1;

        while(head <= tail) {
            if(text.charAt(head) != text.charAt(tail)) {
                return false;
            }

            head++;
            tail--;
        }

        return true;
    }

    public String toAlphanumeric(String input) {
        if (input == null) return "";

        StringBuilder sb = new StringBuilder(input.length());
        for (char c : input.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                sb.append(c);
            }
        }
        return sb.toString().toLowerCase();
    }
}
