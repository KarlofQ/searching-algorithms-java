public class ExponentialSearch {

    public static int search(int[] array, int target) {
        if (array[0] == target) return 0;

        int i = 1;
        while (i < array.length && array[i] <= target) i *= 2;

        return BinarySearch.search(array, target);

    }

}
