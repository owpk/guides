package Algorithms.sorting;

import Algorithms.sorting.algs.AlgorithmFactory;
import Algorithms.sorting.algs.SortAlgorithm;

import java.util.*;
import java.util.concurrent.Executors;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class Sort {
    private static final int BOUND = 100_000;

    public static void main(String[] args) {
        var random = new Random();
        Integer[] testArr = new Integer[BOUND];
        fill(testArr, () -> random.nextInt(100));

//        List<Integer> list = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9));
//        Collections.shuffle(list);
//        Integer[] orig = new Integer[list.size()];
//        for (int i = 0; i < list.size(); i++) {
//            orig[i] = list.get(i);
//        }

        testAllAlgorithms(testArr);
//        testAlgorithm("merge", orig);
    }


    public static <T extends Comparable<T>> void testAlgorithm(String algorithmName, T[] arr) {
        var algorithmFactory = new AlgorithmFactory<T>();
        var algo = algorithmFactory.getAlgorithm(algorithmName, arr);
        var sorted = algo.sort();
        System.out.println("Test passed: " + arraysAreEqual(arr, sorted));
        System.out.println("ORIGIN:");
        print(arr);
        System.out.println("--------------------------");
        System.out.println("SORTED:");
        print(sorted);
    }

    public static <T extends Comparable<T>> void testAllAlgorithms(T[] arr) {
        var executor = Executors
                .newFixedThreadPool(Runtime.getRuntime().availableProcessors());
        AlgorithmFactory<T> algorithmFactory = new AlgorithmFactory<>();
        algorithmFactory.getMap().forEach((k, v) ->
                executor.execute(() -> {
                    var algo = v.apply(arr);
                    long time = measure(algo);
                    System.out.println("Algorithm: " + algo.getName() + ", Time: " + time +
                            ", Test passed: " + arraysAreEqual(arr, algo.getSorted()));
        }));
        executor.shutdown();
    }

    public static<T extends Comparable<T>> long measure(SortAlgorithm<T> algorithm) {
        long start = System.currentTimeMillis();
        algorithm.sort();
        long end = System.currentTimeMillis();
        return end - start;
    }

    public static<T> void print(T[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length - 1; i++) {
            System.out.print(arr[i]);
            System.out.print(", ");
        }
        System.out.println(arr[arr.length -1] + "]");
    }

    public static <T extends Comparable<T>> boolean arraysAreEqual(T[] arr1, T[] arr2) {
        Function<T[], Map<T, Long>> func = x ->
                Arrays.stream(x).collect(Collectors.groupingBy(a -> a, Collectors.counting()));
        var res2 = func.apply(arr2);
        return func.apply(arr1).entrySet().stream()
                .allMatch(e -> e.getValue().equals(res2.get(e.getKey())));
    }

    public static <T extends Comparable<T>> void fill(T[] arr, Supplier<T> supplier) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = supplier.get();
        }
    }
}
