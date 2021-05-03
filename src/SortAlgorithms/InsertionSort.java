package SortAlgorithms;

public class InsertionSort {

    public static void main(String[] args) {

        int[] nums = {35, 20, -15, 7, 55, 1, -22};

        for (int firstUnsortedIndex = 1; firstUnsortedIndex < nums.length; firstUnsortedIndex++) {
            int currentElem = nums[firstUnsortedIndex];

            int i;
            for (i = firstUnsortedIndex; i > 0 && nums[i-1] > currentElem; i--) {
                nums[i] = nums[i-1];
            }
            nums[i] = currentElem;
        }

        Utils.printArray(nums);
    }

}
