class Solution {
    public String categorizeBox(int length, int width, int height, int mass) {

        boolean isBulky = false;
        boolean isHeavy = false;

        // Check bulky conditions
        if (length >= 10000 || width >= 10000 || height >= 10000) {
            isBulky = true;
        }

        long volume = (long) length * width * height; // use long to avoid overflow
        if (volume >= 1000000000L) {
            isBulky = true;
        }

        // Check heavy condition
        if (mass >= 100) {
            isHeavy = true;
        }

        // Determine category
        if (isBulky && isHeavy) return "Both";
        if (isBulky) return "Bulky";
        if (isHeavy) return "Heavy";
        return "Neither";
    }
}
