package SortAlgorithms;

public class Utils {

    public static void swap(int[] intArray, int i, int j) {
        if(i == j)
            return;

        int temp = intArray[i];
        intArray[i] = intArray[j];
        intArray[j] = temp;
    }

    public static void printArray(int[] array) {
        for(int i = 0; i <= array.length-1; i++)
            System.out.println(array[i]);
    }
}
