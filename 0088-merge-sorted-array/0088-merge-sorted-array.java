class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
       int[] arr=new int[n+m];
       int i =0 ,j =0 , k = 0;
       while(i<m && j<n)          
    {
        if(nums1[i]<=nums2[j])
        {
            arr[k++]=nums1[i++];
        }
        else if(nums1[i]>nums2[j]){
            arr[k++]=nums2[j++];
        }
    }
      while(i<m)
      {
         arr[k++]=nums1[i++];
      }
       while(j<n)
      {
         arr[k++]=nums2[j++];
      }
      for(int a=0;a<arr.length;a++)
   {
       nums1[a]=arr[a];
   }
    }
   
}