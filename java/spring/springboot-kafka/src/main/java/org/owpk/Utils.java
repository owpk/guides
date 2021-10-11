package org.owpk;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Utils {
    public static <K, V> Map<K, V> combineTwoLists(List<K> keys, List<V> values) {
        return IntStream.range(0, keys.size()).boxed()
                .collect(Collectors.toMap(keys::get, values::get));
    }

    public static <K, V, R> Map<K, R> combineTwoLists(List<K> keys,
                                      List<V> values, Function<V, R> valuesConverter) {
        return IntStream.range(0, keys.size()).boxed()
                .collect(Collectors.toMap(keys::get,
                        i -> valuesConverter.apply(values.get(i))));
    }
}
