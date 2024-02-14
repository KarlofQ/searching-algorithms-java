package main;

public class InterpolationSearch {

    public static int search(int[] array, int target) {
        int high = array.length - 1;
        int low = 0;

        while (target >= array[low] && target <= array[high] && low <= high) {
            int probe = low + (high - low) * (target - array[low]) / (array[high] - array[low]);

            if (array[probe] > target) high = probe - 1;
            else if (array[probe] < target) low = probe + 1;
            else return probe;
        }

        return -1;
    }

}
