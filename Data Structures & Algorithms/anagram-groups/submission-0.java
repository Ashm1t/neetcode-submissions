class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String s : strs)
        {
          // convert to char array and sort
            char[] arr = s.toCharArray();
            Arrays.sort(arr);
          // create key
            String key = new String(arr);
        
            // add to map
            map.computeIfAbsent(key, k -> new ArrayList<>()).add(s);
        }return new ArrayList<>(map.values());
    }  
}
