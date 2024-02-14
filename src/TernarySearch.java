public class TernarySearch {

    public static int search(int[] array, int target) {
        int high = array.length;
        int low = 0;
        while (low <= high) {
            int mid1 = low + (high - low) / 3;
            int mid2 = high - (high - low) / 3;

            if (array[mid1] == target) return mid1;
            else if (array[mid2] == target) return mid2;
            if (target < array[mid1]) high = mid1 - 1;
            else if (target > array[mid2]) low = mid2 + 1;
            else {
                low = mid1 + 1;
                high = mid2 - 1;
            }
        }

        return -1;
    }

}
