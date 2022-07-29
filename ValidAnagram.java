class Solution {
    public boolean isAnagram(String s, String t) {
        
        char[] str1 = s.toCharArray();
        char[] str2 = t.toCharArray();
        Arrays.sort(str1);
        Arrays.sort(str2);
        return Arrays.equals(str1,str2)?true:false;
    }
}
/*
Given two strings s and t, return true if t is an anagram of s, and false otherwise.

An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.
*/
class Solution {
    public boolean isAnagram(String s, String t) {
//         HashMap<Character, Integer> hMap= new HashMap<>();
        
//         for(int i=0;i<s.length();i++){
//             if(hMap.containsKey(s.charAt(i))){
//                 hMap.put(s.charAt(i),hMap.get(s.charAt(i))+1);
            
//             }
//             else{
//                 hMap.put(s.charAt(i),1);
//             }
//         }
//         for(int i=0;i<t.length();i++){
//             if(hMap.containsKey(t.charAt(i))){
//                 hMap.put(t.charAt(i),hMap.get(t.charAt(i))-1);
            
//             }
//             else{
//                 return false;
//             }
//         }
//         for (Map.Entry<Character, Integer> entry : hMap.entrySet()){
//             if(entry.getValue()!=0){
//                 return false;
//             }
//         }
//         return true;
        
        if(s.length()!=t.length()){
            return false;
        }
        int[] interim = new int[26];
        for (int i = 0; i < s.length(); i++) {
            interim[s.charAt(i) - 'a']++;
            interim[t.charAt(i) - 'a']--;
        }
        
        for (int i : interim) {
            if (i != 0) return false;
        }
        return true;
            
        
    }
}
