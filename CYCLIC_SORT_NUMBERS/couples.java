class Solution {
    public int minSwapsCouples(int[] row) {
        int n=row.length;
        int swaps=0;
        int[] pos=new int[n];
        for(int i=0;i<n;i++){
            pos[row[i]]=i;// pos[person]=seat;
        }
        for(int i=0;i<n;i+=2){
            int first=row[i];
            int partner =first^1;
            if(row[i+1]!=partner){
                swaps++;
                int partnerIndex=pos[partner];

                int temp=row[i+1];
                row[i+1]=row[partnerIndex];
                row[partnerIndex]=temp;

                pos[temp]=partnerIndex;
                pos[partner]=i+1;
            }
        }
        return swaps;
    }
}