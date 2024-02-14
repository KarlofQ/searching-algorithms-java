public class Main {

    public static void main(String[] args) {
        int[] array = {1, 34, 65, 74, 123, 453, 654, 867, 987, 1024, 2782};
        int target = 654;

        System.out.println("Linear Search: target is at index " + LinearSearch.search(array, target));
        System.out.println("Binary Search: target is at index " + BinarySearch.search(array, target));
        System.out.println("Interpolation Search: target is at index " + InterpolationSearch.search(array, target));
        System.out.println("Jump Search: target is at index " + JumpSearch.search(array, target));
        System.out.println("Ternary Search: target is at index " + TernarySearch.search(array, target));
        System.out.println("Exponential Search: target is at index " + ExponentialSearch.search(array, target));
    }

}