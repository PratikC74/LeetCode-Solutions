
class Solution {
    public int minInsertions(String s) {
        int insertions = 0;
        int open = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '(') {
                open++;
            } else {
                // Check whether the next character is ')'
                if (i + 1 < s.length() && s.charAt(i + 1) == ')') {
                    i++;
                } else {
                    insertions++;
                }

                // Match the closing pair with an opening '('
                if (open > 0) {
                    open--;
                } else {
                    insertions++;
                }
            }
        }

        // Each unmatched '(' requires two ')'
        return insertions + 2 * open;
    }
}