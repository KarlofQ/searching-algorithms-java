public class Main {

    public static void main(String[] args) {

        int[] array = {1, 34, 65, 74, 123, 453, 654, 867, 987, 1024, 2782};
        int target = 654;

        int result = interpolationSearch(array, target);

        if (result == -1) System.out.println("Element not found");
        else System.out.println("Element found at index: " + result);
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

}