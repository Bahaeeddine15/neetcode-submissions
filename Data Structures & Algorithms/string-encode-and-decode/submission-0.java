class Solution {

    public String encode(List<String> strs) {
        StringBuilder encodedString = new StringBuilder();
        for (String str : strs) {
            // Format: [length][delimiter][string]
        encodedString.append(str.length()).append("#").append(str);
        }
        return encodedString.toString();
    }

    public List<String> decode(String str) {
        List<String> decodedList = new ArrayList<>();
        int i = 0;
        
        while (i < str.length()) {
            // Find the position of the next delimiter
            int j = i;
            while (str.charAt(j) != '#') {
                j++;
            }
            
            // Read the length of the string
            int length = Integer.parseInt(str.substring(i, j));
            
            // Extract the actual string using the length
            int stringStart = j + 1;
            int stringEnd = stringStart + length;
            decodedList.add(str.substring(stringStart, stringEnd));
            
            // Move the pointer to the start of the next encoded string
            i = stringEnd;
        }
        
        return decodedList;
    }
}