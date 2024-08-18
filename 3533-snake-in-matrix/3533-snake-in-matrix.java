class Solution {
    public int finalPositionOfSnake(int n, List<String> commands) {
        int upd= 0;
        for(String inst: commands){
            
            if(inst.equals("DOWN")){
                upd+=n;
            } 
            if(inst.equals("UP")) upd-=n;
            if(inst.equals("LEFT")) upd-=1;
            if(inst.equals("RIGHT")) upd+=1;
        }
        return upd; 
        //(x * gridSize) + y;  
    }
}