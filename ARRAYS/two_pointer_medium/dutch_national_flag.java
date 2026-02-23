class Solution {                                //this problem is also known as dutch national flag problem  
    public void sortColors(int[] nums) {
        int low=0;
        int mid=0;
        int high=nums.length-1;       

        while(mid<=high){
            if(nums[mid]==0){  //je mid 0 hunda hai te fer tuhi low te mid nu swap karna hai te nalle dovan nu increment karna hai
            swap(nums,low,mid);// we here swap mid with low
            low++;
            mid++;
            }
            else if(nums[mid]==1){  //je 1 hunda te bas mid nu increment hi karo jiiii 
                mid++;
            }
            else {                  //je mid 2 ho janda te tuhi high te mid nu swap karna hai te nallen bas high nu hi decremnet karna hai
                swap(nums,high,mid);
                high--;
            }
        }
    }    
        public void swap(int nums[],int i,int j){
            int k=nums[i];
            nums[i]=nums[j];
            nums[j]=k;
        }
}
