class Solution {
    public int romanToInt(String s) {
        Map<Character,Integer> symbols =  Map.of(
        'I', 1,
        'V', 5,
        'X', 10,
        'L', 50,
        'C', 100,
        'D', 500,
        'M', 1000
        );
   
    int result = 0;

    for (int i=0; i < s.length()-1; i++){
        int cur = symbols.get(s.charAt(i));
        int next = symbols.get(s.charAt(i+1));

        if (cur < next){
            result -= cur;
        } else {
            result += cur;
        }
    }

    return result+symbols.get(s.charAt(s.length()-1)); 
    }
}