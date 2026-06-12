class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> hashmap=new HashMap();
        for(String str:strs)
        {
            char[] chars=str.toCharArray();
            Arrays.sort(chars);
            String key=new String(chars);
            if(!hashmap.containsKey(key))
            {
                hashmap.put(key,new ArrayList());
            }
            hashmap.get(key).add(str);
        }
        return new ArrayList(hashmap.values());
    }
}
