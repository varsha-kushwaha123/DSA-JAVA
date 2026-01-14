class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer>x1=new HashSet<>();
        ArrayList<Integer>arr=new ArrayList<>();
        for(int i=0;i<nums1.length;i++){
            x1.add(nums1[i]);
        }
        for(int i=0;i<nums2.length;i++){
            if(x1.contains(nums2[i])){
                arr.add(nums2[i]);
                x1.remove(nums2[i]);

            }
        }
      int[] list = new int[arr.size()];
      for (int i = 0; i < arr.size(); i++) {
                list[i] = arr.get(i); // unboxing
            }          

        return list;
        
        
    }
}