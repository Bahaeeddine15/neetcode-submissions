class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int n = numbers.length;
        int left = 0;
        int right = n - 1;
        
        while (left < right) {
            int currentSum = numbers[left] + numbers[right];
            
            if (currentSum == target) {
                // Dès qu'on trouve, on retourne immédiatement le tableau (1-indexed)
                return new int[] { left + 1, right + 1 };
            } else if (currentSum > target) {
                // La somme est trop grande, on réduit le pointeur de droite
                right--;
            } else {
                // La somme est trop petite, on augmente le pointeur de gauche
                left++;
            }
        }
        
        return new int[2]; // Sécurité (le problème garantit qu'une solution existe toujours)
    }
}
