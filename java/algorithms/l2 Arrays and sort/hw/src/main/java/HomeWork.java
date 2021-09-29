import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class HomeWork {

    private static Integer[] getRandomArray() {
        Random random = new Random();
        Integer[] arr = new Integer[100_000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000);
        }
        return arr;
    }

    private static Map<String, Runnable> algorithms = new HashMap<>();

    static {
        algorithms.put("Selection Sort", () -> new Array<>(getRandomArray()).sortSelect());
        algorithms.put("Bubble Sort",() -> new Array<>(getRandomArray()).sortBubble());
        algorithms.put("Insertion Sort",() -> new Array<>(getRandomArray()).sortInsert());
    }

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        algorithms.forEach((k,v) -> executorService.execute(measure(v, k)));
        executorService.shutdown();
    }

    private static Runnable measure(Runnable runnable, String algorithmName) {
        return () -> {
            long start = System.currentTimeMillis();
            runnable.run();
            System.out.println(algorithmName + " : " + (System.currentTimeMillis() - start));
        };
    }

}
