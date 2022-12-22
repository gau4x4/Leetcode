class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        int count = 0,sum = 0;

        for(int num:nums){
            sum = (sum + num)%k<0?((sum + num)%k)+k:(sum + num)%k;
            count += map.getOrDefault(sum,0);
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return count;
    }
}