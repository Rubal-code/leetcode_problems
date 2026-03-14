class Solution {
    public int numberOfBeams(String[] bank) {
        int n=bank.length;
        int prev=0;  // devices in prev valid row
        int beams=0;
        for(int i=0;i<n;i++){
            int count=0;
            for(int j=0;j<bank[i].length();j++){
                if(bank[i].charAt(j)=='1'){
                    count++;
                }
            }
            if(count>0){
                beams+=prev * count;
                prev=count;
            }
        }
        return beams;
    }
}