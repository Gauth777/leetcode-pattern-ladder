class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int ans = 0;
        for(int candy:candies) {
            ans = Math.max(ans, candy);
        }
        List<Boolean> result = new ArrayList<>();
        for(int candy:candies) {
            if(candy + extraCandies >= ans) {
                result.add(true);
            } else {
                result.add(false);
            }
        }
        return result;
    }
}