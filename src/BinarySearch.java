public class BinarySearch {

    public static int search(int[] array, int target) {
        int low = 0;
        int high = array.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (array[mid] > target) high = mid - 1;
            else if (array[mid] < target) low = mid + 1;
            else return mid;
        }

        return -1;
    }

}
