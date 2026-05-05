class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> numbers = new HashSet<>();
        for (int n : nums){
            if(numbers.contains(n)){
                return true;
            }
        numbers.add(n);
        }
        return false;
    }
}