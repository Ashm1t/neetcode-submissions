class Solution {
    public boolean isAnagram(String s, String t) {
      if (s.length() != t.length()) return false;
      List<Character> lr = new ArrayList<>(); 
      List<Character> lr2 = new ArrayList<>();
      for (int i=0 ; i<s.length() ; i++)
      {
        lr.add(s.charAt(i));
        lr2.add(t.charAt(i));
      }
      Collections.sort(lr);
      Collections.sort(lr2);
      int count = 0; 
      for(int i=0; i<lr.size() ; i++)
      {
        if (lr.get(i).equals(lr2.get(i)))
        count++;

      }
      if (count==lr.size())
      return true; 
      else 
      return false;
    }
}
