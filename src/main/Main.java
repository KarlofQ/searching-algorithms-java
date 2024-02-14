package main;

public class Main {

    public static void main(String[] args) {
        int[] array = {1, 34, 65, 74, 123, 453, 654, 867, 987, 1024, 2782};
        int target = 654;

        //change LinearSearch to any other class you want and see that output is the same
        int index = LinearSearch.search(array, target);

        System.out.println("Linear Search: target is at index " + index);

    }

}