class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map = new HashMap<>();
        for(int i = 0; i<strs.length;i++){
            char[] strChar = strs[i].toCharArray();
            Arrays.sort(strChar);
            String sortedStr = new String(strChar);
            map.computeIfAbsent(sortedStr, k -> new ArrayList<>()).add(strs[i]);
        }
        return new ArrayList<>(map.values());
    }
}
