class Solution 
{
    public boolean containsDuplicate(int[] nums) 
    {
        Set<Integer>duplicate=new HashSet<Integer>();
        for(Integer i:nums)
        {
            if(!duplicate.add(i)) return true;          
        }
        return false;
      
        
        
            
        
    }
}