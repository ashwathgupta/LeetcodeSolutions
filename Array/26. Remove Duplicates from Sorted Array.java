class Solution {
    public int removeDuplicates(int[] nums) {
        
        int len = nums.length;
        
        int arr [] = new int [len];
        int i=0,j=0,k=0;
        arr[k]=nums[0];
        for(i=0;i<len;i++)
        {
            int n= nums[i];

            for(j=i+1;j<len;j++)
            {
                if(nums[j]>n)
                {
                    arr[++k]=nums[j];
                    break;
                }
               
            }
            i=j-1;
        }
       
        for(i=0;i<=k;i++)
        {
            nums[i]=arr[i];
        }
        
        return k+1;
    }
}
