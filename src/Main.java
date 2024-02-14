public class Main {

    public static void main(String[] args) {

        int[] array = {1, 34, 65, 74, 123, 453, 654, 867, 987, 1024, 2782};
        int target = 654;

        int result = ternarySearch(array, target);

        if (result == -1) System.out.println("Element not found");
        else System.out.println("Element found at index " + result);
    }

    static int linearSearch(int[] array, int target) {
        for (int i = 0; i < array.length; i++)
            if (array[i] == target) return i;

        return -1;
    }

    static int binarySearch(int[] array, int target) {
        int low = 0;
        int high = array.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            int actual = array[mid];

            if (actual > target) high = mid - 1;
            else if (actual < target) low = mid + 1;
            else return mid;
        }

        return -1;
    }

    static int interpolationSearch(int[] array, int target) {
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

    static int jumpSearch(int[] array, int target) {
        int n = array.length;
        int start = 0;
        int end = (int) Math.sqrt(n);

        while (array[end] < target && start < end) {
            start = end;
            end += (int) Math.sqrt(n);
            if (end > n - 1) end = n - 1;
        }
        for (int i = start; i <= end; i++) {
            if (array[i] == target) return i;
        }

        return -1;
    }

    static int ternarySearch(int[] array, int target) {
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