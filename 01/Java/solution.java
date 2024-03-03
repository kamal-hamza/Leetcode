class solution {

    public int[] twoSum(int[] nums, int target) {

        int[] list = {-1};

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    list = new int[] {i, j};
                }
                else {
                    continue;
                }
            }
        }
        return list;
    }

    public static void main(String[] args) {
        solution sol = new solution();
        int[] arr = {2,7,11,15};
        System.out.println(sol.twoSum(arr, 9));
    }

}