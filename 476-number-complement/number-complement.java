class Solution {
    public int findComplement(int num) {
        int mask = 0;
        int temp = num;

        // Build mask with same number of bits as num
        while (temp > 0) {
            mask = (mask << 1) | 1;
            temp >>= 1;
        }

        return num ^ mask;
    }
}
