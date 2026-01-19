class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int n=rooms.size();
        boolean[] isvis=new boolean[n];
        Queue<Integer> q=new LinkedList<>();
        for(int x:rooms.get(0)){
            q.offer(x);
        }
        isvis[0]=true;
        while(q.size()>0){
            int front=q.remove();
            if(isvis[front]!=true){
               for(int x:rooms.get(front)){
                q.offer(x);
                }
            }
            isvis[front]=true;  
        }
        for(int i=0;i<isvis.length;i++){
            if(isvis[i]!=true){
                return false;
            }
        }
        return true;
    }
}