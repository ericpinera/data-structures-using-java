package SortAlgorithms;

public class SelectionSort {

    public static void main(String[] args) {

        int[] nums = {20, 35, -15, 7, 55, 1, -22};

        for (int lastUnsortedIndex = nums.length -1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
            int largest = 0;

            for (int i = 1; i <= lastUnsortedIndex; i++) {
                if(nums[i] > nums[largest]){
                    largest = i;
                }
            }
            Utils.swap(nums, largest, lastUnsortedIndex);
        }
        Utils.printArray(nums);
    }
}
