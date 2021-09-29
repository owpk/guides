import java.util.Arrays;

public class Array<E extends Comparable<? super E>> {

    private final int CAPACITY = 10;
    private E[] arr;
    private int size;

    public Array() {
        arr = (E[]) new Comparable[CAPACITY];
        size = arr.length;
    }

    public Array(E[] arr) {
        this.arr = arr;
        size = arr.length;
    }

    public void delete(E element) {
        int index = binarySearch(element);
        if (index != -1) {
            E[] result = (E[]) new Comparable[arr.length - 1];
            System.arraycopy(arr, 0, result, 0, index);
            System.arraycopy(arr, index, result, index - 1, arr.length - index);
            System.out.println(Arrays.toString(result));
            arr = result;
        }
    }

    public void add(E element, int insertionIndex) {
        E[] result = (E[]) new Comparable[arr.length + 1];
        result[insertionIndex] = element;
        System.arraycopy(arr, 0, result, 0, insertionIndex);
        System.arraycopy(arr, insertionIndex, result, insertionIndex + 1, arr.length - insertionIndex);
        System.out.println(Arrays.toString(result));
        arr = result;
    }

    public void find(E element) {
        int index = binarySearch(element);
        if (index != -1) {
            System.out.println(arr[index]);
        }
    }

    private int binarySearch(E element) {
        int length = arr.length - 1;
        int i = 0;

        while (i <= length) {
            int res = (i + length) / 2;
            if (arr[res] == element)
                return res;
            else if (element.compareTo(arr[res]) > 0)
                i = res + 1;
            else if (element.compareTo(arr[res]) < 0)
                length = res - 1;
        }
        System.out.println("element not found");
        return -1;
    }

    public void sortBubble() {
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - 1 - i; j++) {
                if (arr[j].compareTo(arr[j + 1]) > 0) {
                    swap(j, j + 1);
                }
            }
        }
    }

    private void swap(int indexA, int indexB) {
        E temp = arr[indexA];
        arr[indexA] = arr[indexB];
        arr[indexB] = temp;
    }

    public void sortSelect() {
        for (int i = 0; i < size - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < size; j++) {
                if (arr[j].compareTo(arr[minIndex]) < 0) {
                    minIndex = j;
                }
            }
            swap(minIndex, i);
        }
    }

    public void sortInsert() {
        for (int i = 1; i < size; i++) {
            E temp = arr[i];
            int in = i;
            while (in > 0 && arr[in - 1].compareTo(temp) >= 0) {
                arr[in] = arr[in - 1];
                in--;
            }
            arr[in] = temp;
        }
    }
}
