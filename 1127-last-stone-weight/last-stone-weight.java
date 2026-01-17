class Solution {
    public int lastStoneWeight(int[] stones) {

        while (stones.length > 1) {

            // sort array
            java.util.Arrays.sort(stones);

            int n = stones.length;

            int y = stones[n - 1]; // largest
            int x = stones[n - 2]; // second largest

            if (y == x) {
                stones = java.util.Arrays.copyOf(stones, n - 2);
            } else {
                stones[n - 2] = y - x;
                stones = java.util.Arrays.copyOf(stones, n - 1);
            }
        }

        return stones.length == 0 ? 0 : stones[0];
    }
}
