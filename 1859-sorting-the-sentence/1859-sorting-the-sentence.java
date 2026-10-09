class Solution {
    public String sortSentence(String s) {
        String[] words = s.split(" ");
        String[] ans = new String[words.length];

        for(String word : words){
            int position = word.charAt(word.length()-1)-'0';
            String actualWord = word.substring(0,word.length()-1);
            ans[position - 1] = actualWord;
        }
        return String.join(" ",ans);
    }
}