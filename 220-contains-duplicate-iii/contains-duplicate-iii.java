class Solution {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int indexDiff, int valueDiff) {
        if (indexDiff <= 0 || valueDiff < 0) return false;
        TreeSet<Long> set = new TreeSet<>();
        for(int i=0; i< nums.length; i++){
            long curr = nums[i];
            Long floor = set.floor(curr);
            if(floor != null && curr -floor <=valueDiff){
                return true;
            }
            Long ceil = set.ceiling(curr);
            if(ceil !=null && ceil-curr <=valueDiff){
                return true;
            }
            set.add(curr);
            if(i>= indexDiff){
                set.remove((long) nums[i-indexDiff]);
            }
        }
        return false;
    }
}