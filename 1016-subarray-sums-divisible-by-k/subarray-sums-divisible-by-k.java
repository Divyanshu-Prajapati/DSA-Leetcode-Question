class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int sum=0;
        int count=0;
        map.put(0,1);
        for(int i=0;i<nums.length;i++){
            sum=sum+nums[i];
            int req=(sum%k);
            if(req<0){
                req=req+k;
            }
            if(map.containsKey(req)){
                int fr=map.get(req);
                count=count+fr;
                fr++;
                map.put(req,fr);
            
            }
            else{
                map.put(req,1);
            }
        }
        return count;
    }
}