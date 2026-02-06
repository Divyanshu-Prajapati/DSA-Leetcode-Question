class Solution {
    
    public int totalFruit(int[] arr) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int l=0,r=0;
        int max=0;
        int k=2;
        int n=arr.length;
        while(r<n){
            map.put(arr[r],map.getOrDefault(arr[r],0)+1);
            while(map.size()>k){
                int fr=map.get(arr[l]);
                fr--;
                if(fr==0){
                    map.remove(arr[l]);
                }
                else{
                     map.put(arr[l],fr);
                }
                l++;           
            }
            if(map.size()<=k){
                max=Math.max(max,r-l+1);
            }
            r++;
        }
        return max;



        
    }
}