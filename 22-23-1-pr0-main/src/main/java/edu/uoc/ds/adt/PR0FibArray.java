package edu.uoc.ds.adt;


public class PR0FibArray {

    public final int CAPACITY = 20;

    private int[] array;

    public PR0FibArray() {
        newFibArray();
    }

    public void newFibArray() {
        array = new int[]{0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181};
    }

    public int getIndexOf(int value) {
        for (int i = 0; i < CAPACITY; i++) {
            if (this.array[i] == value) return i;
        }

        return -1;
    }


    public int binarySearch(int value) {
        return recursiveSearch(value, 0, CAPACITY - 1);
    }

    private int recursiveSearch(int value, int left, int right) {
        if (left > right) return -1;

        int mid = (left + right) / 2;
        if (this.array[mid] == value) {
            return mid;
        } else if (value > this.array[mid]) {
            return recursiveSearch(value, mid + 1, right);
        } else {
            return recursiveSearch(value, left, mid - 1);
        }
    }

    public int[] getArray() {
        return this.array;
    }

}
