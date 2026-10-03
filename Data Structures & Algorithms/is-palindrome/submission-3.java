class Solution {
    public boolean isPalindrome(String s) {
        int head = 0;
        int tail = s.length() - 1;

        while(head < tail) {

            while(head < s.length() && !isAlphanumeric(s.charAt(head))) {
                head++;
            }

            while(tail >= 0 && !isAlphanumeric(s.charAt(tail))) {
                tail--;
            }

            // System.out.println(s.charAt(head));
            // System.out.println(s.charAt(tail));

            if(head < s.length() && tail >= 0 &&
                Character.toLowerCase(s.charAt(head)) !=
                Character.toLowerCase(s.charAt(tail))) {
                return false;
            }

            head++;
            tail--;
        }

        return true;
    }

    public boolean isAlphanumeric(char ch) {
        if ((ch >= 'a' && ch <= 'z') ||
            (ch >= 'A' && ch <= 'Z') || 
            (ch >= '0' && ch <= '9')) {
            return true;
        } 

        return false;
    }
}
