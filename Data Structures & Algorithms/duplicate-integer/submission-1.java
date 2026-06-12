class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet hashset=new HashSet();
        for(int num:nums)
        {
            if(hashset.contains(num))
            {
                return true;
            }
            hashset.add(num);
        }
        return false;
        
    }
}