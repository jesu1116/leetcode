class Solution {
    public int nthSuperUglyNumber(int n, int[] primes) {

        int k = primes.length;

        int[] index = new int[k];
        long[] ugly = new long[n];

        ugly[0] = 1;

        for (int i = 1; i < n; i++) {

            long next = Long.MAX_VALUE;

            for (int j = 0; j < k; j++) {
                next = Math.min(next, ugly[index[j]] * primes[j]);
            }

            ugly[i] = next;

            for (int j = 0; j < k; j++) {
                if (ugly[index[j]] * primes[j] == next) {
                    index[j]++;
                }
            }
        }

        return (int) ugly[n - 1];
    }
}
