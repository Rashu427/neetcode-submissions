class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap();
        for(int num:nums)
        {
            if(map.containsKey(num))
            {
               int count= map.get(num);
               map.put(num,count+1);
            }
            else
            {
                map.put(num,1);
            }
        }
     ArrayList<Map.Entry<Integer,Integer>> entries   =new ArrayList(map.entrySet());
     entries.sort((a,b) -> b.getValue() - a.getValue());
     int[] result=new int[k];
     for(int i=0;i<k;i++)
     {
        result[i]=entries.get(i).getKey();
     }
     return result;

        
    }
}
