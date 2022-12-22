class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        for(char c:s.toCharArray()){
            if(Character.isLetterOrDigit(c)){
                sb.append(c);
            }
        }
        String input = new String(sb.toString().toLowerCase());
        int left = 0,right = input.length() - 1;
        while(left <= right){
            if(input.charAt(left)!=input.charAt(right))
                return false;
            left++;
            right--;
        }
        return true;
    }
}