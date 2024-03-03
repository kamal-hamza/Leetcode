import java.util.Arrays;

class solution {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int l1 = nums1.length;
        int l2 = nums2.length;
        double median = 0.0;

        int l3 = l1 + l2;

        int[] nums = new int[l3];

        System.arraycopy(nums1, 0, nums, 0, l1);
        System.arraycopy(nums2, 0, nums, l1, l2);

        Arrays.sort(nums);

        System.out.print(Arrays.toString(nums));

        if (l3 % 2 == 0) {
            median = (double)(nums[l3 / 2] + nums[(l3 / 2) - 1]) / 2;
        }
        else if (l3 % 2 == 1) {
            median = nums[l3 / 2];
        }
        else {
            median = 0.0;
        }

        return median;
    }

    public static void main(String [] args) {
        solution sol = new solution();
        int[] nums1 = new int[] {1, 2};
        int[] nums2 = new int[] {3, 4};
        sol.findMedianSortedArrays(nums1, nums2);
    }

}