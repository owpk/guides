package MultiThreading.future;

import java.util.concurrent.*;

public class FutureTaskDemo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        var executeService = Executors.newFixedThreadPool(4);
        var result = executeService.submit(new MyCallable());
        var result2 = executeService.submit(new MyCallable());
        var result3 = executeService.submit(new MyCallable());
        var result4 = executeService.submit(new MyCallable());
        System.out.println(result.get());
        executeService.shutdown();
    }

    private static class MyCallable implements Callable<String> {

        @Override
        public String call() throws Exception {
            Thread.sleep(2000);
            return Thread.currentThread().getName();
        }
    }
}
