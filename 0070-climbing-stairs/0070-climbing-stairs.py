class Solution:
    def climbStairs(self, n: int) -> int:
        two = 1
        one = 1

        for i in range(n-1):
            two,one = one + two,two

        return two