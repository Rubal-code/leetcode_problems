class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int currenttank=0;
        int totaltank=0;
        int start=0;
        
        for (int i=0;i<gas.length;i++){
            int gain=gas[i]-cost[i];
            totaltank+=gain;
            currenttank+=gain;

            //if we fail here
            if(currenttank< 0){
                start=i+1;//move start forward
                currenttank=0;//reset tank

            }
        }
        return totaltank>=0 ? start : -1;
    }
}