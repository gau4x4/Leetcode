class Solution {
    public int climbStairs(int n) {
        int step1 = 1, step2 = 1;
        while (n-- > 0)
            step1 = (step2 += step1) - step1;
        return step1;
    }
}

/*
You are climbing a staircase. It takes n steps to reach the top.

Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
*/
