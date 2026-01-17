import java.util.*;

class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        int max = 0;

        // find maximum candies
        for (int c : candies) {
            if (c > max)
                max = c;
        }

        List<Boolean> result = new ArrayList<>();

        // check each kid
        for (int i = 0; i < candies.length; i++) {
            result.add(candies[i] + extraCandies >= max);
        }

        return result;
    }
}
