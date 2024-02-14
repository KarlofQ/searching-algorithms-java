package main;

public class JumpSearch {

    public static int search(int[] array, int target) {
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

}
