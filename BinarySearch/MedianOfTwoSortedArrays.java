package BinarySearch;

public class MedianOfTwoSortedArrays {
	public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length + nums2.length;
        if(m % 2 != 0)
            return findKth(nums1, 0, nums2, 0, m / 2 + 1);
        else
            return (findKth(nums1, 0, nums2, 0, m / 2) + findKth(nums1, 0, nums2, 0, m / 2 + 1)) / 2.0;

    }
    public int findKth(int[] nums1, int start1, int[] nums2, int start2, int k){
        if(start1 >= nums1.length)
            return nums2[start2 + k - 1];
        if(start2 >= nums2.length)
            return nums1[start1 + k - 1];
        if(k == 1)
            return Math.min(nums1[start1], nums2[start2]);
        
        int key1 = start1 + k / 2 - 1 < nums1.length ? nums1[start1 + k / 2 - 1] : Integer.MAX_VALUE;
        int key2 = start2 + k / 2 - 1 < nums2.length ? nums2[start2 + k / 2 - 1] : Integer.MAX_VALUE;
        if(key1 < key2)
            return findKth(nums1, start1 + k / 2, nums2, start2, k - k / 2);
        else
            return findKth(nums1, start1, nums2, start2 + k / 2, k - k / 2);
            
    }
    public static void main(String[] args){
    	int[] nums1 = {};
    	int[] nums2 = {2, 3};
    	MedianOfTwoSortedArrays m = new MedianOfTwoSortedArrays();
    	System.out.println(m.findMedianSortedArrays(nums1, nums2));
    }
}
