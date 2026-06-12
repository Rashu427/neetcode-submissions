class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> map1=new HashMap();
         HashMap<Character,Integer> map2=new HashMap();
         if(s.length()!=t.length())
         {
            return false;
         }

         for(char c:s.toCharArray())
         {
            if(map1.containsKey(c))
            {
                int count=map1.get(c);
                map1.put(c,count+1);
            }
            else
            {
                map1.put(c,1);
            }
         }
         for(char c:t.toCharArray())
         {
            if(map2.containsKey(c))
            {
                int count=map2.get(c);
                map2.put(c,count+1);
            }
            else
            {
                map2.put(c,1);
            }
         }
         if(map1.equals(map2))
         {
            return true;
         }
         else
         {
            return false;
         }

    }
}
