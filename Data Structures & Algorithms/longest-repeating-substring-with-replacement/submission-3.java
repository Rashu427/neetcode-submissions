class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character,Integer> map=new HashMap();
        int left=0;
        int maxFreq=0;
        int maxLength=0;
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            map.put(c,map.getOrDefault(c,0)+1);
            maxFreq=Math.max(maxFreq,map.get(c));
            while((i-left+1)-maxFreq>k)
            {
                 
                char ch = s.charAt(left);
                map.put(ch,map.get(ch)-1);

                left++;
            }
            maxLength=Math.max(i-left+1,maxLength);
        }
        return maxLength;
    }
}
