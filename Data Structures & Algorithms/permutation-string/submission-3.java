class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length())
        {
            return false;
        }
        int windowLength=s1.length();
        HashMap<Character,Integer> map=new HashMap();
        HashMap<Character,Integer> windowMap=new HashMap();
        for(char c:s1.toCharArray())
        {
            map.put(c,map.getOrDefault(c,0)+1);
        }
        for(int i=0;i<s2.length();i++)
        {
            char c=s2.charAt(i);
            windowMap.put(c,windowMap.getOrDefault(c,0)+1);
            if(i>=windowLength)
            {
                char leftChar=s2.charAt(i-windowLength);
                windowMap.put(leftChar,windowMap.get(leftChar)-1);
                if(windowMap.get(leftChar)==0)
                {
                    windowMap.remove(leftChar);
                }
            }
            if(map.equals(windowMap))
            {
                return true;
            }
        }
        return false;
        
    }
}
