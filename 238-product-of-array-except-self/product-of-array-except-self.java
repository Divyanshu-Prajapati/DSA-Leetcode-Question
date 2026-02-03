class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int arr[]=new int[n];
        int product=1;
        //find the product
        for(int i=0;i<n;i++){
            if(nums[i]==0){
                continue;
            }
            product=product*nums[i];
        }
        //now count 
        int zero=0;
        for(int i=0;i<n;i++){
            if(nums[i]==0){
                zero++;
            }
        }
        if(zero==1){
            for(int i=0;i<n;i++){
                if(nums[i]==0){
                    arr[i]=product;
                }
                else{
                    arr[i]=0;
                }
            }
        }
        else if(zero<1){
            for(int i=0;i<n;i++){
                arr[i]=product/nums[i];
            }
            
        }
        else{
            for(int i=0;i<n;i++){
                arr[i]=0;
            }
        }
        return arr;

    }
}