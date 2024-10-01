public class DoubleAndShiftZeros {
    public static void main(String[] args) {
        int[] nums = {0, 3, 3, 3, 0, 0, 7, 7, 0, 9};

        System.out.println("The given array is: ");
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();
        doubleAndShiftZeros(nums);
        System.out.println("The new array is: ");
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
    public static void doubleAndShiftZeros(int[] nums) {
        int lastNonZeroIndex = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                nums[i - 1] *= 2;
                nums[i] = 0;
            }
            if (nums[i] != 0) {
                nums[lastNonZeroIndex] = nums[i];
                lastNonZeroIndex++;
            }
        }
        for (int i = lastNonZeroIndex; i < nums.length; i++) {
            nums[i] = 0;
        }
    }
}