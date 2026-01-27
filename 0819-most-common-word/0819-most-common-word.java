class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {

       
        paragraph = paragraph.toLowerCase().replaceAll("[^a-z]", " ");
        String[] words = paragraph.split("\\s+");

       
        HashSet<String> bannedSet = new HashSet<>();
        for (String word : banned) {
            bannedSet.add(word);
        }

  
        HashMap<String, Integer> freqMap = new HashMap<>();
        String result = "";
        int maxCount = 0;

        for (String word : words) {
            if (word.length() == 0 || bannedSet.contains(word)) {
                continue;
            }

            freqMap.put(word, freqMap.getOrDefault(word, 0) + 1);

            if (freqMap.get(word) > maxCount) {
                maxCount = freqMap.get(word);
                result = word;
            }
        }

        return result;
    }
}