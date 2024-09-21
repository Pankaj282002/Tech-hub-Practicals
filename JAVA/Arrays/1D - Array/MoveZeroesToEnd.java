public class MoveZeroesToEnd {
    public static void main(String[] args) {
        int[] nums = {2, 5, 7, 0, 4, 0, 7, -5, 8, 0};

        System.out.println("The given array is: ");
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();
        moveZeroes(nums);
        System.out.println("The new array is: ");
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
    public static void moveZeroes(int[] nums) {
        int lastNonZeroIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[lastNonZeroIndex] = nums[i];
                lastNonZeroIndex++;
            }
        }
        // Fill the remaining elements with zeros
        for (int i = lastNonZeroIndex; i < nums.length; i++) {
            nums[i] = 0;
        }
    }
}