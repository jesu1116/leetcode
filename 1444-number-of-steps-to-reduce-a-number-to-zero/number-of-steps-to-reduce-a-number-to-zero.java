class Solution {
    public int numberOfSteps(int num) {
        int steps = 0;

        while (num > 0) {
            if (num % 2 == 0) {
                num /= 2;   // even
            } else {
                num -= 1;   // odd
            }
            steps++;
        }

        return steps;
    }
}
